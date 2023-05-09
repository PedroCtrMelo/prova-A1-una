import java.util.Scanner;

public class provaAum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Requisito 1
        
        System.out.println("escreva seu nome ");
        String nomedoFuncionario = scanner.nextLine();
        // Requisito 2
       
        System.out.println("Escreva seu peso em kg ");
        double pesoFuncionario = scanner.nextDouble();

        // Requisito 3
        
        System.out.println("Escreva a agua ingerida pelo funcionario no dia em Litros");
        double aguaIngerida = scanner.nextDouble();

        // Requisito 4

        double quantidadeIdeal = Math.ceil((pesoFuncionario * 35) / 1000);

        // Requisito 5

        double quantidadeaIngerirnoDia = quantidadeIdeal - aguaIngerida;

        // Requisito 6

        System.out.println("Nome do Funcionario : " + nomedoFuncionario);

        // Requisito 7

        System.out.println("Peso do Funcionario : " + pesoFuncionario);

        // Requisitos 8

        System.out.println("Quantidade de agua ingerida : " + quantidadeaIngerirnoDia);

        // Requisito 9

        System.out.println("Quantidade de ideal : " + quantidadeIdeal);

        // Requisito 10

        if (quantidadeaIngerirnoDia <= 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
        } else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + quantidadeaIngerirnoDia
                    + " litros! Você consegue!");
        }

        scanner.close();

    }

}