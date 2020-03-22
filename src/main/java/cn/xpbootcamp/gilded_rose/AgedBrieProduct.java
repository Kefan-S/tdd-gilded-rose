package cn.xpbootcamp.gilded_rose;

class AgedBrieProduct extends Product {

  AgedBrieProduct(int quality, int sellIn) {
    super(quality, sellIn);
  }

  @Override
  void updateQualityByDay(int sellDay) {
    int increaseBase = 1;
    for (int i = 0; i < sellDay; i++) {
      if (i >= sellIn) {
        quality += increaseBase;
      }
    }
  }
}
