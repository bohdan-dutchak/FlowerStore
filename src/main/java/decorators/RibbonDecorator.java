package decorators;

import flowers.Item;

public class RibbonDecorator  extends Decorator{
    public RibbonDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 40;
    }

    @Override
    public String getDescription(){
        super.getDescription();
        return "Ribbon Decorator";
    }
}
