import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para ser revertida: ");
		String palavra = sc.next();
		String palavrainvertida = "";
		for(int i = 0; i < palavra.length(); i++) {	
			palavrainvertida = palavra.charAt(i) + palavrainvertida;
		}
		
		System.out.println(palavrainvertida);
		
		
		sc.close();
	}
}
