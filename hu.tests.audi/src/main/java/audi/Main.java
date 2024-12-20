package audi;

public class Main {
	public static void main(String[] args) {
		Audi audiA8 = Audi.builder()
	            .color( Color.BLUE )
	            .fuelType( FuelType.DIESEL )
	            .maxSpeed( 220 )
	            .price( 14450000d )
	            .typeName( "A8" )
	            .build();
	        System.out.println( audiA8.toString() );
	}
	
}
