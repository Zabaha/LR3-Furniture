package Furniture;

public class FurnitureShop {
    private Chair [] someChair;
    private Bed [] someBed;
    private Table [] someTable;
    private int counterChair = 0;
    private int counterBed = 0;
    private int counterTable = 0;

    public FurnitureShop(int quantityChair, int quantityBed, int quantityTable){
        someChair = new Chair[quantityChair];
        someBed = new Bed[quantityBed];
        someTable = new Table[quantityTable];
    }

    public int getLengthChairArr() {
        return someChair.length;
    }

    public int getLengthBedArr() {
        return someBed.length;
    }

    public int getLengthTableArr() {
        return someTable.length;
    }

    public void pushChairArr(Chair c1){
        if (counterChair < someChair.length) {
            someChair[counterChair] = c1;
            counterChair++;
        }
        else
            System.out.println("На складе нет места");
    }

    public void pushBedArr(Bed b1){
        if (counterBed < someBed.length) {
            someBed[counterBed] = b1;
            counterBed++;
        }
        else
            System.out.println("На складе нет места");
    }

    public void pushTableArr(Table t1){
        if (counterTable < someTable.length) {
            someTable[counterTable] = t1;
            counterTable++;
        }
        else
            System.out.println("На складе нет места");
    }

    public void printChairArr(){
        System.out.println("Все доступныйе в магазине стулья");
        for(int i = 0; i < counterChair; i++) {
            System.out.println(someChair[i].info());
        }
    }

    public void printBedArr(){
        System.out.println("Все доступныйе в магазине кровати");
        for(int i = 0; i < counterBed; i++) {
            System.out.println(someBed[i].info());
        }
    }
    public void printTableArr(){
        System.out.println("Все доступныйе в магазине столы");
        for(int i = 0; i < counterTable; i++) {
            System.out.println(someTable[i].info());
        }
    }
}
