package src.main.java;

import java.io.*;

/**
 * La clase {@code Categoria} representa una categoría con un identificador, precio y descripción.
 * Esta clase se utiliza para almacenar los datos de cada categoría.
 * Las categorías se gestionan en la clase {@code ListaCategorias}.
 *
 * <p>Implementa la interfaz {@code Serializable} para permitir que los objetos de esta clase
 * se serialicen y deserialicen, facilitando su almacenamiento y recuperación.
 * </p>
 *
 * @author Santiago
 */
public class Categoria implements Serializable {

    /** Identificador único de la categoría. */
    public String idCategoria;

    /** Precio de la categoría en unidades monetarias. */
    public int precioCategoria;

    /** Descripción detallada de la categoría. */
    public String descripcionCategoria;

    /**
     * Crea una nueva instancia de {@code Categoria} con un ID, precio y descripción.
     *
     * @param idCategoria El identificador de la categoría.
     * @param precioCategoria El precio de la categoría.
     * @param descripcionCategoria La descripción de la categoría.
     */
    public Categoria(String idCategoria, int precioCategoria,
                     String descripcionCategoria) {
        this.idCategoria = idCategoria;
        this.precioCategoria = precioCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

} // Fin de la clase Categoria
