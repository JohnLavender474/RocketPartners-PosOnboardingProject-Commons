package com.rocketpartners.onboarding.commons.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Data transfer object for transactions.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class TransactionDto {

    private List<LineItemDto> lineItemDtos;
    private String storeName;
    private int posLane;
    private int transactionNumber;
    private BigDecimal subtotal;
    private BigDecimal discounts;
    private BigDecimal taxes;
    private BigDecimal total;
    private BigDecimal amountTendered;
    private BigDecimal changeDue;

    /**
     * Create a new TransactionDto with empty line items and zeroed out numbers.
     */
    public TransactionDto() {
        lineItemDtos = new ArrayList<>();
        posLane = 0;
        transactionNumber = 0;
        subtotal = BigDecimal.ZERO;
        discounts = BigDecimal.ZERO;
        taxes = BigDecimal.ZERO;
        total = BigDecimal.ZERO;
        amountTendered = BigDecimal.ZERO;
        changeDue = BigDecimal.ZERO;
    }

    /**
     * Create a new TransactionDto with the given values.
     *
     * @param lineItemDtos the line items in the transaction
     * @param storeName the name of the store
     * @param posLane the lane number of the point of sale system
     * @param transactionNumber the transaction number
     * @param subtotal the subtotal of the transaction
     * @param discounts the total discounts applied to the transaction
     * @param taxes the total taxes applied to the transaction
     * @param total the total amount of the transaction
     * @param amountTendered the amount tendered by the customer
     * @param changeDue the amount of change due to the customer
     * @return the new TransactionDto
     */
    public static TransactionDto from(@NonNull List<LineItemDto> lineItemDtos, @NonNull String storeName,
                                      int posLane, int transactionNumber, @NonNull BigDecimal subtotal,
                                      @NonNull BigDecimal discounts, @NonNull BigDecimal taxes,
                                      @NonNull BigDecimal total, @NonNull BigDecimal amountTendered,
                                      @NonNull BigDecimal changeDue) {
        return new TransactionDto(
                lineItemDtos, storeName, posLane, transactionNumber, subtotal, discounts, taxes, total,
                amountTendered, changeDue);
    }
}
