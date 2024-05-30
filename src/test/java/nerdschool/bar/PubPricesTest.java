package nerdschool.bar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Pub spec")
public class PubPricesTest {

  private Pub pub;

  @BeforeEach
  public void setUp() throws Exception {
    pub = new Pub();
  }

  @Test
  @DisplayName("When we order one beer, then the price is 74 kr.")
  public void oneBeerTest() {
    int actualPrice = pub.computeCost("hansa", false, 1);
    assertEquals(74, actualPrice);
  }

  @Test
  @DisplayName("When we order two beers, then the price is 148 kr.")
  public void twoBeersTest() {
    int actualPrice = pub.computeCost("hansa", false, 2);
    assertEquals(148, actualPrice);
  }

  @Test
  @DisplayName("When we order one cider, then the price is 103 kr.")
  public void testCidersAreCostly() throws Exception {
    int actualPrice = pub.computeCost("grans", false, 1);
    assertEquals(103, actualPrice);
  }

  @Test
  @DisplayName("When we order two ciders, then the price is 206 kr.")
  public void testTwoCiders() {
    int actualPrice = pub.computeCost("grans", false, 2);
    assertEquals(206, actualPrice);
  }

  @Test
  @DisplayName("When we order a proper cider, then the price is 110 kr.")
  public void testProperCidersAreEvenMoreExpensive() throws Exception {
    int actualPrice = pub.computeCost("strongbow", false, 1);
    assertEquals(110, actualPrice);
  }

  @Test
  @DisplayName("When we order a gin and tonic, then the price is 115 kr.")
  public void testACocktail() throws Exception {
    int actualPrice = pub.computeCost("gt", false, 1);
    assertEquals(115, actualPrice);
  }

  @Test
  @DisplayName("When we order a bacardi special, then the price is 127 kr.")
  public void testBacardiSpecial() throws Exception {
    int actualPrice = pub.computeCost("bacardi_special", false, 1);
    assertEquals(127, actualPrice);
  }

  @Test
  @DisplayName("When we order a whiskey, then the price is 150 kr.")
  public void testWhiskey() throws Exception {
    int actualPrice = pub.computeCost("wh", false, 1);
    assertEquals(150, actualPrice);
  }

  @Test
  @DisplayName("When we order a gin-ginger, then the price is 152 kr.")
  public void testGinGinger() throws Exception {
    int actualPrice = pub.computeCost("gin_ginger", false, 1);
    assertEquals(152, actualPrice);
  }

  @Test
  @DisplayName("Is gin_ginger eligible for student discount?")
  public void testGinGingerIsNotEligibleForStudentDiscount(){
    Drink ginGinger = new GinGinger();
    assertEquals(true, ginGinger.isEligibleForStudentDiscount());
  }

  @Nested
  @DisplayName("Given a customer who is a student")
  class Students {

    @Test
    @DisplayName("When they order a beer, then they get a discount.")
    public void testStudentsGetADiscountForBeer() throws Exception {
      int actualPrice = pub.computeCost("hansa", true, 1);
      assertEquals(67, actualPrice);
    }

    @Test
    @DisplayName("When they order multiple beers, they also get a discount.")
    public void testStudentsGetDiscountsWhenOrderingMoreThanOneBeer() throws Exception {
      int actualPrice = pub.computeCost("hansa", true, 2);
      assertEquals(67 * 2, actualPrice);
    }

    @Test
    @DisplayName("When they order a cocktail, they do not get a discount.")
    public void testStudentsDoNotGetDiscountsForCocktails() throws Exception {
      int actualPrice = pub.computeCost("gt", true, 1);
      assertEquals(115, actualPrice);
    }
  }

  @Test
  @DisplayName("When they order a drink which is not on the menu, then they are refused.")
  public void testThatADrinkNotInTheSortimentGivesError() throws Exception {
    assertThrows(RuntimeException.class, () -> pub.computeCost("sanfranciscosling", false, 1));
  }

  @Test
  void getPrice() {
    BacardiSpecial bacardiSpecial = new BacardiSpecial();
    assertEquals(85 / 2 + 65 + 10 + 10, bacardiSpecial.getPrice());
  }

  @Test
  void isEligibleForStudentDiscount() {
    BacardiSpecial bacardiSpecial = new BacardiSpecial();
    assertFalse(bacardiSpecial.isEligibleForStudentDiscount());
  }

  @Test
  void getMaxAmount() {
    BacardiSpecial bacardiSpecial = new BacardiSpecial();
    assertEquals(2, bacardiSpecial.getMaxAmount());
  }

  @Test
  void testCiderIsEligibleForStudentDiscount() {
    Cider cider = new Cider();
    assertTrue(cider.isEligibleForStudentDiscount());
  }

  @Test
  void testWhiskeyIsNotEligibleForStudentDiscount() {
    Whiskey whiskey = new Whiskey();
    assertFalse(whiskey.isEligibleForStudentDiscount());
  }

  @Test
  void testProperCiderIsEligibleForStudentDiscount() {
    ProperCider properCider = new ProperCider();
    assertTrue(properCider.isEligibleForStudentDiscount());
  }

  @Nested
  @DisplayName("When they order more than two drinks")
  class MultipleDrinks {

    @Test
    @DisplayName("and the order is for cocktails, then they are refused.")
    public void testCanBuyAtMostTwoDrinksInOneGo() throws Exception {
      assertThrows(RuntimeException.class, () -> pub.computeCost("bacardi_special", false, 3));
    }

    @Test
    @DisplayName("and the order is for beers, then they are served.")
    public void testCanOrderMoreThanTwoBeers() throws Exception {
      pub.computeCost("hansa", false, 5);
    }
  }
}
