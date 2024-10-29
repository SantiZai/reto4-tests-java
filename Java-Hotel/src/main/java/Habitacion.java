package src.main.java;

/**
 * La clase {@code Habitacion} representa una habitación en un hotel, almacenando
 * datos como el número de habitación, la categoría y el precio.
 * Las habitaciones se gestionan en la clase {@code ListaHabitaciones}.
 *
 * <p>Proporciona un constructor predeterminado para inicializar los valores de
 * cada habitación.</p>
 *
 * @autor TuNombre
 */
public class Habitacion {

    /** Número de la habitación. */
    public int numeroHabitacion;

    /** Índice de la categoría de la habitación en la lista de categorías. */
    public int categoriaHabitacion;

    /** Precio de la habitación en unidades monetarias. */
    public int precioHabitacion;

    /**
     * Crea una nueva instancia de {@code Habitacion} con valores predeterminados.
     * Inicializa {@code numeroHabitacion}, {@code categoriaHabitacion} y {@code precioHabitacion} a cero.
     */
    public Habitacion() {
        this.numeroHabitacion = 0;
        this.categoriaHabitacion = 0;
        this.precioHabitacion = 0;
    }

} // Fin de la clase Habitacion
