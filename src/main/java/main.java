import java.util.*;
import flowers.*;

public class main {
    public static void main(String[] args){
        List<Flower> arr = generateAssort(20);

        Store myStore = new Store(arr);
        myStore.showAssortment();
        myStore.search(Color.BLACK);
        myStore.search(FlowerType.Chamomile);

    }

    public static double randomDouble(double l, double r){
        double result = l + new Random().nextDouble() * (r - l);
        return Math.round(result*100)/100;
    }

    public static List<Flower> generateAssort(int n){
        List<Flower> flowers = new ArrayList<Flower>();
        Random random = new Random();
        final List<FlowerType> FT = Collections.unmodifiableList(Arrays.asList(FlowerType.values()));
        final List<Color> COLORS = Collections.unmodifiableList(Arrays.asList(Color.values()));
        for (int i = 0; i<n;i++){
            Flower flower = new Flower(FT.get(random.nextInt(FT.size())),COLORS.get(random.nextInt(COLORS.size())), randomDouble(1,10), randomDouble(10,200));
            flowers.add(flower);
        }
        return flowers;
    }
}
