package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		// Incremento e decremento
		
		num1++; // incremento pós-fixado
		System.out.println(num1);
		
		--num1; // incremento pŕe-fixado
		System.out.println(num1);
		
		System.out.println(++num1 == num2--); // pessima pratica, dificil de entender
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		
		
		// Complemento binário
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// Negação
		System.out.println("Negação de false = " + !false);
		System.out.println("Negação de true = " + !true);
	}
}
