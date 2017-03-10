
package retail;

public class Customer {
    private long custId;
    private static long count;

    public long getCustId() {
        return custId;
    }

    public static long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Customer" + "custId=" + custId ;
    }
    
}
