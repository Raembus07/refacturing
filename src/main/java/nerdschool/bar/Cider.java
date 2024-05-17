/*
 * Cider.java
 *
 * Creator:
 * 17.05.2024 15:58 josia.schweizer
 *
 * Maintainer:
 * 17.05.2024 15:58 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.bar;

public class Cider extends Drink {

  @Override
  public int getPrice() {
    return 103;
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