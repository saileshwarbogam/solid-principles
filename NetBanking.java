package solid;

public class NetBanking implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Pay through Net Banking");
    }


}