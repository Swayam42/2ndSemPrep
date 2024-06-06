package dsa_assignment_1;
import java.util.Scanner;
public class Q7 {
    
    static void Max(int arr[]){
       if(arr==null||arr.length==0){
        System.out.println("Array is empty");
       }
       
       
        int max=arr[0];int cmax=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                cmax=1;
            }else if(arr[i]==max){
                cmax++;
            }

        }System.out.println("Maximum element of Array is "+max +" and occurs "+cmax+" times.");
    } 
           
        
        static void Min(int arr[]){
            if(arr==null||arr.length==0){
                System.out.println("Array is empty");
            }
            int min=arr[0];int cmin=1;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                    cmin=1;
                }else if(arr[i]==min){
                    cmin++;
                }    
            }System.out.println("Minimum element of Array is "+min +" and occurs "+cmin+" times.");
        }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input array size : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Max(arr);
        Min(arr);
    }
}
