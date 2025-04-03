import java.util.Scanner;

public class CalculodoImc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
        
        Pessoa pessoa = new Pessoa(nome, peso, altura);
        pessoa.mostrarResultado();
        
        scanner.close();
    }
}