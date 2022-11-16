public class Goods {
    public double price;
    public String color;
    public int count;
    public String name;
    public double rate;
    public StringBuilder description;

    public void print() {
        System.out.printf(
                "%.3f %s %d %s %.3f %s",
                price, color, count, name, rate, description);
    }
}
