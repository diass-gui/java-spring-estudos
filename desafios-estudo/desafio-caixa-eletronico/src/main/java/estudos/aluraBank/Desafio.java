package estudos.aluraBank;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Guilherme Dias";
        String tipoConta = "Corrente";
        int opcao = 0;
        double saldo = 1599.99;

        System.out.println("***************************************************");
        System.out.println("\n Nome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************************************");

        String menu = """
                ** Digite uma das opções: **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if(opcao == 2) {
                System.out.println("Informe o valor da transferencia: ");
                double valor = leitura.nextDouble();

                if(valor >= saldo) {
                    System.out.println("Não é possível fazer a transação. Saldo insuficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if(opcao == 3) {
                System.out.println("Informe o valor que você irá receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if(opcao != 4) {
                System.out.println("Opção inválida.");
            }

        }
    }
}
