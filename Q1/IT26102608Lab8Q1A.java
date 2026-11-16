import java.util.Scanner;

public class IT26102608Lab8Q1A{
    
    public static void main(String[]args){
    
        Scanner input = new Scanner(System.in);
        
        int myArray[] = new int [5];
        
        for(int i=0; i<myArray.length; i++){
            System.out.print("Enter Number " + (i+1) + ": ");
            myArray[i] = input.nextInt();
        }
        
        System.out.println("\nArray in Reverse Order:");
                
        for(int j=myArray.length-1; j>=0; j--){
            System.out.print(myArray[(j)] + " ");
        }
 
        System.out.println();
        input.close();
    }
}