package teacher.lesson_15_refactoring.homework.level_5_middle.gildedrose;

import java.util.List;

class GildedRose {

	public void updateQuality(List<Item> items) {
		for (int i = 0; i < items.size(); i++) {
			if ((!"Aged Brie".equals(items.get(i).getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
				if (items.get(i).getQuality() > 0) {
					if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
						items.get(i).setQuality(items.get(i).getQuality() - 1);
					}
				}
			}
			else {
				if (items.get(i).getQuality() < 50) {
					items.get(i).setQuality(items.get(i).getQuality() + 1);

					if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
						if (items.get(i).getSellIn() < 11) {
							if (items.get(i).getQuality() < 50) {
								items.get(i).setQuality(items.get(i).getQuality() + 1);
							}
						}

						if (items.get(i).getSellIn() < 6) {
							if (items.get(i).getQuality() < 50) {
								items.get(i).setQuality(items.get(i).getQuality() + 1);
							}
						}
					}
				}
			}

			if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
				items.get(i).setSellIn(items.get(i).getSellIn() - 1);
			}

			if (items.get(i).getSellIn() < 0) {
				if (!"Aged Brie".equals(items.get(i).getName())) {
					if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
						if (items.get(i).getQuality() > 0) {
							if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
								items.get(i).setQuality(items.get(i).getQuality() - 1);
							}
						}
					}
					else {
						items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
					}
				}
				else {
					if (items.get(i).getQuality() < 50) {
						items.get(i).setQuality(items.get(i).getQuality() + 1);
					}
				}
			}
		}
	}

}