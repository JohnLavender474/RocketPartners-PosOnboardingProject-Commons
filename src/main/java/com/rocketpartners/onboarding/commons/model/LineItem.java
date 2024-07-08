package com.rocketpartners.onboarding.commons.model;

import lombok.*;

/**
 * Represents a line item in a transaction. A line item is a multiple of the same item. Transactions are made up of
 * one or more line items.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LineItem {

    private String itemUpc;
    private String transactionId;
    private int quantity;
    private boolean voided;
}
