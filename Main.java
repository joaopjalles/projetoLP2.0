import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Exemplo DO WHILE");
        int opcao = -1;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("** SISTEMA DE CADASTRO");
            System.out.println("Opção 1: Cadastrar o cliente");
            System.out.println("Opção 2: Cadastrar o produto");
            System.out.println("Opção 3: Cadastrar o vendedor");
            System.out.println("Opção 1: Cadastrar o cliente");
            System.out.println("Opção 0: Sair");
            System.out.println("****************************");
            System.out.println("Digite a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida");
                    exerc1();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    exerc2();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida");
                    exerc3();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida");
                    break;
                default:
                    System.out.println("O número escolhido é inválido");
            }
        }while (opcao != 0);
    }

    private static void exerc1() {
        //Quatro números e calcula a soma
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite o " + i + "número");
            soma += scn.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }

    private static void exerc2() {
        //Tres notas, calcule e mostra a média aritmética
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a " + i + "nota ");
            soma += scn.nextInt();
        }
        System.out.println("A média é: " + soma/3);
    }

    private static void exerc3() {
        //salário funcionário, calcule e mostre o novo com aumento de 25%
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salarioAtual = scn.nextDouble();
        double aumento = salarioAtual * 0.25;
        double novoSalario = salarioAtual + aumento;
        System.out.println("Novo salário com aumento: " + novoSalario);
        System.out.println("Seu aumento foi de: " + aumento);
    }
}