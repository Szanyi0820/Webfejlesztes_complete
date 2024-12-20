package audi2;

class Car {
    protected String typeName;
    protected FuelType fuelType;
    protected double price;
    protected Color color;
    protected int maxSpeed;

    public Car(String typeName, FuelType fuelType, double price, Color color, int maxSpeed) {
        this.typeName = typeName;
        this.fuelType = fuelType;
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getTypeName() {
        return typeName;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("Car(typeName=%s, fuelType=%s, price=%s, color=%s, maxSpeed=%s)", 
            typeName, fuelType, price, color, maxSpeed);
    }
}
