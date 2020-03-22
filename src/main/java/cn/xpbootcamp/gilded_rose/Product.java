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

  abstract int getQualityByDay(int sellDay);
}
