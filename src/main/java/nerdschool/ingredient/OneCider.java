/*
 * OneCider.java
 *
 * Creator:
 * 30.05.2024 14:10 josia.schweizer
 *
 * Maintainer:
 * 30.05.2024 14:10 josia.schweizer
 *
 * Last Modification:
 * $Id:$
 *
 * Copyright (c) 2024 ABACUS Research AG, All Rights Reserved
 */
package nerdschool.ingredient;

import nerdschool.common.Const;

public class OneCider implements Ingredients {

  @Override
  public int getPrice() {
    return Const.CIDER_PRICE;
  }
}