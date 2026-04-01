import java.util.Scanner;

public class alistamento {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o nome do(a) recruta: ");// Solicita ao usuário que digite seu nome
            String nome = scanner.next(); // Lê o nome do usuário e armazena na variável 'nome'
                
                System.out.print("Digite o peso do(a) recruta: ");// Solicita ao usuário que digite seu peso
            double peso = scanner.nextDouble(); // Lê o peso do usuário e armazena na variável 'peso'
            
            if (peso < 50) {
                System.out.println("Você tem o peso abaixo do ideal. Não está apto para o alistamento militar.");
            } else if (peso >= 50 && peso <= 100) {
                System.out.println("Você tem o peso dentro do ideal. Está apto para o alistamento militar.");
            } else {
                System.out.println("Você tem o peso acima do ideal. Ainda não está apto para o alistamento militar.");
            }
            
            scanner.close(); // Fecha o scanner
        }
}
