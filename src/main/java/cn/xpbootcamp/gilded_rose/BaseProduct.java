package cn.xpbootcamp.gilded_rose;

class BaseProduct extends Product{

  BaseProduct(int quality, int sellIn) {
    super(quality, sellIn);
  }

  @Override
  void updateQualityByDay(int sellDay) {
    int declineBase = 1;
    for (int i = 0; i < sellDay; i++) {
      if (i >= sellIn) {
        quality -= declineBase;
        declineBase++;
      }
    }
  }
}
