package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItem() {
        switch (name) {
            case AGED_BRIE:
                new AgedBrieStrategy().updateItem(this);
                break;
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                new BackstagePassesStrategy().updateItem(this);
                break;
            case SULFURAS_HAND_OF_RAGNAROS:
                new SulfurasStrategy().updateItem(this);
                break;
            default:
                new NormalStrategy().updateItem(this);
                break;
        }
    }
}
