/*
 * Drink.java
 *
 * Creator:
 * 17.05.2024 15:57 josia.schweizer
 *
 * Maintainer:
 * 17.05.2024 15:57 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.bar;

public abstract class Drink {
  public abstract int getPrice();
  public abstract boolean isEligibleForStudentDiscount();
  public abstract int getMaxAmount();
}