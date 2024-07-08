package com.rocketpartners.onboarding.commons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents the result of a discount computation. A discount computation has a discount amount and a list of applied
 * discounts. The discount amount is the total amount of all discounts applied to a transaction. The list of applied
 * discounts is the list of discounts that were applied to the transaction.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class DiscountComputation {

    private BigDecimal discountAmount;
    private Map<String, Discount> appliedDiscounts;
    private Map<String, BigDecimal> results;

    /**
     * Create a new DiscountComputation with zeroed out numbers and an empty list of applied discounts.
     */
    public DiscountComputation() {
        discountAmount = BigDecimal.ZERO;
        appliedDiscounts = new HashMap<>();
        results = new HashMap<>();
    }

}
