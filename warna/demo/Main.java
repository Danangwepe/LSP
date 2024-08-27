package warna.demo;

public class Main {
    public static void main(String[] args) {
        // violate LSP because color of green object is blue
        Green green = new Blue();
        green.getColor();
    }
}