package cars;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Getter
public class Cars extends ICars {
	private static ObjectMapper objectMapper;
	private static List<Car> cars = new CopyOnWriteArrayList<>();
	private static Cars instance;
	private static final CarType[] carTypes = new CarType[] { //
			Audi.builder()
				.color( Color.GREEN )
				.fuelType( FuelType.PETROL )
				.maxSpeed( 320 )
				.price( 14500000d )
				.typeName( "A6" )
				.build(),
			Audi.builder()
				.color( Color.BLUE )
				.fuelType( FuelType.DIESEL )
				.maxSpeed( 350 )
				.price( 16250000d )
				.typeName( "A7" )
				.build(),
			Ford.builder()
				.color( Color.RED )
				.fuelType( FuelType.ELECTRIC )
				.maxSpeed( 210 )
				.price( 12450000d )
				.typeName( "Focus" )
				.build(),
			Bmw.builder()
				.color( Color.BLUE )
				.fuelType( FuelType.DIESEL )
				.maxSpeed( 310 )
				.price( 20130000d )
				.typeName( "X5" )
				.build(),
			Bmw.builder()
				.color( Color.GREEN )
				.fuelType( FuelType.PETROL )
				.maxSpeed( 250 )
				.price( 17530000d )
				.typeName( "M8" )
				.build(),

	};
	static {
		try {
			objectMapper = new ObjectMapper();
			objectMapper.setDateFormat( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSX" ) );

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	// private synchronized void initCars( ) throws Exception {

	// }

	public Cars( ) throws Exception {
		if ( cars.isEmpty() ) {
			synchronized ( cars ) {
				for ( int i = 0; i < 30; i++ ) {
					// cars.add( Cars.generateRandomCar() );
				}
			}
		} /*else {
			 synchronized ( cars ) {
			cars.remove( 0 );
			 }
			}*/
	}

	/*private static Car generateRandomCar( ) throws Exception {
		int n = new Random().nextInt( 5 );
	
		return Car.builder()
			.carType( carTypes[n] )
			.plateNumber( Generator.generateLicensePlate() )
			.factoryDate( Generator.generateRandomDate() )
			.build();
	}*/

	public String toJsonString( ) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		toJsonStream( baos );
		return baos.toString();
	}

	public void toJsonStream( OutputStream out ) throws Exception {
		objectMapper.writerWithDefaultPrettyPrinter()
			.writeValue( out, getCars() );
	}

	public void toHtmlStream( OutputStream out ) throws Exception {
		PrintWriter writer = new PrintWriter( out );

		writer.println( "<html>" );
		writer.println( "<head><title>Car Info</title></head>" );
		writer.println( "<body>" );
		writer.println( "<table border=\"1\" align=\"center\">" );
		writer.println( "<tr><th>Type</th><th>Color</th><th>Fuel Type</th><th>Max Speed</th><th>Price</th><th>Plate Number</th><th>Factory Date</th></tr>" );
		// synchronized ( cars ) {
		List<Car> carlist = getCars();
		for ( Car car:carlist ) {
			// Thread.sleep( 200 );
			writer.println( "<tr><td>" + car.getProperties()
				.getCarType()
				.getTypeName() + "</td><td>"
					+ car.getProperties()
						.getCarType()
						.getColor()
					+ "</td><td>" + car.getProperties()
						.getCarType()
						.getFuelType()
					+ "</td><td>" + car.getProperties()
						.getCarType()
						.getMaxSpeed()
					+ "</td><td>" + car.getProperties()
						.getCarType()
						.getPrice()
					+ "</td><td>" + car.getProperties()
						.getPlateNumber()
					+ "</td><td>" + car.getProperties()
						.getFactoryDate()
					+ "</td></tr>" );
		}
		// }

		writer.println( "</table>" );
		writer.println( "</body></html>" );

		writer.flush();
	}

	public static synchronized ICars getInstance( ) {
		if ( instance == null ) {
			try {
				instance = new Cars();
			} catch ( Exception e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return instance;

	}

	@Override
	public List<Car> getCars( ) {
		return cars;
	}

}
