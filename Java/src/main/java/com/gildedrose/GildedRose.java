package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        // if the item name is not Conjured Mana Cake then reduce by 1
                        if(!items[i].name.equals("Conjured Mana Cake")) {
                            items[i].quality = items[i].quality - 1;
                        }
                        // condition to check if the quality is Conjured Mana Cake
                        else {
                            // quality of Conjured Mana Cake reduces 2s as much as normal items hence reducing by 2
                            items[i].quality = items[i].quality - 2;
                        }
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                // if the item name is not Conjured Mana Cake then reduce further by 1 if sell by date
                                // has passed
                                if(!items[i].name.equals("Conjured Mana Cake")) {
                                    items[i].quality = items[i].quality - 1;
                                }
                                // condition to check if the quality is Conjured Mana Cake
                                else {
                                    // quality of Conjured Mana Cake reduces even further by 2 if the sell by date
                                    // has passed
                                    items[i].quality = items[i].quality - 2;
                                }
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}