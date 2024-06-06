package dsa_assignment_1;
import java.util.Scanner;
public class Q9 {
    
    static double diagonalSum(double arr[][]){
        double sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }return sum;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        double arr[][]=new double[n][n];
        System.out.print("Enter a "+n+"-by-"+n+" matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        sc.close();
        System.out.println("Sum of the elements in the major diagonal is "+diagonalSum(arr));

    }
}
                                                                                             