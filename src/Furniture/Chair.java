package Furniture;

public class Chair extends Furniture{

    public Chair(String name, String material, String color, int cost) {
        super(name, material, color, cost);
    }

    @Override
    public String info() {
        return "Стул\nНазвание: " + getName() + "\nМатериал: " + getMaterial() + "\nЦвет: " +
                getColor() + "\nЦена: " + getCost() + "р";
    }
}
