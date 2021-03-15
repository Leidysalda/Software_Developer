/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Departamento de Tecnologías de la Información y Comunicaciones
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Proyecto Evaluador de Expresiones Postfijas
 * Fecha: Febrero 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package universidadean.desarrollosw.postfijo;

import java.util.*;

/**
 * Esta clase representa una clase que evalúa expresiones en notación polaca o
 * postfija. Por ejemplo: 4 5 +
 */
public class EvaluadorPostfijo {

    /**
     * Realiza la evaluación de la expresión postfijo utilizando una pila
     *
     * @param expresion una lista de elementos con números u operadores
     * @return el resultado de la evaluación de la expresión.
     */
    static int evaluarPostFija(List<String> expresion) {
        // create a stack
        Stack<Integer> pila = new Stack<>();

        // Scan all strings of list
        for (int i = 0; i < expresion.size(); i++) {
            String elem = expresion.get(i);

            try {
                pila.push(Integer.parseInt(elem));
                //System.out.println(pila);
                continue;
            } catch (Exception e) {
                if (pila.size() >= 2) {
                    int value1 = pila.pop();
                    int value2 = pila.pop();
                    switch (elem) {
                        case "+":
                            pila.push(value2 + value1);
                            break;
                        case "-":
                            pila.push(value2 - value1);
                            break;
                        case "*":
                            pila.push(value2 * value1);
                            break;
                        case "/":
                            pila.push(value2 / value1);
                            break;
                        default:
                            System.err.printf("Error grave en la expresión: %s", e.getMessage());
                    }
                }

            }
        }
        return pila.pop();
    }

    /**
     * Programa principal
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("> ");
        String linea = teclado.nextLine();

        try {
            List<String> expresion = Token.dividir(linea);
            System.out.println(evaluarPostFija(expresion));
        }
        catch (Exception e) {
            System.err.printf("Error grave en la expresión: %s", e.getMessage());
        }

    }
}
