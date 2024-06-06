package dsa_assignment_1;
import java.util.*;
public class Q4 {
   
   static void Permutation(char ar[],int fi){ 
    //string is converted to array of characters for easy access

    //base condition
    if(fi==ar.length-1){
        System.out.println(ar);
        return;
    }
    for(int i=fi;i<ar.length;i++){
         swap(ar,i,fi);
         Permutation(ar, fi+1);
         swap(ar,i,fi);
         

    }


   }

   static void swap(char ar[],int i,int fi){
    char temp=ar[i];
    ar[i]=ar[fi];
    ar[fi]=temp;

   }
   
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input String : ");
        String s=sc.nextLine();
        sc.close();
        Permutation(s.toCharArray(),0);

    }
}
