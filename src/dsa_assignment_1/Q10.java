package dsa_assignment_1;

import java.util.Scanner;

public class Q10 {
    
    public static double sumColumn(double arr [][] , int columnIndex){
              double sum=0;
              for(int i=0;i<arr.length;i++){
                sum+=arr[i][columnIndex];
                
              }
              return sum;
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter rows: ");
       int r=sc.nextInt();
       System.out.print("Enter columns: ");
       int c=sc.nextInt();
       double arr[][]=new double[r][c];
       System.out.println("Enter a "+r+"-by-"+c+" array row by row: ");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr[i][j]=sc.nextDouble();

        }
    } 
    sc.close();

    for(int j=0;j<c;j++){
        System.out.println("Sum of the elements at column "+ j+" is "+ sumColumn(arr, j));
           
    }
    }
}
