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

public class GinTonic extends Drink {

  @Override
  public int getPrice() {
    return 85 + 10 + 20;
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