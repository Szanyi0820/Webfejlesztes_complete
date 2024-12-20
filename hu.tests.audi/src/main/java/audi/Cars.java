package audi;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@ToString

public class Cars {
	protected String brandName;
    private String typeName;
    private FuelType fuelType;
    private double price;
    private Color color;
    private int maxSpeed;

    
   }


