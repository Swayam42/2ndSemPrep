package dsa_assignment_1;
import java.util.Scanner;
public class HA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length of array a and b: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("enter elements of array a: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter elements of array b: ");
        for(int j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        System.out.println("dot product of a and b: ");
        int c[]=new int[n];
        for(int k=0;k<n;k++){
            c[k]=a[k]*b[k];
            System.out.print(c[k]+" ");
        }
    }
}
