package src.main.java;

import java.util.*;
import java.io.*;

/**
 * La clase {@code ListaClientes} extiende de {@code LinkedList} para almacenar una lista
 * de clientes. Es serializable, lo que permite guardar la lista en disco.
 *
 * <p>Hereda todos los métodos de {@code LinkedList} para gestionar la lista,
 * proporcionando métodos para añadir, modificar y eliminar elementos.</p>
 *
 * @autor Santiago
 */
public class ListaClientes extends LinkedList implements Serializable {

    /**
     * Constructor que crea una lista de clientes vacía.
     */
    public ListaClientes() {
    }

} // Fin de la clase ListaClientes
