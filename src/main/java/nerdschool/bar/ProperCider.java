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

public class ProperCider extends Drink {

  @Override
  public int getPrice() {
    return 110;
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