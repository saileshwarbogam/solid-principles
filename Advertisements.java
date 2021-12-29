package solid;

public class Advertisements {
    public void showAdds(Users user){
        if(user.userType().equals("Normal")){
            System.out.println("Show Advertisements");
        }
        else if(user.userType().equals("Premium")){
            System.out.println("Don't show Advertisements");
        }
    }
}