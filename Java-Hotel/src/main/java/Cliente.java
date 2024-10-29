package src.main.java;

import java.io.Serializable;
import java.util.Date;

/**
 * La clase {@code Cliente} representa un cliente con sus datos personales,
 * incluyendo su información de estadía en un hotel como fechas de entrada y salida,
 * y número de habitación asignada.
 *
 * <p>Implementa la interfaz {@code Serializable} para facilitar la persistencia de
 * objetos de esta clase.</p>
 *
 * @author TuNombre
 */
public class Cliente implements Serializable {

    /** Documento de identidad del cliente. */
    public String dniCliente;

    /** Nombre del cliente. */
    public String nombreCliente;

    /** Primer apellido del cliente. */
    public String apellido1Cliente;

    /** Segundo apellido del cliente. */
    public String apellido2Cliente;

    /** Dirección de residencia del cliente. */
    public String direccionCliente;

    /** Fecha de entrada del cliente en el hotel. */
    public Date fechaEntrada;

    /** Fecha de salida del cliente del hotel. */
    public Date fechaSalida;

    /** Número de la habitación asignada al cliente. */
    public int numeroHabitacion;

    /**
     * Crea una nueva instancia de {@code Cliente} con los datos proporcionados.
     *
     * @param dniCliente Documento de identidad del cliente.
     * @param nombreCliente Nombre del cliente.
     * @param apellido1Cliente Primer apellido del cliente.
     * @param apellido2Cliente Segundo apellido del cliente.
     * @param direccionCliente Dirección de residencia del cliente.
     * @param fechaEntrada Fecha de entrada del cliente en el hotel.
     * @param fechaSalida Fecha de salida del cliente del hotel.
     * @param numeroHabitacion Número de la habitación asignada al cliente.
     */
    public Cliente(String dniCliente, String nombreCliente,
                   String apellido1Cliente, String apellido2Cliente,
                   String direccionCliente, Date fechaEntrada,
                   Date fechaSalida, int numeroHabitacion) {
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.apellido1Cliente = apellido1Cliente;
        this.apellido2Cliente = apellido2Cliente;
        this.direccionCliente = direccionCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }

    // Métodos getter y setter

    /**
     * Obtiene el documento de identidad del cliente.
     * @return El documento de identidad del cliente.
     */
    public String getDniCliente() {
        return dniCliente;
    }

    /**
     * Establece el documento de identidad del cliente.
     * @param dniCliente El documento de identidad del cliente.
     */
    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombreCliente El nombre del cliente.
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el primer apellido del cliente.
     * @return El primer apellido del cliente.
     */
    public String getApellido1Cliente() {
        return apellido1Cliente;
    }

    /**
     * Establece el primer apellido del cliente.
     * @param apellido1Cliente El primer apellido del cliente.
     */
    public void setApellido1Cliente(String apellido1Cliente) {
        this.apellido1Cliente = apellido1Cliente;
    }

    /**
     * Obtiene el segundo apellido del cliente.
     * @return El segundo apellido del cliente.
     */
    public String getApellido2Cliente() {
        return apellido2Cliente;
    }

    /**
     * Establece el segundo apellido del cliente.
     * @param apellido2Cliente El segundo apellido del cliente.
     */
    public void setApellido2Cliente(String apellido2Cliente) {
        this.apellido2Cliente = apellido2Cliente;
    }

    /**
     * Obtiene la dirección de residencia del cliente.
     * @return La dirección de residencia del cliente.
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * Establece la dirección de residencia del cliente.
     * @param direccionCliente La dirección de residencia del cliente.
     */
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    /**
     * Obtiene la fecha de entrada del cliente en el hotel.
     * @return La fecha de entrada del cliente en el hotel.
     */
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Establece la fecha de entrada del cliente en el hotel.
     * @param fechaEntrada La fecha de entrada del cliente en el hotel.
     */
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Obtiene la fecha de salida del cliente del hotel.
     * @return La fecha de salida del cliente del hotel.
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Establece la fecha de salida del cliente del hotel.
     * @param fechaSalida La fecha de salida del cliente del hotel.
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Obtiene el número de la habitación asignada al cliente.
     * @return El número de la habitación asignada al cliente.
     */
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * Establece el número de la habitación asignada al cliente.
     * @param numeroHabitacion El número de la habitación asignada al cliente.
     */
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
}
