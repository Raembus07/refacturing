/*
 * GinTonic.java
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

import nerdschool.ingredient.Gin;
import nerdschool.ingredient.GreenStuff;
import nerdschool.ingredient.TonicWater;

public class GinTonic extends Drink {

  Gin gin = new Gin();
  TonicWater tonicWater = new TonicWater();
  GreenStuff greenStuff = new GreenStuff();

  @Override
  public int getPrice() {
    return gin.getPrice() + tonicWater.getPrice() + greenStuff.getPrice();
  }

  @Override
  public boolean isEligibleForStudentDiscount() {
    return false;
  }

  @Override
  public int getMaxAmount() {
    return 2;
  }
}