package if_conditional;
import java.util.Locale;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("___________Time table of Btech ECE branch student of 1St Year 2nd Sem_________");
        String daysofweeks = sc.nextLine();
        daysofweeks.toLowerCase(Locale.ROOT);
        if (daysofweeks == "monday" || daysofweeks =="sunday" ||daysofweeks == "tuesday" ||daysofweeks == "wednesday" ||daysofweeks == "thursday" ||daysofweeks == "friday" || daysofweeks == "saturday" ){
            switch(daysofweeks){
                case "monday":

            }
        } else {
            System.out.println(" ENter correct Day");
            int i;
            for (i = 0; i>=10; i++){

            }

        }
        class c1{
            String daysofweeks = sc.nextLine();

        }
    }
}
