package cars;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Bmw extends CarType {
	@Builder
	Bmw( String typeName, FuelType fuelType, Double price, Color color, int maxSpeed ) {
		super( "Bmw", typeName, fuelType, price, color, maxSpeed );
	}

}
