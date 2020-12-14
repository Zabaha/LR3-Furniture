package Furniture;

public abstract class Furniture {
    private String name;
    private String material;
    private String color;
    private int cost;

    public Furniture(String name, String material, String color, int cost){
        this.name = name;
        this.material = material;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public abstract String info();
}
