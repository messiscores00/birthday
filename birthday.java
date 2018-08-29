import java.util.Scanner;
import java.util.Calendar;
public class birthday
{
    public static void main(String[] arg){
        System.out.println("Please enter your birthday: ");
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        
        Calendar today = Calendar.getInstance();
        int birthMonth = Integer.parseInt(exp.substring(0,2));
        int birtDay = Integer.parseInt(exp.substring(3,5));
        int birthYear = Integer.parseInt(exp.substring(6));
        
        int ageYears = today.get(Calendar.YEAR);
        int ageDays = today.get(Calendar.DATE);
        int ageMonth
    }
}
