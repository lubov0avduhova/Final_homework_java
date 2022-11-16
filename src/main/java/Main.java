public class Main {
    public static void main(String[] args) {
        Goods currentGood = new CreateGoods()
                .setPrice(12.45)
                .setName("Футболка")
                .setRate(4.5)
                .setColor("Черная")
                .Create();
        currentGood.print();
    }
}
