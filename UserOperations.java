package solid;

import java.util.ArrayList;
import java.util.List;
//Single responsibility principle
public class UserOperations{
    List<String> users = new ArrayList<>();
    public void register(String username, String password){
        if(!username.isEmpty() && !password.isEmpty() && !users.contains(username)) {
            users.add(username);
            MailService.sendmail(username);
        }
        else{
            System.out.println("User already exists");
        }
    }
    public void login(String username, String password){
        if(users.contains(username)){
            System.out.println("Login Successfull");
        }
        else {
            System.out.println("Enter valid credentials");
        }
    }
}
