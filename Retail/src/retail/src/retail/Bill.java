package retail;

public abstract class Bill {
   protected long billId;
   private Customer cust;
   private double totalPrice;
   private double promoPrice;

    public Bill(Customer cust, double totalPrice) {
        this.cust = cust;
        this.totalPrice = totalPrice;
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

    public void setTotalPrice(double price) {
        this.totalPrice = totalPrice;
    }

    public void setPromoPrice(Bill bill, double minPrice,
            double percentPro, double maxPro) {
      /*  if(){
        
        }*/
        
        
    }

    @Override
    public String toString() {
        return "Bill id: " + billId + " " + cust + "\nTotal Price = " + totalPrice + ", Promotion Price=" + promoPrice + "\nNet = " + (totalPrice - promoPrice)+"\n------------------------------------";
    }
    
    
    
    
    
            
}
