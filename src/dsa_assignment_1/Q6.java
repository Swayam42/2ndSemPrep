package dsa_assignment_1;

public class Q6 {
    
    static boolean isOdd(int n){
        while(n>=1){
            n=n-2;
        }
        if(n==1)
            return true;
        else
           return false;

    }
    public static void main(String[] args) {
        System.out.println(isOdd(8));
    }
}
