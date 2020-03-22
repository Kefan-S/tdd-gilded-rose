package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

  @Test
  void theQualityShouldBeZoreWhenInitProductGivenProductQualityIsNegativeOne(){
    Product product = new Product(-1, 1);

    assertEquals(0, product.getQualityByDay(1));
  }

  @Test
  void theQualityShouldBeFiftyWhenInitProductGivenProductQualityIsHundred(){
    Product product = new Product(100, 1);

    assertEquals(50, product.getQualityByDay(1));
  }

  @Test
  void theQualityShouldBeFiveWhenOneDayOutOfSellInGivenProductQualityIsSix() {
    Product product = new Product(6, 1);

    assertEquals(5, product.getQualityByDay(2));
  }

  @Test
  void theQualityShouldBeThreeWhenTwoDayOutOfSellInGivenProductQualityIsSix() {
    Product product = new Product(6, 1);

    assertEquals(3, product.getQualityByDay(3));
  }
}
