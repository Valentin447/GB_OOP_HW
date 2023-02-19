import java.util.Random;

public class Notebook {
    double price;
    int ram;

    Notebook() {
        this.ram = getStandardRam();
        this.price = getRandomPrice();
    }

    Random rand = new Random();
    private int[] memoryGB = {128, 240, 256, 512, 1000, 2000};

    private int getStandardRam() {
        return memoryGB[rand.nextInt(0, memoryGB.length)];
    }

    private double getRandomPrice() {
        int minPrice = 15_000;
        int maxPrice = 200_000;
        return (double) (rand.nextInt(minPrice * 100, maxPrice * 100)) / 100;
    }

    @Override
    public String toString() {
        return "Память: " + ram + " ГБ;  Цена: " + price + " руб.";
    }
}
