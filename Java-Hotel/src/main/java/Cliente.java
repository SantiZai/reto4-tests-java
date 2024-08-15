package src.main.java;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
    public String dniCliente;
    public String nombreCliente;
    public String apellido1Cliente;
    public String apellido2Cliente;
    public String direccionCliente;
    public Date fechaEntrada;
    public Date fechaSalida;
    public int numeroHabitacion;

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

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellido1Cliente() {
        return apellido1Cliente;
    }

    public void setApellido1Cliente(String apellido1Cliente) {
        this.apellido1Cliente = apellido1Cliente;
    }

    public String getApellido2Cliente() {
        return apellido2Cliente;
    }

    public void setApellido2Cliente(String apellido2Cliente) {
        this.apellido2Cliente = apellido2Cliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
}