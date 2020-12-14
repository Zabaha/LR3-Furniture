package Furniture;

public class Bed extends Furniture{

    public Bed(String name, String material, String color, int cost) {
        super(name, material, color, cost);
    }

    @Override
    public String info() {
        return "Кровать\nНазвание: " + getName() + "\nМатериал: " + getMaterial() + "\nЦвет: " +
                getColor() + "\nЦена: " + getCost() + "р";
    }
}
