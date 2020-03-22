package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

  @Test
  void theQualityShouldBeZoreWhenInitProductGivenProductQualityIsNegativeOne(){
    Product product = new Product(-1, 1);

    assertEquals(0, product.getQuality());
  }

  @Test
  void theQualityShouldBeFiftyWhenInitProductGivenProductQualityIsHundred(){
    Product product = new Product(100, 1);

    assertEquals(50, product.getQuality());
  }
}
