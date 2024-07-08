package com.rocketpartners.onboarding.commons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Discount model which contains the type of discount and the value of the discount. The significance of the
 * value depends on the type of discount. For {@link DiscountType#XFOR}, the value is the number of items that
 * must be purchased to get the discount. For {@link DiscountType#PCT_OFF}, the value is the percentage
 * off the total price.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Discount {

    public enum DiscountType {
        XFOR, PCT_OFF
    }

    private DiscountType type;
    private int value;

}
