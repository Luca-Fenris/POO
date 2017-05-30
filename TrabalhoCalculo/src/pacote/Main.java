package pacote;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Method method = new Method();
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int option = 0;
        float number1;
        float number2;

        System.out.println("BEM-VINDO A LOGICA QUE ME FEZ PENSAR!!!");

        do {
            System.out.println("-----------------");
            System.out.println("|1-   SOMAR     |");
            System.out.println("|2-  SUBTRAIR   |");
            System.out.println("|3- MULTIPLICAR |");
            System.out.println("|4-   DIVIDIR   |");
            System.out.println("|5-  POTENCIA   |");
            System.out.println("|6-    SAIR     |");
            System.out.println("-----------------");
            option = in.nextInt();

            if (option == 1) {
                System.out.println("Informe o Primeiro number");
                number1 = in.nextFloat();
                System.out.println("Informe o Segundo number");
                number2 = in.nextFloat();
                System.out.println("O resultado da soma �: " + df.format((method.soma(number1, number2))));
            } else if (option == 2) {
                System.out.println("Informe o Primeiro number");
                number1 = in.nextFloat();
                System.out.println("Informe o Segundo number");
                number2 = in.nextFloat();
                System.out.println("O resultado da subtra��o �: " + df.format(method.subtracao(number1, number2)));
            } else if (option == 3) {
                System.out.println("Informe o Primeiro number");
                number1 = in.nextFloat();
                System.out.println("Informe o Segundo number");
                number2 = in.nextFloat();
                System.out.println("O resultado da multiplica��o �: " + df.format(method.multiplicacao(number1, number2)));
            } else if (option == 4) {
                System.out.println("Informe o Primeiro number");
                number1 = in.nextFloat();
                System.out.println("Informe o Segundo number");
                number2 = in.nextFloat();
                System.out.println("O resultado da divis�o �: " + df.format(method.divisao(number1, number2)));
            } else if (option == 5) {
                System.out.println("Informe o Primeiro number");
                number1 = in.nextFloat();
                System.out.println("Informe o Segundo number");
                number2 = in.nextFloat();
                System.out.println("O resultado da potencia��o �: " + df.format(method.potencia(number1, number2)));
            } else if (option == 6) {
                System.out.println("Volte Novamente");
                break;
            }

        } while (option != 6);

    }

}
