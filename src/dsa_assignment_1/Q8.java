package dsa_assignment_1;
import java.util.Scanner;
public class Q8 {
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter rows: ");
       int r=sc.nextInt();
       System.out.print("Enter columns: ");
       int c=sc.nextInt();
       int arr[][]=new int[r][c];
       System.out.println("Enter elements of array: ");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr[i][j]=sc.nextInt();

        }
    }
    sc.close();
    System.out.println("The entered 2D array is : ");
    int sum=0;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            sum+=arr[i][j];
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("The sum of elements of 2D array is "+ sum);


    }
}

