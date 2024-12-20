package cars;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Ford extends CarType {
	@Builder
	Ford( String typeName, FuelType fuelType, Double price, Color color, int maxSpeed ) {
		super( "Ford", typeName, fuelType, price, color, maxSpeed );
	}

}
