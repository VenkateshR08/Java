import java.util.Scanner;
public class alphabet {

	public static void main(String[] args) {
		char letters;
		System.out.println("Enter a alphabet letter: ");
		Scanner scanner = new Scanner(System.in);
		letters = scanner.next().charAt(0);
		switch(letters) {
		case 'a','e','i','o','u':
			System.out.println("Your entered Letter is Vowel.");
			break;
		default:
			System.out.println("Your entered Letter is Consonant.");
			
		}

	}

}
