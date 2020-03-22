package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

  @Test
  void theQualityShouldBeZoreWhenInitProductGivenProductQualityIsNegativeOne() {
    Product product = new BaseProduct(-1, 1);

    assertEquals(0, product.getQualityByDay(1));
  }

  @Test
  void theQualityShouldBeFiftyWhenInitProductGivenProductQualityIsHundred() {
    Product product = new BaseProduct(100, 1);

    assertEquals(50, product.getQualityByDay(1));
  }

  @Test
  void theQualityShouldBeFiveWhenOneDayOutOfSellInGivenProductQualityIsSix() {
    Product product = new BaseProduct(6, 1);

    assertEquals(5, product.getQualityByDay(2));
  }

  @Test
  void theQualityShouldBeThreeWhenTwoDayOutOfSellInGivenProductQualityIsSix() {
    Product product = new BaseProduct(6, 1);

    assertEquals(3, product.getQualityByDay(3));
  }

  @Test
  void theQualityShouldBeSixWhenOneDayOutOfSellInGivenAgedBrieProductQualityIsFive() {
    Product product = new AgedBrie(5, 1);

    assertEquals(6, product.getQualityByDay(2));
  }

  @Test
  void theQualityShouldBeSevenWhenTwoDayOutOfSellInGivenAgedBrieProductQualityIsFive() {
    Product product = new AgedBrie(5, 1);

    assertEquals(7, product.getQualityByDay(3));
  }

  @Test
  void theQualityShouldBeSevenWhenOutOfSellInGivenSulfurasQualityIsSeven() {
    Product product = new Sulfuras(7, 0);

    assertEquals(7, product.getQualityByDay(1));
  }
}
