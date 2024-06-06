package dsa_assignment_1;
import java.util.Scanner;
public class HA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input no. of lines: ");
        int n=sc.nextInt();
        sc.nextLine();
        String st[]=new String [n];
        System.out.println("Enter lines: ");
        for(int i=0;i<n;i++){
            st[i]=sc.nextLine();
        }
        System.out.println("lines in reverse order: ");
        for(int j=n-1;j>=0;j--){
            System.out.println(st[j]);
        }
    }
}
