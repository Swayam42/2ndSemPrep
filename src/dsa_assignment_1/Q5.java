package dsa_assignment_1;

public class Q5 {
   
    public static int sum_Of_Digits(int n){
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    

    public static void main(String[] args) {
    int n =9294;
    int res=sum_Of_Digits(n);

    System.out.println("Sum of digits of "+ n+" until the number is a single digit is "+res);
    }
}
