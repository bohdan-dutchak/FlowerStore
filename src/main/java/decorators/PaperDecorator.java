package decorators;

import flowers.Item;

public class PaperDecorator extends Decorator{
    public PaperDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 13;
    }

    @Override
    public String getDescription(){
        super.getDescription();
        return "Paper Decorator";
    }
}
