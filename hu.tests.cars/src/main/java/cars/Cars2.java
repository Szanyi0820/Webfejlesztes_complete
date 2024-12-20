package cars;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

public class Cars2 extends ICars {

	private static Cars2 instance;
	private List<Car> carlist;
	static ICars carsInstance = Cars.getInstance();

	private Cars2( ) {

	}

	@Override
	public void toHtmlStream( OutputStream out ) throws Exception {

		PrintWriter writer = new PrintWriter( out );

		writer.println( "<head><title>Cars2 Info </title></head>" );
		writer.println( "<table border=\"1\" align=\"center\">" );
		writer.println( "<tr><th>Types</th><th>Color</th><th>Fuel Type</th><th>Max Speed</th><th>Price</th><th>Plate Number</th><th>Factory Date</th></tr>" );
		carlist = carsInstance.getCars();
		for ( Car car:carlist ) {
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

		writer.flush();
	}

	public static synchronized ICars getInstance( ) {
		if ( carsInstance == null ) {
			carsInstance = new Cars2();
		}
		return carsInstance;
	}

	@Override
	public List<Car> getCars( ) {
		return carlist;
	}
}
