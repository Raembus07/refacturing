/*
 * IngredientBeer.java
 *
 * Creator:
 * 30.05.2024 14:09 josia.schweizer
 *
 * Maintainer:
 * 30.05.2024 14:09 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.ingredient;

import nerdschool.common.Const;

public class IngredientBeer implements Ingredients {

  @Override
  public int getPrice() {
    return Const.BEER_PRICE;
  }
}