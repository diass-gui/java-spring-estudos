package guilhermeDias.estudos_Java;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Informe o ano de lançamento do filme informado: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação a respeito do filme informado: (avalie de 0 a 10)");
        double avaliacao = leitura.nextDouble();

        System.out.println("""
            O seu filme favorito é: %s;
            O ano de lançamento desse filme é: %d; 
            E a sua avaliação para esse filme é: %f.
    """.formatted(filme, anoDeLancamento, avaliacao));

    }
}
