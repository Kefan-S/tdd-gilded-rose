package cn.xpbootcamp.gilded_rose;

class Product {

  private static final int MIN_PRODUCT_QUALITY = 0;
  private static final int MAX_PRODUCT_QUALITY = 50;
  private int quality;
  private int sellIn;

  Product(int quality, int sellIn) {
    this.quality = quality;
    this.sellIn = sellIn;
  }

  int getQuality() {
    if (quality < MIN_PRODUCT_QUALITY) {
      return MIN_PRODUCT_QUALITY;
    } else if (quality > MAX_PRODUCT_QUALITY) {
      return MAX_PRODUCT_QUALITY;
    } else {
      return quality;
    }
  }
}
