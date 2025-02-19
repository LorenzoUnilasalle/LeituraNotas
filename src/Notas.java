import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota final 20 Aulas EBAC");
        System.out.print("Digite o nome do aluno(a): ");
        String nome = scanner.nextLine();
        System.out.println("Aluno(a): " + nome);

        System.out.print("Digite quantas faltas o aluno(a) teve: ");
        int faltas = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente

        if (faltas >= 6) {
            System.out.println("Reprovado(a) por falta de frequência");
        } else {
            System.out.print("Digite a nota do G1: ");
            double g1 = scanner.nextDouble();

            System.out.print("Digite a nota do G2: ");
            double g2 = scanner.nextDouble();

            System.out.print("Digite a nota do G3: ");
            double g3 = scanner.nextDouble();

            System.out.print("Digite a nota do G4: ");
            double g4 = scanner.nextDouble();

            double soma = g1 + g2;
            double media = soma / 2;
            double g1_baixo = 12 - g1;
            double g2_baixo = 12 - g2;
            double g3_baixo = 12 - g3;

            if (soma >= 12) {
                System.out.println("Aprovado(a) com média " + media);
            } else if (g1 < 2 && g2 < 2) {
                System.out.println("Reprovado(a) por insuficiência de nota");
            } else if (soma < 12 && g1 > g2) {
                System.out.println("Precisa substituir G2 e deve tirar " + g2_baixo);
            } else if (soma < 12 && g2 > g1) {
                System.out.println("Precisa substituir G1 e deve tirar " + g1_baixo);
            } else if (g1 == g2) {
                System.out.println("O(a) aluno(a) pode escolher o grau a substituir e deve tirar " + g3_baixo);
            }
        }

        scanner.close();
    }
}
