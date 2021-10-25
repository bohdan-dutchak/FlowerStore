package flowers;

public class FlowerPack {
    private Flower flower;
    private int amount;


    public FlowerPack (Flower flower, int amount){
        this.flower = flower;
        this.amount = amount >0? amount : 1;
    }

    public double getPrice(){
        return this.flower.getPrice() * this.amount;
    }

    public Flower getFlower() {
        return flower;
    }

    /*
    public void setAmount(int amount){
        this.amount = amount > 0 ? amount : 1;
    }

     */

    public String tuString(){
        return this.amount + " x " + this.flower.toString();
    }
}
