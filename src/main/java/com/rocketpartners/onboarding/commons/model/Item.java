package com.rocketpartners.onboarding.commons.model;

import lombok.*;

import java.math.BigDecimal;

/**
 * Represents an item that can be sold in a store. Items have a UPC, name, category, description, and unit price. Items
 * are used to create line items in a transaction.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private String upc;
    private String name;
    private BigDecimal unitPrice;
    private String category;
    private String description;
}
