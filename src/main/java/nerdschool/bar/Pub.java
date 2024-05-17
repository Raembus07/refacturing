package nerdschool.bar;

import java.util.HashMap;
import java.util.Map;

public class Pub {

  private static final Map<String, Drink> drinks = new HashMap<>();

  static {
    drinks.put("hansa", new Beer());
    drinks.put("grans", new Cider());
    drinks.put("strongbow", new ProperCider());
    drinks.put("gt", new GinTonic());
    drinks.put("bacardi_special", new BacardiSpecial());
    drinks.put("wh", new Whiskey());
    drinks.put("gin_ginger", new GinGinger());
  }

  public int computeCost(String drinkName, boolean student, int amount) {
    Drink drink = drinks.get(drinkName);

    if (drink == null) {
      throw new RuntimeException("No such drink exists");
    }

    if (amount > drink.getMaxAmount()) {
      throw new RuntimeException("Too many drinks, max " + drink.getMaxAmount() + ".");
    }

    int price = drink.getPrice();
    if (student && drink.isEligibleForStudentDiscount()) {
      price = price - price / 10;
    }
    return price * amount;
  }
}
