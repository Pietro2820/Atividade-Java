import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Acrescente as idades de 20 usuários");

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade do usuário " + (i + 1) + ": ");
            int idade = entrada.nextInt(); 

          
            String categoria;
            switch (idade) {
                case 6, 7 -> categoria = "Sub-7";
                case 8 -> categoria = "Sub-8";
                case 9 -> categoria = "Sub-9";
                case 10, 11 -> categoria = "Sub-11";
                case 12, 13 -> categoria = "Sub-13";
                case 14, 15 -> categoria = "Sub-15";
                case 16, 17 -> categoria = "Sub-17";
                case 18, 19, 20 -> categoria = "Sub-20";
                default -> categoria = "Fora das categorias definidas";
            }

            System.out.println("O usuário " + (i + 1) + " pertence à categoria: " + categoria);
        }

        entrada.close();
    }
}
