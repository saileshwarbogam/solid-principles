package solid;

public class CardPayment implements Payment{


    @Override
    public void makePayment() {
        System.out.println("Pay through card");
    }
}
