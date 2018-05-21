package cilindro;

import misfunciones.Acciones;

import java.util.Scanner;

public class Cilindro {

    public static void main(String args[]) {
        double radio, altura, area;
        System.out.println("Área de un cilindro");
        radio = Acciones.pedirDato("\n\nIntroduce el radio en cm");
        altura = Acciones.pedirDato("Ahora la altura en cm");
        area = Acciones.areaCilindro(radio, altura);
        Acciones.mostrarResultado(area);
    }
}
