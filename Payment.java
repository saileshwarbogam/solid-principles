package solid;

public abstract class Payment {
    public  void makePayment(String plan){
        if(plan.equals("premium")){
            System.out.println("Please pay 1000/-");
        }
        else if(plan.equals("standard")){
            System.out.println("Please pay 600/-");
        }
        else if(plan.equals("basic")){
            System.out.println("Please pay 400/-");
        }
    }
    public abstract void paymentMode(int amount);
}

