import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        LocalTime time1 = LocalTime.of(a, 00, 00); 
        LocalTime time2 = LocalTime.of(b, 00, 00); 

        long hours = ChronoUnit.HOURS.between(time1, time2); 

        if(a == b){
            hours = 24;
        }else if(hours < 0){
            hours = hours + 24;
        }

        System.out.println("O JOGO DUROU " + hours + " HORA(S)"); 
    }
}
