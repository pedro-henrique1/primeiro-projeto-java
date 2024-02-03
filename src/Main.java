import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String name = "pedro 123";
        String contaTipo = "Corrente";
        double saldo = 2500;
        int opcao = 0;
        System.out.println("*****************************");
        System.out.println("dados do cliente");
        System.out.println("Nome: " + name);
        System.out.println("Tipo de conta: " + contaTipo);
        System.out.println("Saldo inical: " + saldo);
        System.out.println("*************************");


        String menu = """
                Operaçoes
                1- Consultar saldo
                2- receber valor
                3- transferir valor
                4- sair
                                
                Digite a opçao desejada
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo é " + saldo);
            }
            if (opcao == 2) {
                System.out.println("Digite seu saldo para depositar");
                saldo += leitura.nextInt();
                System.out.println("Saldo atualizado " + saldo);
            }
            if (opcao == 3) {
                System.out.println("digite o valor para transferir");
                if (saldo < leitura.nextInt()) {
                    System.out.println("O valor de trasnferencia nao disponivel");
                    return;
                }
                saldo -= leitura.nextInt();

                System.out.println("trasnferido " + saldo);
            }
            if(opcao != 4) {
                System.out.println("Opção invalida");
            }

        }

    }
}