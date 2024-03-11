import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		int x = 0;
		int y = 1;
		
		while(y <= num) { 
			
			int fibonacci = y;
			y = x + y;
			x = fibonacci;
			
			if(fibonacci == num || num == 0) {
				System.out.println(num + " pertence a sequência de fibonacci");
				break;
			} else {
				System.out.println(num + " não pertence a sequência fibonacci");
			}
		}
		
		sc.close();
	}
}

