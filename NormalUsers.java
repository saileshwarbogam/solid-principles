package solid;

public class NormalUsers implements Users{

    @Override
    public  String userType() {
        return new String("Normal");
    }
}
