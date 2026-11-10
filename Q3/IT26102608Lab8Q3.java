import java.util.Scanner;

public class IT26102608Lab8Q3{

	public static void main(String[] args){
	
		int A[] = new int [6];
		int number, count, maxNum=0;
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<=6; i++){
			
			System.out.print("Enter a Positive Number (" + i +"/6): " );
			count = i-1;
			number = input.nextInt();
			if(number<1){
				System.out.println("Error: please Enter ONLY Positive Numbers");
				i--;
				continue;
			}
			A[count] = number;
			maxNum = A[0];

			for (int k = 0; k < A. length; k++) {
				if (A [k] > maxNum) {
				maxNum = A [k] ;
			    }
			}
		}
		
		System.out.println("\nArray Contents:");
		for (int j=0; j<6; j++){
			System.out.print(A[j] + " ");
		}
		System.out.println();
		System.out.println("The Maximum Number Entered: " + maxNum);
		input.close();
	}
}