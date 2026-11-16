public class IT26102608Lab8Q2{
    
    public static void main(String[] args){
       
        int A[] = new int[] {10,20,30,40,50};
        int B[] = new int[] {34,67,12,89,12};
        int C[] = new int [5];
        
        for(int i=0; i<A.length; i++){
            C[i] = A[i]+B[i];
        }
        
        System.out.println("A Array Contents:");
        for (int j=0; j<5; j++){
            System.out.print(A[j] + " ");
        }
        
        System.out.println("\n\nB Array Contents:");
        for (int k=0; k<5; k++){
            System.out.print(B[k] + " ");
        }
        
        System.out.println("\n\nC Array Contents (A + B):");
        for (int l=0; l<5; l++){
            System.out.print(C[l] + " ");
        }
        System.out.println();
    }
}