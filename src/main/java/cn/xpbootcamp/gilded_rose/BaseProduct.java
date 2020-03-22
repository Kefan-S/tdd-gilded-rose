package cn.xpbootcamp.gilded_rose;

class BaseProduct extends Product{

  BaseProduct(int quality, int sellIn) {
    super(quality, sellIn);
  }

  @Override
  int getQualityByDay(int sellDay) {
    int declineBase = 1;
    for (int i = 0; i < sellDay; i++) {
      if (i >= sellIn) {
        quality -= declineBase;
        declineBase++;
      }
    }

    if (quality < MIN_PRODUCT_QUALITY) {
      return MIN_PRODUCT_QUALITY;
    } else if (quality > MAX_PRODUCT_QUALITY) {
      return MAX_PRODUCT_QUALITY;
    } else {
      return quality;
    }
  }
}
