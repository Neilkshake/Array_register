import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Pessoa> pessoasFeminino = new ArrayList<>();
        ArrayList<Pessoa> pessoasMasculino = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = Character.toUpperCase(scanner.next().charAt(0));

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            Pessoa pessoa = new Pessoa(nome, sexo, idade);
            pessoas.add(pessoa);

            if (sexo == 'F') {
                pessoasFeminino.add(pessoa);
            } else if (sexo == 'M') {
                pessoasMasculino.add(pessoa);
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));
        } while (continuar == 'S');

        // Ordenar os ArrayLists pelo nome
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
        Collections.sort(pessoasFeminino, Comparator.comparing(Pessoa::getNome));
        Collections.sort(pessoasMasculino, Comparator.comparing(Pessoa::getNome));

        // Exibir as informações registradas por grupo
        System.out.println("\n--- Pessoas Feminino ---");
        for (Pessoa pessoa : pessoasFeminino) {
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo() + ", Idade: " + pessoa.getIdade());
        }

        System.out.println("\n--- Pessoas Masculino ---");
        for (Pessoa pessoa : pessoasMasculino) {
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo() + ", Idade: " + pessoa.getIdade());
        }

        scanner.close();
    }
}