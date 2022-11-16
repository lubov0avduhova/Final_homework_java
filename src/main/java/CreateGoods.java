public class CreateGoods {
    Goods temp;

    public CreateGoods() {
        temp = new Goods();
        temp.price = 0.00;
        temp.color = "---";
        temp.count = 0;
        temp.name = "---";
        temp.rate = 0;
        temp.description = new StringBuilder("---");

    }

    public CreateGoods setPrice(double price) {
        temp.price = price;
        return this;
    }

    public CreateGoods setColor(String color) {
        temp.color = color;
        return this;
    }

    public CreateGoods setCount(int count) {
        temp.count = count;
        return this;
    }

    public CreateGoods setName(String name) {
        temp.name = name;
        return this;
    }

    public CreateGoods setRate(double rate) {
        temp.rate = rate;
        return this;
    }

    public CreateGoods setDescription(StringBuilder description) {
        temp.description = description;
        return this;
    }

    public Goods Create() {
        return temp;
    }
}
