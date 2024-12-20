package cars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarType {
	private String brandName;
	private String typeName;
	private FuelType fuelType;
	private double price;
	private Color color;
	private int maxSpeed;
}
