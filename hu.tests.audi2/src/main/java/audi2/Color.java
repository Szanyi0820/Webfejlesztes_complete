package audi2;

enum Color {
    BLUE("Kék"),
    RED("Piros"),
    GREEN("Zöld");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return String.format("Color.%s(colorName=%s)", name(), colorName);
    }
}
