package src.test.java;

import src.main.java.Cliente;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testConstructor() {
        String dniCliente = "12345678A";
        String nombreCliente = "John";
        String apellido1Cliente = "Doe";
        String apellido2Cliente = "Smith";
        String direccionCliente = "123 Main St";
        Date fechaEntrada = new Date();
        Date fechaSalida = new Date(fechaEntrada.getTime() + 86400000); // 1 día después
        int numeroHabitacion = 101;

        Cliente cliente = new Cliente(dniCliente, nombreCliente, apellido1Cliente, apellido2Cliente, direccionCliente, fechaEntrada, fechaSalida, numeroHabitacion);

        assertEquals(dniCliente, cliente.dniCliente);
        assertEquals(nombreCliente, cliente.nombreCliente);
        assertEquals(apellido1Cliente, cliente.apellido1Cliente);
        assertEquals(apellido2Cliente, cliente.apellido2Cliente);
        assertEquals(direccionCliente, cliente.direccionCliente);
        assertEquals(fechaEntrada, cliente.fechaEntrada);
        assertEquals(fechaSalida, cliente.fechaSalida);
        assertEquals(numeroHabitacion, cliente.numeroHabitacion);
    }

    @Test
    void testGetters() {
        Cliente cliente = new Cliente("12345678A", "John", "Doe", "Smith", "123 Main St", new Date(), new Date(), 101);

        assertEquals("12345678A", cliente.getDniCliente());
        assertEquals("John", cliente.getNombreCliente());
        assertEquals("Doe", cliente.getApellido1Cliente());
        assertEquals("Smith", cliente.getApellido2Cliente());
        assertEquals("123 Main St", cliente.getDireccionCliente());
        assertNotNull(cliente.getFechaEntrada());
        assertNotNull(cliente.getFechaSalida());
        assertEquals(101, cliente.getNumeroHabitacion());
    }

    @Test
    void testSetters() {
        Cliente cliente = new Cliente("12345678A", "John", "Doe", "Smith", "123 Main St", new Date(), new Date(), 101);

        String newDniCliente = "87654321B";
        String newNombreCliente = "Jane";
        String newApellido1Cliente = "Doe";
        String newApellido2Cliente = "Johnson";
        String newDireccionCliente = "456 Oak St";
        Date newFechaEntrada = new Date(System.currentTimeMillis() + 86400000); // 1 día después
        Date newFechaSalida = new Date(newFechaEntrada.getTime() + 86400000); // 1 día después
        int newNumeroHabitacion = 201;

        cliente.setDniCliente(newDniCliente);
        cliente.setNombreCliente(newNombreCliente);
        cliente.setApellido1Cliente(newApellido1Cliente);
        cliente.setApellido2Cliente(newApellido2Cliente);
        cliente.setDireccionCliente(newDireccionCliente);
        cliente.setFechaEntrada(newFechaEntrada);
        cliente.setFechaSalida(newFechaSalida);
        cliente.setNumeroHabitacion(newNumeroHabitacion);

        assertEquals(newDniCliente, cliente.getDniCliente());
        assertEquals(newNombreCliente, cliente.getNombreCliente());
        assertEquals(newApellido1Cliente, cliente.getApellido1Cliente());
        assertEquals(newApellido2Cliente, cliente.getApellido2Cliente());
        assertEquals(newDireccionCliente, cliente.getDireccionCliente());
        assertEquals(newFechaEntrada, cliente.getFechaEntrada());
        assertEquals(newFechaSalida, cliente.getFechaSalida());
        assertEquals(newNumeroHabitacion, cliente.getNumeroHabitacion());
    }
}