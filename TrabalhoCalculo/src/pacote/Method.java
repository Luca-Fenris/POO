package pacote;

public class Method {

    public float soma(float numberA, float numberB) {
        return numberA + numberB;
    }

    public float subtracao(float numberA, float numberB) {
        return soma(numberA, -numberB);
    }

    public float multiplicacao(float numberA, float numberB) {

        float result = 0;
        float result1 = 0;
        float cont = 0;

        do {
            if (cont > numberB) {
                break;
            }
            cont = soma(cont, 1);
            result = soma(numberA, 0);
            result1 = soma(result, result1);

        } while (cont != numberB);

        return result1;
    }

    public float divisao(float numberA, float numberB) {
        float cont = 0;
        boolean negative = false;

        if (numberB == 0) {
            float result = Float.NaN;
            cont = result;
        } else {

            if (numberA < 0 && numberB >= 0 || numberA >= 0 && numberB < 0) {
                negative = true;
            }

            if (numberA < 0) {
                numberA = -numberA;
            }
            if (numberB < 0) {
                numberB = -numberB;
            }
            while (numberA >= numberB) {
                numberA = subtracao(numberA, numberB);
                cont = soma(cont, 1);
            }

            numberA = multiplicacao(numberA, 10);
            while (numberA >= numberB) {
                numberA = subtracao(numberA, numberB);
                cont = soma(cont, 0.1f);
            }

            numberA = multiplicacao(numberA, 10);
            while (numberA >= numberB) {
                numberA = subtracao(numberA, numberB);
                cont = soma(cont, 0.01f);
            }

            numberA = multiplicacao(numberA, 10);
            while (numberA >= numberB) {
                numberA = subtracao(numberA, numberB);
                cont = soma(cont, 0.001f);
            }

            if (negative) {
                cont = -cont;
            }
        }
        return cont;
    }

    public float potencia(float numberA, float numberB) {
        float result = 1;
        float cont = 0;

        do {
            if (cont > numberB) {
                break;
            }
            cont = soma(cont, 1);
            result = multiplicacao(numberA, result);
        } while (cont != numberB);

        return result;
    }

}
