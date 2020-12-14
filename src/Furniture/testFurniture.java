package Furniture;

public class testFurniture {

    public static void main(String[] args) {
        Chair c1 = new Chair("адде", "сталь и пластик", "белый", 749);
        Chair c2 = new Chair("бёрье", "дерево и ткань", "черный", 3999);
        Chair c3 = new Chair("йокмокк", "дерево", "коричневый", 2199);
        Bed b1 = new Bed("сонгесанд", "дерево", "белый", 10599);
        Bed b2 =  new Bed("сагстуа", "сталь", "черныый", 15799);
        Table t1 = new Table("ланеберг", "дерево", "белый", 10999);
        Table t2 = new Table("аркельсторп", "дерево", "коричневый", 12999);
        FurnitureShop myShop = new FurnitureShop(3,2,2);
        myShop.pushChairArr(c1);
        myShop.pushChairArr(c2);
        myShop.pushChairArr(c3);
        myShop.pushBedArr(b1);
        myShop.pushBedArr(b2);
        myShop.pushTableArr(t1);
        myShop.pushTableArr(t2);
        myShop.pushTableArr(t2);
        myShop.printChairArr();
        myShop.printBedArr();
        myShop.printTableArr();
    }
}
