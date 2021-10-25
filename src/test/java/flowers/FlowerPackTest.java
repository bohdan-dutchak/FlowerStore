package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerpack = new FlowerPack(new Flower(FlowerType.Rose, Color.RED, 2, 100), 10);

    @Test
    void getPrice() {
        assertEquals(1000, flowerpack.getPrice());
    }

    @Test
    void getFlower() {
        assertEquals(FlowerType.Rose, flowerpack.getFlower());
    }
}