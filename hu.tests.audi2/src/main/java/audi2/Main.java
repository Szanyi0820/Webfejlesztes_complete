package audi2;

public class Main {
    public static void main(String[] args) {
        Audi audiA8 = new Audi("A8", FuelType.DIESEL, 14450000d, Color.BLUE, 220);
        System.out.println(audiA8.toString());
    }
}