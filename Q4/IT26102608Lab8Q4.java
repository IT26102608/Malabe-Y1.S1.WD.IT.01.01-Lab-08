import java.util.Scanner;

public class IT26102608Lab8Q4{

	public static void main(String[] args){
	
		int studentsArray[] = new int [8];
		int studID, count;
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<=8; i++){
			
			System.out.print("Enter Student ID for Student " + i + ":");
			count = i-1;
			studID = input.nextInt();
			if(studID<1){
				System.out.println("Error: please Enter ONLY Positive Numbers");
				i--;
				continue;
			}
			studentsArray[count] = studID;
		}
		
		System.out.print("\nEnter a Student ID to Search: ");
		int query = input.nextInt();
		
		for (int k = 0; k < studentsArray. length; k++) {
				if (studentsArray [k] == query) {
					System.out.println("\nStudent is Available");
			    }
				else if (k==7){
					System.out.println("Student is not Available");
				}
				else{
					
				}
			}
		input.close();
	}
}