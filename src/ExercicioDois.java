
public class ExercicioDois {
 
	public static void main(String[] args) {
		
		int numeroA = 30;
		int numeroB = 45;
		int numeroC; 
		
		System.out.println("Valor um �: " + numeroA);
		System.out.println("Valor dois �: " + numeroB);
		
		numeroC = numeroA;
		numeroA = numeroB;
	    numeroB = numeroC; 
	    
	    System.out.println("agora VALOR UM passa a ser: " + numeroA);
		System.out.println("agora VALOR DOIS passa a ser: " + numeroB);
	}
}
 	