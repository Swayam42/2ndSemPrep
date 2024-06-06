package dsa_assignment_1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input num to check spy or not: ");
        int num=sc.nextInt();
        sc.close();
        int prod=1;
        int sum=0;
        while(num>0){
             int x=num%10;
             prod*=x;
             sum+=x;
             num=num/10;
        }
        if(prod==sum)
            System.out.println("spy");
        else
            System.out.println("not spy");
    }
}
