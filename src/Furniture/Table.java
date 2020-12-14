package Furniture;

public class Table extends Furniture{

    public Table(String name, String material, String color, int cost) {
        super(name, material, color, cost);
    }

    @Override
    public String info() {
        return "Стол\nНазвание: " + getName() + "\nМатериал: " + getMaterial() + "\nЦвет: " +
                getColor() + "\nЦена: " + getCost() + "р";
    }
}
