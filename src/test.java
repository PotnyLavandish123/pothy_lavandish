import org.w3c.dom.ls.LSOutput;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("hour");
        Scanner scanner1 =  new Scanner(System.in);
        int min = scanner1.nextInt();
        System.out.println("min");
        Scanner scanner2 = new Scanner(System.in);
        int hour = scanner2.nextInt();
        if (hour >= 24 && min >=60 && hour <0 && min <0) {
            System.out.println("Ty daun!");
        }else if(hour == 8 && min >= 0 && min <= 30) {
            System.out.println("podyem");
        } else if (min < 60 && min >= 0) {
            
        }
    }
}
