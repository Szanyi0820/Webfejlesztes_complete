package audi2;

enum FuelType {
    DIESEL("Dízel"),
    PETROL("Benzin"),
    ELECTRIC("Elektromos");

    private final String fuelName;

    FuelType(String fuelName) {
        this.fuelName = fuelName;
    }

    @Override
    public String toString() {
        return String.format("FuelType.%s(name=%s)", name(), fuelName);
    }
}
