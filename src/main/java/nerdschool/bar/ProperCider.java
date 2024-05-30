/*
 * ProperCider.java
 *
 * Creator:
 * 17.05.2024 15:59 josia.schweizer
 *
 * Maintainer:
 * 17.05.2024 15:59 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.bar;

import nerdschool.ingredient.IngredientProperCider;

public class ProperCider implements Drink {

  IngredientProperCider ingredientProperCider = new IngredientProperCider();

  @Override
  public int getPrice() {
    return ingredientProperCider.getPrice();
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