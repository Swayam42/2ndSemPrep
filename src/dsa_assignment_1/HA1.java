package dsa_assignment_1;
import java.util.Scanner;
public class HA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a : ");
        int a=sc.nextInt();
        System.out.print("Input b : ");
        int b=sc.nextInt();
        System.out.print("Input c : ");
        int c=sc.nextInt();
        sc.close();

        if(a+b==c){
            System.out.println("a+b=c is correct");
        }else if(a==b-c){
            System.out.println("a=b-c is correct");
        }else if(a*b==c){
            System.out.println("a*b=c is correct");
        }else{
            System.out.println("No formula is correct with the given numbers.");
        }
    }
}                                                                                