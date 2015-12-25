package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class Sku {
    private long quantity;

    public Sku(){}

    public Sku(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}