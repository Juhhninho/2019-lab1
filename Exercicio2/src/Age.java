
public class Age {

	public static void main(String[] args) {
		int birthdayYear = 1964;
		
		int todaysYear = 2019;
		
		int age = todaysYear - birthdayYear;
		
		if (age >= 18) {
			System.out.println("Voc� � obrigado a votar!");
		} else {
			System.out.println("Voc� ainda n�o � obrigado a votar!");
		}
	}
}
