package solid;

public class CardPayment extends Payment{

    @Override
    public void paymentMode(int amount) {
        System.out.println("Please pay " + amount);
    }
}
