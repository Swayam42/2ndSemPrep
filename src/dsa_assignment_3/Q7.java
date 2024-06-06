package dsa_assignment_3;
import java.util.Scanner;
public class Q7 {
   
   static int fact(int n){
    if(n<=1){
        return 1;
    }
    
    int x=fact(n-1);
    return n*x;
   }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input num : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("factorial of "+n+" is "+fact(n));
    }
}
