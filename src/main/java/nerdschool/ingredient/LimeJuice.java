/*
 * Ingredient3.java
 *
 * Creator:
 * 30.05.2024 13:56 josia.schweizer
 *
 * Maintainer:
 * 30.05.2024 13:56 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.ingredient;

import nerdschool.common.Const;

public class LimeJuice implements Ingredients {

  @Override
  public int getPrice() {
    return Const.LIME_PRICE;
  }
}