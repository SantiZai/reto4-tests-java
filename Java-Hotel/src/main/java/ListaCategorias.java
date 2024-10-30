package src.main.java;

import java.util.*;
import java.io.*;

/**
 * La clase {@code ListaCategorias} extiende de {@code LinkedList} para almacenar una lista
 * de categorías. Implementa la interfaz {@code Enumeration} y es serializable para que
 * pueda guardarse en disco.
 *
 * <p>Hereda todos los métodos de {@code LinkedList} para gestionar la lista y
 * proporciona métodos de enumeración a través de la interfaz {@code Enumeration}.</p>
 *
 * @autor Santiago
 */
public class ListaCategorias extends LinkedList implements Enumeration, Serializable {

    /**
     * Constructor para crear una lista de categorías vacía.
     */
    public ListaCategorias() {
    }

    /**
     * Devuelve el siguiente elemento en la lista de categorías. Implementación
     * de la interfaz {@code Enumeration}.
     *
     * @return el siguiente elemento en la lista
     */
    @Override
    public Object nextElement() {
        return null; // Implementación pendiente
    }

    /**
     * Indica si la lista de categorías tiene más elementos. Implementación de la
     * interfaz {@code Enumeration}.
     *
     * @return {@code true} si la lista tiene más elementos; {@code false} en caso contrario
     */
    @Override
    public boolean hasMoreElements() {
        return false; // Implementación pendiente
    }

} // Fin de la clase ListaCategorias
