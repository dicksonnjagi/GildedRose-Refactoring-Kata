package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    // Test to check +5 Dexterity Vest item is decrementing for both sellIn and quality
    // Also checks if the expected name matches the actual name
    @Test
    void dexterityVestItemTest() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", -8, 18) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("+5 Dexterity Vest", app.items[0].name);
        assertEquals(-9, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
    }

    // Test to check Aged Brie item is decrementing for sellIn and incrementing for quality
    // Also checks if the expected name matches the actual name
    @Test
    void agedBrieItemTest() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 12) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
    }

    // Test to check Elixir of the Mongoose item is decrementing for both sellIn and quality
    // Also checks if the expected name matches the actual name
    @Test
    void elixirOfTheMongooseItemTest() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 6, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
    }

    // Test to check Sulfuras, Hand of Ragnaros item stays the same for both sellIn and quality
    // Also checks if the expected name matches the actual name
    @Test
    void sulfurasHandOfRagnarosItemTest() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(60, app.items[0].quality);
    }

    // Test to check Backstage passes to a TAFKAL80ETC concert is decrementing for sellIn and incrementing for quality
    // Also checks if the expected name matches the actual name
    @Test
    void backstagePassesToATAFKAL80ETCConcertItemTest() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    // Test to check Conjured Mana Cake item is decrementing for both sellIn and quality
    // Also checks if the expected name matches the actual name
    @Test
    void ConjuredManaCakeItemTest() {
        int days = 10;
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(58, app.items[0].quality);
    }

    // Test all the items method if the expected name matches the actual name
    @Test
    void checkAllItems() {
        GildedRose app = new GildedRose(roseCheck());
        for (Item item : app.items) {
            Item[] items = new Item[]{item};
            app = new GildedRose(items);
            app.updateQuality();
            assertEquals(item.name, app.items[0].name);
        }
    }

    // Method that will return all the items in an Array to be used by checkAllItems() method
    private Item[] roseCheck(){

        return new Item[] {
                new Item("+5 Dexterity Vest", -8, 18),
                new Item("Aged Brie", 2, 12),
                new Item("Elixir of the Mongoose", 6, 15),
                new Item("Sulfuras, Hand of Ragnaros", 0, 60) ,
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 33),
                new Item("Backstage passes to a TAFKAL80ETC concert", 11, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 6, 49),
                new Item("Conjured Mana Cake", 3, 60) };
    }

}
