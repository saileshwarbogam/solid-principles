package solid;

public class NetBanking extends Payment{
    @Override
    public void paymentMode(int amount) {
        System.out.println("Please pay "+amount+" through Net Banking ");
    }
}