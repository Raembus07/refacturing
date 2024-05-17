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

public class BacardiSpecial extends Drink{
  @Override
  public int getPrice() {
    return 85 / 2 + 65 + 10 + 10;
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