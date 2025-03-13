import java.util.Scanner;

public class MaiorMenor{
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Escreva 3 numeros para saber a média aritmética deles.");
        
        System.out.println("Primeiro número: ");
        Double primeiroNu = numeros.nextDouble();

        System.out.println("Segundo número: ");
        Double segundoNu = numeros.nextDouble();

        System.out.println("Terceiro número: ");
        Double terceiroNu = numeros.nextDouble();
        
        Double maior = Math.max(primeiroNu,Math.max(segundoNu,terceiroNu));
        Double menor = Math.min(primeiroNu,Math.min(segundoNu,terceiroNu));

        System.out.println(" Maior: " + maior + " Menor: " + menor);

        numeros.close();

        Double resultado;

        resultado = primeiroNu + segundoNu + terceiroNu;

        System.out.println(primeiroNu + " + " + segundoNu + " + " + terceiroNu + " + " + " = " + resultado);
        resultado = resultado / 3;

        System.out.println("A média aritmética desse números é: " + resultado);
    }
}
