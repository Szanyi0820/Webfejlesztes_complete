package cars;

public class Car {
	private CarProperties properties;

	// Getter and Setter for properties
	public CarProperties getProperties( ) {
		return properties;
	}

	public void setProperties( CarProperties properties ) {
		this.properties = properties;
	}

	// Inner class CarProperties
	public static class CarProperties {
		private CarType carType;
		private String factoryDate;
		private String plateNumber;

		// Getters and Setters for carType, factoryDate, and plateNumber
		public CarType getCarType( ) {
			return carType;
		}

		public void setCarType( CarType carType ) {
			this.carType = carType;
		}

		public String getFactoryDate( ) {
			return factoryDate;
		}

		public void setFactoryDate( String factoryDate ) {
			this.factoryDate = factoryDate;
		}

		public String getPlateNumber( ) {
			return plateNumber;
		}

		public void setPlateNumber( String plateNumber ) {
			this.plateNumber = plateNumber;
		}
	}

	// Inner class CarType
	public static class CarType {
		private String brandName;
		private String color;
		private String fuelType;
		private int maxSpeed;
		private double price;
		private String typeName;

		// Getters and Setters for brandName, color, fuelType, maxSpeed, price, typeName
		public String getBrandName( ) {
			return brandName;
		}

		public void setBrandName( String brandName ) {
			this.brandName = brandName;
		}

		public String getColor( ) {
			return color;
		}

		public void setColor( String color ) {
			this.color = color;
		}

		public String getFuelType( ) {
			return fuelType;
		}

		public void setFuelType( String fuelType ) {
			this.fuelType = fuelType;
		}

		public int getMaxSpeed( ) {
			return maxSpeed;
		}

		public void setMaxSpeed( int maxSpeed ) {
			this.maxSpeed = maxSpeed;
		}

		public double getPrice( ) {
			return price;
		}

		public void setPrice( double price ) {
			this.price = price;
		}

		public String getTypeName( ) {
			return typeName;
		}

		public void setTypeName( String typeName ) {
			this.typeName = typeName;
		}
	}
}
