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

public class GinGinger extends Drink {

  @Override
  public int getPrice() {
    return (int) (85 * 1.5 + 25);
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