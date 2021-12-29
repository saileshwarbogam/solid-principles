package solid;

public class UpiPayment extends Payment{

    @Override
    public void paymentMode(int amount) {
        System.out.println("Please pay "+amount+" through UPI");
    }
}
