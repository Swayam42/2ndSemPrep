package dsa_assignment_3;

public class Q8 {
    
    static int pow(int x,int n){
       if(n==0){
        return 1;
       }
        int y=pow(x, n-1);
        return y*x;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}
