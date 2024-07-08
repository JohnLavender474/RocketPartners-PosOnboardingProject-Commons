package com.rocketpartners.onboarding.commons.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a transaction in a point of sale system. A transaction has a unique ID, customer ID, point of sale
 * system ID, transaction number, time completed, line items, subtotal, discounts applied, taxes, total, voided status,
 * and tendered status. Transactions are made up of one or more line items.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Transaction {

    private String id;
    private String posSystemId;
    private List<LineItem> lineItems;
    private int transactionNumber;
    private BigDecimal subtotal;
    private BigDecimal taxes;
    private BigDecimal discountAmount;
    private BigDecimal total;
    private BigDecimal amountTendered;
    private BigDecimal changeDue;
    private String customerId;
    private boolean voided;
    private boolean tendered;
    private LocalDateTime timeCreated;
    private LocalDateTime timeCompleted;

    public Transaction() {
        lineItems = new ArrayList<>();
        subtotal = BigDecimal.ZERO;
        taxes = BigDecimal.ZERO;
        discountAmount = BigDecimal.ZERO;
        total = BigDecimal.ZERO;
        amountTendered = BigDecimal.ZERO;
        changeDue = BigDecimal.ZERO;
    }
}
