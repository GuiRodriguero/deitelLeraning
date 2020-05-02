package capitulo2;

import java.util.Scanner;

public class IMC {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float peso;
        float altura;
        float imc;

        System.out.print("Digite o seu peso: ");
        peso = input.nextFloat();

        System.out.print("Digite a sua altura: ");
        altura = input.nextFloat();

        imc = (peso/(altura*altura));
        System.out.printf("Seu IMC é: %f%n", imc);
    }
}
