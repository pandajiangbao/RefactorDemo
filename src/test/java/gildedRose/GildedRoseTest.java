package gildedRose;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PTATC = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    @Test
    public void should_correct_update_item_when_item_name_equal_panda_sellIn_1_quality_1(){
        //given
        Item item = new Item("Panda", 1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Panda, 0, 0", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_panda_sellIn_less_then_0_quality_2(){
        //given
        Item item = new Item("Panda", -1, 2);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Panda, -2, 0", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_panda_sellIn_less_then_0_quality_1(){
        //given
        Item item = new Item("Panda", -1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Panda, -2, 0", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_aged_brie_sellIn_1_quality_1(){
        //given
        Item item = new Item(AGED_BRIE, 1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Aged Brie, 0, 2", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_aged_brie_sellIn_1_quality_51(){
        //given
        Item item = new Item(AGED_BRIE, 1, 51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Aged Brie, 0, 51", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_aged_brie_sellIn_less_then_0_quality_51(){
        //given
        Item item = new Item(AGED_BRIE, -1, 51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Aged Brie, -2, 51", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_aged_brie_sellIn_less_then_0_quality_1(){
        //given
        Item item = new Item(AGED_BRIE, -1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Aged Brie, -2, 3", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_1_quality_1(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, 1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 4", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_7_quality_1(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, 7, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 6, 3", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_12_quality_1(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, 12, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 11, 2", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_less_then_0_quality_1(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, -1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_1_quality_49(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, 1, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_0_quality_49(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, 0, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_1_quality_51(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, 1, 51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 51", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_backstage_sellIn_less_then_0_quality_51(){
        //given
        Item item = new Item(BACKSTAGE_PTATC, -1, 51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0", items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_item_name_equal_sulfuras_sellIn_less_then_0_quality_1(){
        //given
        Item item = new Item(SULFURAS_HAND_OF_RAGNAROS, -1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        //when
        gildedRose.updateQuality();
        Item[] items = gildedRose.items;

        //then
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, 1", items[0].toString());
    }

}
