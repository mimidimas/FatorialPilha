package view;
import java.util.Scanner;
import br.edu.fateczl.pilhaint.*;
public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha p = new Pilha();

        System.out.print("Digite um número entre 0 e 10: ");
        int n = scanner.nextInt();

        if (n < 0 || n > 10) {
            System.out.println("Número fora do intervalo permitido.");
        } else if (n == 0 || n == 1) {
            System.out.println("Fatorial de " + n + " é 1");
        } else {
            for (int i = 1; i <= n; i++) {
                if (p.isEmpty()) {
                    p.push(i);
                } else {
                    int topo = 0;
					try {
						topo = p.top();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    p.push(i * topo);
                }
            }
            try {
				System.out.println("Fatorial de " + n + " é " + p.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
        }

        scanner.close();
    }
}