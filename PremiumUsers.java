package solid;

public class PremiumUsers implements Users {


    @Override
    public String userType() {
        return new String("Premium");
    }
}
