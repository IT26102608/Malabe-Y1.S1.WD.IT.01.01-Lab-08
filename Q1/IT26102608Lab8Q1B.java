import java.util.Scanner;

public class IT26102608Lab8Q1B{
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int myArray[] = new int [5];
        int evenCount = 0;
        
        for(int i=0; i<myArray.length; i++){
            System.out.print("Enter Number " + (i+1) + ": ");
            myArray[i] = input.nextInt();
            if(myArray[i]%2 == 0){
                evenCount++;
            }
        }
        System.out.println("\nmyArray Contents:");
        for(int j=0; j<myArray.length; j++){
            System.out.print(myArray[j] + " ");
        }
 
        int evenArray[] = new int [(evenCount)];
        int evenIndex = 0;
        for(int k=0; k<myArray.length; k++){
            if(myArray[k]%2 == 0){
                evenArray[evenIndex] = myArray[k];
                evenIndex++;
            }
        }
        
        System.out.println("\n\nevenArray Contents:");
        for(int l=0; l<evenArray.length; l++){
            System.out.print(evenArray[l] + " ");
        }
        
        System.out.println();
        input.close();
    }
}