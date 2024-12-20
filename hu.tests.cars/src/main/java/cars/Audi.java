package cars;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Audi extends CarType {
	@Builder
	Audi( String typeName, FuelType fuelType, Double price, Color color, int maxSpeed ) {
		super( "Audi", typeName, fuelType, price, color, maxSpeed );
	}

}
