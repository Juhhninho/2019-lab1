
public class Condicoes {

	public static void main(String[] args) {
		int age = 107;
		
		if (age < 18) {
			if (age > 15) {
				System.out.println("Voc� n�o � obrigado a"
						+ " votar mas j� pode!");
			} else {
				System.out.println("Voc� ainda n�o pode votar!");
			}
		} else {
			if (age > 70) {
				System.out.println("Voc� pode votar, mas n�o"
						+ " � obrigado!");
				
			} else {
				System.out.println("Voc� tem que votar!");
			}
		}
 	}
	
}
