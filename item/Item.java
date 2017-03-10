
package item;

public abstract class Item {
    protected String appName, category;
    private double price;
    private String orderBy;

    public Item(String appName, String category, double price, String orderBy) {
        this.appName = appName;
        this.category = category;
        this.price = price;
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public abstract String getType();
     
    @Override
    public String toString() {
        return "Item{" + "appName=" + appName + ", category=" + category + ", price=" + price + ", orderBy=" + orderBy + '}';
    }
    
    
    
}
