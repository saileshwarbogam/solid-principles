package solid;

public class NormalUser extends UserOperations implements Users {

    @Override
    public  String userType() {
        return new String("Normal");
    }
}
