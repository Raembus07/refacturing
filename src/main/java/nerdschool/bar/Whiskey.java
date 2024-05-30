/*
 * Whiskey.java
 *
 * Creator:
 * 17.05.2024 16:00 josia.schweizer
 *
 * Maintainer:
 * 17.05.2024 16:00 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.bar;

import nerdschool.ingredient.IngredientWhisky;

public class Whiskey extends Drink {

  IngredientWhisky ingredientWhiskey = new IngredientWhisky();

  @Override
  public int getPrice() {
    return ingredientWhiskey.getPrice();
  }

  @Override
  public boolean isEligibleForStudentDiscount() {
    return false;
  }

  @Override
  public int getMaxAmount() {
    return 3;
  }
}