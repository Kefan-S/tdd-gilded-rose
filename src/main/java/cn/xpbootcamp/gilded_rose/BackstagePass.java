package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Product {

  BackstagePass(int quality, int sellIn) {
    super(quality, sellIn);
  }

  @Override
  void updateQualityByDay(int sellDay) {
    int interval = sellIn - sellDay;
    if (interval < 0) {
      quality = 0;
    } else if (interval < 5) {
      quality += (5 - interval) * 3 + 10;
    } else if (interval < 10) {
      quality += (10 - interval) * 2;
    }
  }
}
