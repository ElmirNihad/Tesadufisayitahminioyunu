import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int reqem =0;
        int own;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        own = rand.nextInt(100);
        System.out.println(own);
        while (own !=reqem){
            System.out.print("Təsadüfi sayı tapmağa çalışın (1 ilə 100 arasında bir ədəd) : ");
            reqem = input.nextInt();
            if(reqem > own){
                System.out.println("Təxmininiz böyüktür, Yenidən cəhd edin.");
            } else if (reqem < own) {
                System.out.println("Təxmininiz  kiçikdir, Yenidən cəhd edin.");
            }else{
                System.out.println("Təbrik edirəm! Doğru cavabı tapdınız.");
            }
        }
    }
}