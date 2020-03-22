package cn.xpbootcamp.gilded_rose;

abstract class Product {

  static final int MIN_PRODUCT_QUALITY = 0;
  static final int MAX_PRODUCT_QUALITY = 50;
  int quality;
  int sellIn;

  Product(int quality, int sellIn) {
    this.quality = quality;
    this.sellIn = sellIn;
  }

  int getQualityByDay(int sellDay){
    updateQualityByDay(sellDay);

    if (quality < MIN_PRODUCT_QUALITY) {
      return MIN_PRODUCT_QUALITY;
    } else if (quality > MAX_PRODUCT_QUALITY) {
      return MAX_PRODUCT_QUALITY;
    } else {
      return quality;
    }
  }

  abstract void updateQualityByDay(int sellDay);
}
