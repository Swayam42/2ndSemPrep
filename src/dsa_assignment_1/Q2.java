package dsa_assignment_1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter person Weight :");
        int w=sc.nextInt();
        System.out.print("Enter height of person in meter :");
        int h=sc.nextInt();
        sc.close();
        float bmi=w/(h*h);

        if(bmi<18.5){
            System.out.println("underweight");
        }else if(bmi>=18.5&&bmi<=24.9){
            System.out.println("Normal Weight");

        }else if(bmi>=25&&bmi<=29.9){
            System.out.println("Overweight");

        }else{
            System.out.println("Obese");
        }
    }
}
