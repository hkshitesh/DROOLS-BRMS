package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Order {
    private String customerType;
    private double orderAmount;
    private String productCategory;
    private boolean isProcessed;

    public Order(String customerType, double orderAmount, String productCategory) {
        this.customerType = customerType;
        this.orderAmount = orderAmount;
        this.productCategory = productCategory;
    }
}
