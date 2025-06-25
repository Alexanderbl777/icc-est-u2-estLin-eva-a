package main;

import java.util.*;

public class LogicaClasificacion {
    Stack<String> aux = new Stack<>();
    Queue<String> nombres = new LinkedList<>();
    // LinkedList<>

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        for (String s : cola) {
            aux.push(s);
            nombres.add(aux.pop());
        }

        return nombres;
    }

    Stack<String> letras = new Stack<>();

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {

        for (String c : cola) {
            while (!cola.isEmpty()) {
                letras.push(c);
                cola.add(letras.pop());
                if (letras.peek() == cola.peek()) {
                    return true;
                }
                return false;
            }

        }
        return false;
    }
    

}
