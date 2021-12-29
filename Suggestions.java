package solid;

public class Suggestions implements Recommendations{
    @Override
    public void showSuggestions(int age) {
            if(age<10){
                System.out.println("Recommend videos suitable for age group less than 10");
            }
            else if(age>18 && age<40){
                System.out.println("Recommend videos suitable for age group between 18 and 40");
            }
            else if(age > 40){
                System.out.println("Recommend health care videos");
            }
    }
}
