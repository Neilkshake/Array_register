import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = Character.toUpperCase(scanner.next().charAt(0));

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            pessoas.add(new Pessoa(nome, sexo, idade));

            System.out.print("Deseja continuar? (S/N): ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));
        } while (continuar == 'S');

        System.out.println("\n--- Pessoas Registradas ---");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo() + ", Idade: " + pessoa.getIdade());
        }

        scanner.close();
    }
}