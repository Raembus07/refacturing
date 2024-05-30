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

public interface Drink {
  int getPrice();
  boolean isEligibleForStudentDiscount();
  int getMaxAmount();
}