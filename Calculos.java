import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        try (Scanner numero = new Scanner(System.in)) {
            //Apresentação.
            System.out.println("Olá! Aqui você pode realizar a soma, subtração, multiplicação e divisão entre dois números à sua escolha.\\n");

            
            
            while (true) {
                
                //Pedindo dos números.
                System.out.println("Digite dois números:\\n");
                System.out.println("Informe o primeiro número: ");
                Double n1 = numero.nextDouble();
                System.out.println("Informe o segundo número: ");
                Double n2 = numero.nextDouble();
                
            //Seleção de ação.

            System.out.println("\nSelecione a operação desejada: \n[0] Sair \n[1] Soma \n[2] Subtração \n[3] Multiplicação \n[4] Divisão");
            Double resultado = numero.nextDouble();
            
            //Finalização    

            if (resultado == 0) {
                System.out.println("Programa finalizado.");
                break;
            }
            //Contas.
                if (resultado == 1) {
                    resultado = n1 + n2;
                    System.out.println("O resultado da soma de: " + n1 + " + " + n2 + " = " + resultado+ "\n");
                } else if (resultado == 2) {
                    resultado = n1 - n2;   
                    System.out.println("O resultado da subtração de: " + n1 + " - " + n2 + " = " + resultado+ "\n");
                } else if (resultado == 3) {
                    resultado = n1 * n2;
                    System.out.println("O resultado da multiplicação de: " + n1 + " * " + n2 + " = " + resultado+ "\n");
                } else if (resultado == 4) {
                    resultado = n1 / n2;
                    System.out.println("O resultado da divisão de: " + n1 + " / " + n2 + " = " + resultado + "\n");
                } else {
                    System.out.println("Opção inválida. Por favor, selecione uma opção entre 0 e 4.\\n");
                }
            }    
            numero.close();        
        }
    }
    
}
