package dsa_assignment_1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("input num: ");
        int num=sc.nextInt();
        int y=num;
        sc.close();
        int count=0;
        while(num>2){
            
            num=num/2;
            count++;

        }
        System.out.println("The number of times one must repeatedly divide " +y+"  by 2 before getting a value less than 2 is "+ count);

    }
}
