
public class HelloWorld {

	public static void main(String[] args) {
		
		int price = 10;
		
		int money = 80;
		
		if (money >= price) {
			System.out.println("Voc� pode comprar!");
		}
		else {
			System.out.println("Voc� n�o pode comprar!");
		}
		//if (money < price) {
			//System.out.println("Voc� n�o pode comprar!");
		//}
		
		
		int nota = 60;
		
		if (nota >= 60) {
			System.out.println("Voc� passou :)");
		} else {
			System.out.println("Recupera��o :(");
		}
		
		int a = 30;
		int b = 45;
		
		if (a > b) {
			System.out.println("O maior �: " + a);
		} else {
			System.out.println("O maior �: " + b);
		}
	}
	
}
