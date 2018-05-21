package misfunciones;

import java.util.Scanner;

public class Acciones {

    /**
     * Petición de datos con comprobación de número positivo
     *
     * @param msg Mensaje que se le quiere dar al usuario para indicar el dato
     * que se le pide
     *
     * @return Un número positivo
     */
    public static double pedirDato(String msg) {
        Scanner sc = new Scanner(System.in);
        double dato;
        do {
            System.out.println(msg);
            dato = sc.nextDouble();
            if (dato < 0) {
                System.out.println("Dato negativo. Vuelva a introducirlo");
            }
        } while (dato < 0);
        return dato;
    }

    /**
     * Cálculo del área de un cilindro
     *
     * @param radio radio del cilindro
     * @param altura altura del cilindro
     * @return El área
     */
    public static double areaCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * altura;
    }

    /**
     * Salida de datos por pantalla en cm²
     *
     * @param res la cantidad a mostrar
     */
    public static void mostrarResultado(double res) {
        System.out.printf("Area del cilindro=%.2f cm²", res);
    }
}
