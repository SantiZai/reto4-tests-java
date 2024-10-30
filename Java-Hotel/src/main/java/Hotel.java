package src.main.java;

import java.io.*;

/**
 * La clase {@code Hotel} gestiona las listas de clientes, habitaciones y categorías
 * de un hotel. Esta clase permite realizar operaciones CRUD sobre las listas y también
 * permite guardar y cargar los datos en un archivo de disco.
 *
 * <p>El objeto {@code Hotel} se guarda en disco utilizando serialización.</p>
 *
 * @autor Santiago
 */
public class Hotel {

    /** Nombre del archivo de datos donde se guardan las listas. */
    public String nombreFichero;

    /** Lista de clientes del hotel. */
    public ListaClientes listaClientes;

    /** Lista de habitaciones del hotel. */
    public ListaHabitaciones listaHabitaciones;

    /** Lista de categorías del hotel. */
    public ListaCategorias listaCategorias;

    /** Objeto de salida para guardar datos en disco. */
    ObjectOutputStream streamSalida;

    /** Objeto de entrada para cargar datos desde disco. */
    ObjectInputStream streamEntrada;

    /**
     * Crea una instancia de {@code Hotel} con listas vacías y un nombre de archivo
     * predeterminado.
     */
    public Hotel() {
        this.nombreFichero = "DATOS.TXT";
        this.listaClientes = new ListaClientes();
        this.listaHabitaciones = new ListaHabitaciones();
        this.listaCategorias = new ListaCategorias();
    }

    /**
     * Crea las categorías predeterminadas del hotel: "Clase Alta", "Clase Media" y "Clase Baja".
     */
    public void crearCategoriasPorDefecto() {
        Categoria categoria1 = new Categoria("A", 100, "Clase Alta");
        Categoria categoria2 = new Categoria("B", 50, "Clase Media");
        Categoria categoria3 = new Categoria("C", 30, "Clase Baja");

        listaCategorias.addLast(categoria1);
        listaCategorias.addLast(categoria2);
        listaCategorias.addLast(categoria3);
    }

    /**
     * Modifica una categoría existente en la lista de categorías.
     *
     * @param indice            el índice de la categoría a modificar
     * @param nombreCategoria   el nuevo nombre de la categoría
     * @param precioCategoria   el nuevo precio de la categoría
     * @param descripcionCategoria la nueva descripción de la categoría
     */
    public void modificarCategoria(int indice, String nombreCategoria,
                                   int precioCategoria, String descripcionCategoria) {
        ((Categoria) listaCategorias.get(indice)).idCategoria = nombreCategoria;
        ((Categoria) listaCategorias.get(indice)).precioCategoria = precioCategoria;
        ((Categoria) listaCategorias.get(indice)).descripcionCategoria = descripcionCategoria;
    }

    /**
     * Añade una nueva categoría a la lista de categorías.
     *
     * @param nombreCategoria   el nombre de la nueva categoría
     * @param precioCategoria   el precio de la nueva categoría
     * @param descripcionCategoria la descripción de la nueva categoría
     */
    public void nuevaCategoria(String nombreCategoria, int precioCategoria,
                               String descripcionCategoria) {
        listaCategorias.add(new Categoria(nombreCategoria, precioCategoria, descripcionCategoria));
    }

    /**
     * Elimina una categoría de la lista de categorías por su índice.
     *
     * @param indice el índice de la categoría a eliminar
     */
    public void eliminarCategoria(int indice) {
        listaCategorias.remove(indice);
    }

    /**
     * Devuelve la categoría en el índice especificado.
     *
     * @param indice el índice de la categoría a obtener
     * @return la categoría en el índice especificado
     */
    public Categoria tomarCategoria(int indice) {
        return (Categoria) listaCategorias.get(indice);
    }

    /**
     * Añade un nuevo cliente a la lista de clientes.
     *
     * @param dniCliente       el DNI del cliente
     * @param nombreCliente    el nombre del cliente
     * @param apellido1Cliente el primer apellido del cliente
     * @param apellido2Cliente el segundo apellido del cliente
     * @param direccionCliente la dirección del cliente
     * @param numeroHabitacion el número de habitación del cliente
     * @param fechaEntrada     la fecha de entrada del cliente
     * @param fechaSalida      la fecha de salida del cliente
     */
    public void nuevoCliente(String dniCliente, String nombreCliente,
                             String apellido1Cliente, String apellido2Cliente,
                             String direccionCliente, int numeroHabitacion,
                             java.util.Date fechaEntrada, java.util.Date fechaSalida) {
        listaClientes.add(new Cliente(dniCliente, nombreCliente,
                apellido1Cliente, apellido2Cliente,
                direccionCliente, fechaEntrada,
                fechaSalida, numeroHabitacion));
    }

    /**
     * Modifica un cliente existente en la lista de clientes.
     *
     * @param indice           el índice del cliente a modificar
     * @param dniCliente       el nuevo DNI del cliente
     * @param nombreCliente    el nuevo nombre del cliente
     * @param apellido1Cliente el nuevo primer apellido del cliente
     * @param apellido2Cliente el nuevo segundo apellido del cliente
     * @param direccionCliente la nueva dirección del cliente
     * @param numeroHabitacion el nuevo número de habitación del cliente
     * @param fechaEntrada     la nueva fecha de entrada del cliente
     * @param fechaSalida      la nueva fecha de salida del cliente
     */
    public void modificarCliente(int indice, String dniCliente,
                                 String nombreCliente, String apellido1Cliente,
                                 String apellido2Cliente, String direccionCliente,
                                 int numeroHabitacion, java.util.Date fechaEntrada,
                                 java.util.Date fechaSalida) {
        Cliente cliente = (Cliente) listaClientes.get(indice);
        cliente.dniCliente = dniCliente;
        cliente.nombreCliente = nombreCliente;
        cliente.apellido1Cliente = apellido1Cliente;
        cliente.apellido2Cliente = apellido2Cliente;
        cliente.direccionCliente = direccionCliente;
        cliente.numeroHabitacion = numeroHabitacion;
        cliente.fechaEntrada = fechaEntrada;
        cliente.fechaSalida = fechaSalida;
    }

    /**
     * Devuelve el cliente en el índice especificado.
     *
     * @param indice el índice del cliente a obtener
     * @return el cliente en el índice especificado
     */
    public Cliente tomarCliente(int indice) {
        return (Cliente) listaClientes.get(indice);
    }

    /**
     * Elimina un cliente de la lista de clientes.
     *
     * @param indice el índice del cliente a eliminar
     */
    public void eliminarCliente(int indice) {
        listaClientes.remove(indice);
    }

    /**
     * Guarda las listas de clientes y de categorías en disco.
     */
    public void salvarClientesCategorias() {
        try {
            streamSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            streamSalida.writeObject(listaClientes);
            streamSalida.writeObject(listaCategorias);
            System.out.println("Las listas han sido salvadas con éxito.");
        } catch (Exception e) {
            System.out.println("Error al guardar las listas: " + e.getMessage());
        } finally {
            try {
                streamSalida.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    /**
     * Carga las listas de clientes y de categorías desde disco.
     */
    public void cargarClientesCategorias() {
        try {
            streamEntrada = new ObjectInputStream(new FileInputStream(nombreFichero));
            listaClientes = (ListaClientes) streamEntrada.readObject();
            listaCategorias = (ListaCategorias) streamEntrada.readObject();
            System.out.println("Las listas han sido cargadas con éxito.");
        } catch (Exception e) {
            System.out.println("Error al cargar las listas: " + e.getMessage());
        } finally {
            try {
                streamEntrada.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

} // Fin de la clase Hotel
