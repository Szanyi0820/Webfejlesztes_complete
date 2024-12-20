package cars;

public class Main {
	public static void main( String[] args ) {
		/*Cars cars = new Cars();
		File file = new File( "test.json" );
		try {
			FileOutputStream fs = new FileOutputStream( file );
			cars.toJsonStream( fs );
			System.out.println( "Successfully wrote JSON file to: " + file.getName() );
		} catch ( Exception e ) {
			System.out.println( ExceptionUtils.getMessage( e ) );
		}*/
		StaticExamples examples = new StaticExamples( 20 );
		System.out.println( "amount:" + examples.amount + " id:" + StaticExamples.id );

		StaticExamples examples2 = new StaticExamples( 12 );
		StaticExamples.setId( 0 );
		System.out.println( "amount:" + examples2.amount + " id:" + StaticExamples.id );
	}

}
