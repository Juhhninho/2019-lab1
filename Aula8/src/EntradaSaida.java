import java.util.Scanner;
// Toda vez que for usar a classe Scanner
// eu preciso importa-la aqui antes da cria��o
// da classe!
// Para fazer isso, basta aperter "Ctrl" + "Espa�o"
// na frente do nome Scanner e selecionar a op��o
// java.util.Scanner
// Outro atalho importante do Eclipse � o 
// "Ctrl" + "Shift" + "O" (letra O!)

public class EntradaSaida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Seja bem vindo " + nome);
		
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		
		System.out.println("Sua idade �: " + idade);
	}
	
}
