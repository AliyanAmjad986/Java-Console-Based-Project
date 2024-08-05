// Project: A simple four Operational Caculator Before OOPs concepts 
//i import library for getting input from user
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
         //obj for getting input from user
        Scanner myobj = new Scanner(System.in);
        boolean isother_operation = true ;
        //use loop to perform other operator
        while (isother_operation) {
        //how many number can calcuate
        System.out.println("How many numbers you calculate");
       //how many numbers and how many loop will work 
        int n = myobj.nextInt();
        while(n <= 1){
            System.out.println("plese input More The 1 value");
            n = myobj.nextInt();
        }

        int[] variable = new int [n]; // single D array
        //use loop for getting input at index of array
        for(int i = 0; i < n;  i++ ){
            System.out.println("Enter " + i +" Number:");
            variable[i] = myobj.nextInt();
            System.out.println("the index number "+ i + " value is "+ variable[i]);
        }
        //use loop for displaying values which we get
        for(int i =0; i < n; i++){
            System.out.println(variable[i]);
        }
        //use loop and switch statments for get operator from user which want
         char value;
        boolean isvalidinput = false;
        Scanner myval = new Scanner(System.in);  
       // taking iput repeatly when user give a correct input
        while(!isvalidinput){
            System.out.println("Which Operator do you perform (+, -, *, /)");
            value = myval.next().charAt(0);   
        if(value == '+' || value == '-' || value == '*' || value == '/'){
            isvalidinput = true;
        } else {
            System.out.println("Please Enter Operator only");
        }
    
        // initial variables for performing operation in switch statment
        int sum = 0;
        int sub = 0 ;
        int mul =1;
        double divi = 1;
        //switch statement for decision
    switch (value) {
        
    //for addition
        case '+':
        for(int i = 0; i < n; i++){
        sum = sum + variable[i];
        if(i == n-1){
             System.out.println(sum);
            }
        }
        break;
     
     //for subtraction
        case '-':
       for(int i = 0; i < n; i++){
        if(variable[i] > sub){
            sub = variable[i] - sub;
        }
        if(variable[i] < sub){
            sub = sub - variable[i];
        }
        if(i == n-1){
        System.out.println("the subtraction is: " + sub);
        } }
            break;

    //for multiplication        
        case '*':
        for(int i = 0; i < n; i++) {
            mul = variable[i] * mul;
        if(i == n-1){
        System.out.println("the multiplication is: " + mul); 
        }}
            break;

    //for divide    
        case '/':
        for(int i = 0; i < n; i++){
       if(divi == 1){
            divi =  variable[i] / divi;
       }else
       {
        divi = divi / variable[i];
       }
        if(i == n-1){
        System.out.println("the Division is: " + divi); 
        }}
            break;

    //if user wrong input
        default:
        System.out.println("Wrong input");
}
}
myval.close();

//for continious operation
String other_operation ;
System.out.println("Do you Want to Perform more operator: ");
other_operation = myobj.next();
if(!other_operation.equalsIgnoreCase("yes")){
isother_operation = false;
}        
}

myobj.close();
}}

