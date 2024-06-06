package EndSemPrep;
import java.util.Scanner;
//create a class called Stack 
class Stack{
    /*Instance variables:
    1. create an array
    2.declare a var for capacity
    3.a var top which resembles the index of array */
   
    int a[];
    int capacity;
    int top;
    
    /*a parametrised constructor Stack() taking capacity as a parameter
    and initiates the array a with capacity.... then capacity value is stored in capacity 
    top ==-1 which means empty stack*/
   
    Stack(int capacity){
        a=new int [capacity];
        this.capacity=capacity;
        top=-1;
    }
    //push()method to add members to stack
 void push(){
    //when top index points to capacity-1 then no other members can be added to that stack
    if(top==capacity-1){
        System.out.println("Overflow");
    }
    else{
       Scanner in=new Scanner(System.in);
        System.out.print("Enter data: ");
        int d=in.nextInt();
        a[++top]=d;
        System.out.println(d+" inserted");
        //top=top+1;
        //a[top]=d;
       
    }
 }
 int pop(){
    //check for underflow:
    if(top==-1){
        System.out.println("UnderFlow");
        return -1;
    }
    else{
        //first store the top value in a var:
        int x=a[top];
        //decrese top value by 1:
        top--;
        System.out.println(x+" deleted");
        //return the deleted item:
        return x;
    }
 }
 //peek method: returns the top value without removing it
 int peek(){
    if(top==-1){
        System.out.println("Underflow");
        return -1;
    }else{
        System.out.println(a[top]);
        return a[top];
    }
 }

 //Display function
 void display(){
    System.out.println("The items are: ");
    for(int i=top;i>=0;i--){
        System.out.println(a[i]);
    }
 }
}

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        //create a Stack object of any size
        Stack s=new Stack(4);
        int l;
        do{
        System.out.println("Press 1 to push");
        System.out.println("Press 2 to pop");
        System.out.println("Press 3 to peek");
        System.out.println("Press 4 to display");
        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:{
                s.push();
                break;
            }
            case 2:{
            s.pop();
            break;
            }
            case 3:
            {
                s.peek();
                break;
            }
            case 4:
            s.display();
            break;
        }System.out.println("Enter 0 to go back to main menu: ");
        System.out.println("Enter any key to exit");
        l=sc.nextInt();
    }while(l==0);
    System.out.println("EXIT SUCCESSFUL");


        
    }
}
