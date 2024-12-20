package audi;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
public class Audi extends Cars {
	
		@Builder
	    public Audi(String typeName, FuelType fuelType, double price, Color color, int maxSpeed) {
	        super("Audi",typeName, fuelType, price, color, maxSpeed);
	        
	    }
	    @Override
	    public String toString() {
	        return "Audi:" + super.toString();
	    }
}


