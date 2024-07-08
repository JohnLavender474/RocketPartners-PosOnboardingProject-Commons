package com.rocketpartners.onboarding.commons.model;

import lombok.*;

import java.math.BigDecimal;

/**
 * Data transfer object for line items
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class LineItemDto {

    private String itemUpc;
    private String itemName;
    private String transactionId;
    private BigDecimal unitPrice;
    private int quantity;
    private boolean voided;
    private String category;
    private String description;

    /**
     * Create a new LineItemDto with empty values.
     */
    public LineItemDto() {
        itemUpc = "";
        itemName = "";
        transactionId = "";
        unitPrice = BigDecimal.ZERO;
        quantity = 0;
        voided = false;
        category = "";
        description = "";
    }

    /**
     * Create a new LineItemDto from a LineItem and an Item.
     *
     * @param lineItem the line item
     * @param item     the item
     * @return the created LineItemDto
     */
    public static LineItemDto from(@NonNull LineItem lineItem, @NonNull Item item) {
        return new LineItemDto(
                lineItem.getItemUpc(),
                item.getName(),
                lineItem.getTransactionId(),
                item.getUnitPrice(),
                lineItem.getQuantity(),
                lineItem.isVoided(),
                item.getCategory(),
                item.getDescription()
        );
    }
}
