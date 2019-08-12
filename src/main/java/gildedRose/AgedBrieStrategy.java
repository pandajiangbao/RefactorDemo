package gildedRose;

public class AgedBrieStrategy extends UpdateItemStrategy{
    @Override
    void updateItem(Item item) {
        if(item.quality < 50) {
            item.quality++;
        }

        item.sellIn--;

        if(item.sellIn < 0 && item.quality < 50){
            item.quality++;
        }
    }
}
