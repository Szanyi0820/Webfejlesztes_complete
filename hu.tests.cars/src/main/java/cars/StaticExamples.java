package cars;

public class StaticExamples {
	public int amount;
	public static int id = 0;

	public StaticExamples( int amount ) {
		this.amount = amount;
		id = id + 1;
	}

	public static void setId( int id ) {
		StaticExamples.id = id;
	}

}
