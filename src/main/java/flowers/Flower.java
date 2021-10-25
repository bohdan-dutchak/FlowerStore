package flowers;

public class Flower {
    private double sepalLength;
    private double price;
    private Color color;
    private FlowerType flowertype;

    public Flower(FlowerType ft, Color c, double sl, double p){
        this.flowertype = ft;
        this.color = c;
        this.sepalLength = sl;
        this.price = p;
    }

    public double getSepalLength() { return sepalLength; }

    public Color getColor() { return color; }

    public double getPrice(){
        return price;
    }

    public FlowerType getFlowerType() { return flowertype; }

    public String toString() { return "Type: "+this.flowertype+"; Color: "+this.color+"; Sepa Lenth: "+this.sepalLength+"; Price : "+price; }
}
