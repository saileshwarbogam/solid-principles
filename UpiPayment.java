package solid;

public class UpiPayment implements Payment{

    @Override
    public void makePayment() {
        System.out.println("Pay through UPI");
    }
}
