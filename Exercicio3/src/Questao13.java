import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1� valor:");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o 2� valor:");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o 3� valor:");
		int c = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o 4� valor:");
		int d = scanner.nextInt();
		scanner.nextLine();

		int produtoAB = a * b;
		int produtoCD = c * d;
		int resultado = produtoAB - produtoCD;
		
		System.out.println("Resultado: " + resultado);
	}
	
}
