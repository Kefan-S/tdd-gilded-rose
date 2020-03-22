package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Product{

  Sulfuras(int quality, int sellIn) {
    super(quality, sellIn);
  }

  @Override
  void updateQualityByDay(int sellDay) {
    return;
  }
}
