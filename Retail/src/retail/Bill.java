
package retail;

public class Bill {
    protected long billId;
    private  Customer cust;
    private double totalPrice,promoPrice;

    public Bill() {
    }
    
   
    public Bill( Customer cust, double Price) {
       
        this.cust = cust;
        this.totalPrice = totalPrice;
        this.promoPrice = promoPrice;
    }

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

   

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice( Bill bill, double minPrice, double maxPro) {
        this.promoPrice = promoPrice;
    }

    @Override
    public String toString() {
        return "Bill{" + "billId=" + billId + ", cust=" + cust + ", totalPrice=" + totalPrice + ", promoPrice=" + promoPrice + '}';
    }
    
    
    
    
}
