package guilhermeDias.estudos_Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // váriaveis precisam ser declaradas em camelCase
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média de avaliações do filme: " + media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println("Sinopse do filme: " + sinopse);

        int classificacao = (int) (media /2); // n sei se está correto o parenteses na expressao, mas ok
        System.out.println("Classíficação do filme: " + classificacao);
    }
}
