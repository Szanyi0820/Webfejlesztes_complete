package audi2;

class Audi extends Car {
    public Audi(String typeName, FuelType fuelType, double price, Color color, int maxSpeed) {
        super(typeName, fuelType, price, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Audi:" + super.toString();
    }
}
