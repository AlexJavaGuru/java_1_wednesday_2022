package teacher.lesson_15_refactoring.lessoncode;

import java.util.Map;
import java.util.function.Consumer;

class GildedRose {

    Item[] items;

    Map<String, Consumer<Item>> updaters = Map.of(
        "Aged Brie", this::agedBrieQualityUpdate,
        "Backstage passes to a TAFKAL80ETC concert", this::backstageQualityUpdate
    );

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
                continue;
            }

            Consumer<Item> itemConsumer = updaters.getOrDefault(item.name, this::defaultQualityUpdate);
            itemConsumer.accept(item);

            item.sellIn--;

            if (item.sellIn < 0) {
                switch (item.name) {
                    case "Aged Brie" -> agedBrieQualityUpdate(item);
                    case "Backstage passes to a TAFKAL80ETC concert" -> item.quality = 0;
                    default -> defaultQualityUpdate(item);
                }
            }
        }
    }

    private void defaultQualityUpdate(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void backstageQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }

            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
    }

    private void agedBrieQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
