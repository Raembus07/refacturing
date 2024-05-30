/*
 * Beer.java
 *
 * Creator:
 * 17.05.2024 15:58 josia.schweizer
 *
 * Maintainer:
 * 17.05.2024 15:58 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.bar;

import nerdschool.ingredient.IngredientBeer;

public class Beer implements Drink {

  IngredientBeer ingredientBeer = new IngredientBeer();

  @Override
  public int getPrice() {
    return ingredientBeer.getPrice();
  }

  @Override
  public boolean isEligibleForStudentDiscount() {
    return true;
  }

  @Override
  public int getMaxAmount() {
    return Integer.MAX_VALUE;
  }
}