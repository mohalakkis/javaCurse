import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner numeroSum = new Scanner(System.in)) {
            System.out.print("Digite o valor 1: ");
            if (!numeroSum.hasNextDouble()) {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                return;
            }
            double valor1 = numeroSum.nextDouble();

            System.out.print("Digite o valor 2: ");
            if (!numeroSum.hasNextDouble()) {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                return;
            }
            double valor2 = numeroSum.nextDouble();

            double sum = valor1 + valor2;
            System.out.println("A soma deu: " + sum);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
