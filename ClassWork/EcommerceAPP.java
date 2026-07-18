import java.util.*;
class order{
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

// parent constructor--parameterized constructor

public order(string orderId, double totalAmount){j
    this.orderId = orderId;
    this.totalAmount = totalAmount;
    this.orderDate = new Date().toString();
    System.out.println("order created:" + orderId);

}

//parent method
public double calculateDiscount(){
    System.out.println("orderId:" + orderId);
    System.out.println("Amount: " + totalAmount);
    System.out.println("Data:"+ orderDate);

}
}

class premiumOrder extends Order {
    private String membershipTier;
    private double cashback;


//usings super() to call parent constructor
public premiumOrder(String orderId, double totalAmount, String membershipTier) {
    Super(orderId, totalAmount);
    this.membershipTier = membershipTier;
    this.cashback = totalAmount * 0.10; // 10% cashback

System.out.println("cashback" + cashback +"---");
System.out.println("membershipTier" + membershipTier +"---");
}
// Overriding with super  to reuse parent logic
@override
public double calculateDiscount() {
    //Get parent's discount (5%) and add premium discount (10%)
    double parentDiscount = super.calculateDiscount();//Calling parent method
    double premiumDiscount = totalAmount * 0.10;
    double finalDiscount = baseDiscount + premiumDiscount;
    System.out.println("premium discount applied: " + finalDiscount);
    return finalDiscount;
}

@Override
public void displayOrder() {
    Super.displayOrder(); // call parent's display
    System.out.println("membership:" + membershipTier);
    System.out.println("cashback:" + cashback);

}

}

//usage:
public class ECommerceApp {
    public static void main (string[] args){
        premiumOrder order = new premiumOrder("ORD123",5000,"Gold");
        order.displayOrder();
        order.calculateDiscount();

    }
}