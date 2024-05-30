/*
 * BacardiSpecial.java
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
import nerdschool.ingredient.Grenadine;
import nerdschool.ingredient.LimeJuice;
import nerdschool.ingredient.Rum;

public class BacardiSpecial extends Drink {

  Gin gin = new Gin();
  Rum rum = new Rum();
  Grenadine grenadine = new Grenadine();
  LimeJuice limeJuice = new LimeJuice();

  @Override
  public int getPrice() {
    return gin.getPrice() / 2 + rum.getPrice() + grenadine.getPrice() + limeJuice.getPrice();
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