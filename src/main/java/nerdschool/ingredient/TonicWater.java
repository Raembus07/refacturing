/*
 * Ingredient5.java
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

public class TonicWater implements Ingredients {

  @Override
  public int getPrice() {
    return Const.TONCIWATER_PRICE;
  }
}