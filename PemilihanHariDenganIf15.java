import java.util.Scanner;
public class PemilihanHariDenganIf15 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String dayType;
        int dayNumber;

        System.out.print("Input day number (1-7): ");
        dayNumber = input.nextInt();

        if (dayNumber > 0 && dayNumber < 6) {
            dayType = "weekday";
            System.out.println(dayType);
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "weekend";
            System.out.println(dayType);
        } else {
            System.out.println("Invalid number");
        }
    }
}