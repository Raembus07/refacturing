/*
 * GinGinger.java
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

import nerdschool.ingredient.Gin;
import nerdschool.ingredient.Ginger;

public class GinGinger extends Drink {

  Gin gin = new Gin();
  Ginger ginger = new Ginger();

  @Override
  public int getPrice() {
    return (int) (gin.getPrice() * 1.5 + ginger.getPrice());
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