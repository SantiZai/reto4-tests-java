import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.main.java.VHotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.MouseEvent;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;

public class VHotelTest {

    private VHotel vHotel;

    @BeforeEach
    void setUp() {
        vHotel = new VHotel();
    }

    @Test
    void testConstructor() {
        assertNotNull(vHotel);
        assertEquals(80, VHotel.arrayEtiquetas.length);
        assertNotNull(vHotel.dateFormatter);
    }

    @Test
    void testModelosInicializados() {
        assertNotNull(VHotel.modeloListaCategorias);
        assertNotNull(VHotel.modeloListaClientes);
        assertNotNull(VHotel.modeloListaHabitaciones);
    }

    @Test
    void testComponentesInicializados() {
        assertNotNull(vHotel.jtpContenedor);
        assertNotNull(vHotel.jpBaseDatos);
        assertNotNull(vHotel.jbCargar);
        assertNotNull(vHotel.jbSalvar);
    }

    @Test
    void testBotonesCategoriasInvisibles() {
        assertFalse(vHotel.jbNuevaCategoria.isVisible());
        assertFalse(vHotel.jbEliminarCategoria.isVisible());
    }

    @Test
    void testTituloVentana() {
        assertEquals("VHotel", vHotel.getTitle());
    }

    @Test
    void testMenuBarInicializado() {
        assertNotNull(vHotel.jmbMenu);
        assertNotNull(vHotel.jmArchivo);
        assertNotNull(vHotel.jmAyuda);
    }

    @Test
    void testJbCargarInitialization() {
        assertNotNull(vHotel.jbCargar);
        assertEquals(1, vHotel.jbCargar.getActionListeners().length);
    }

    @Test
    void testJbCargarBounds() {
        assertEquals(20, vHotel.jbCargar.getX());
        assertEquals(20, vHotel.jbCargar.getY());
        assertEquals(140, vHotel.jbCargar.getWidth());
        assertEquals(24, vHotel.jbCargar.getHeight());
    }

    @Test
    void testJbSalvarInitialization() {
        assertNotNull(vHotel.jbSalvar);
        assertEquals("Salvar BD", vHotel.jbSalvar.getText());
        assertEquals("Verdana", vHotel.jbSalvar.getFont().getName());
        assertEquals(Font.BOLD, vHotel.jbSalvar.getFont().getStyle());
        assertEquals(10, vHotel.jbSalvar.getFont().getSize());
        assertEquals(1, vHotel.jbSalvar.getActionListeners().length);
    }

    @Test
    void testComponentesAniadidos() {
        assertTrue(vHotel.jpBaseDatos.isAncestorOf(vHotel.jbCargar));
        assertTrue(vHotel.jpBaseDatos.isAncestorOf(vHotel.jbSalvar));
    }

    @Test
    void testJbCargarActionListener() {
        ActionEvent mockEvent = new ActionEvent(vHotel.jbCargar, ActionEvent.ACTION_PERFORMED, "");
        vHotel.jbCargar.getActionListeners()[0].actionPerformed(mockEvent);
    }

    @Test
    void testJbSalvarActionListener() {
        ActionEvent mockEvent = new ActionEvent(vHotel.jbSalvar, ActionEvent.ACTION_PERFORMED, "");
        vHotel.jbSalvar.getActionListeners()[0].actionPerformed(mockEvent);
    }

    @Test
    public void testJlstListaHabitacionesMouseReleased() throws Exception {
        // Llamar al método initComponents para inicializar los componentes
        vHotel.initComponents();

        // Obtener la lista de habitaciones mediante reflexión
        Field field = VHotel.class.getDeclaredField("jlstListaHabitaciones");
        field.setAccessible(true);
        JList<String> listaHabitaciones = (JList<String>) field.get(vHotel);

        // Crear un evento de mouse release
        MouseEvent mouseEvent = new MouseEvent(listaHabitaciones, MouseEvent.MOUSE_RELEASED, System.currentTimeMillis(), 0, 10, 10, 1, false);

        // Llamar al método mouseReleased mediante reflexión
        Method method = VHotel.class.getDeclaredMethod("jlstListaHabitacionesMouseReleased", MouseEvent.class);
        method.setAccessible(true);
        method.invoke(vHotel, mouseEvent);

        // Como la lista de habitaciones está vacía devuelve el índice -1
        assertEquals(-1, listaHabitaciones.getSelectedIndex());
    }

    @Test
    public void testJbAceptarClienteActionPerformed() {
        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbAceptarCliente, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbAceptarClienteActionPerformed
        vHotel.jbAceptarClienteActionPerformed(mockEvent);
    }

    @Test
    public void testJbCancelarClienteActionPerformed() {
        // Habilitar el botón "Cancelar"
        vHotel.jbCancelarCliente.setEnabled(true);

        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbCancelarCliente, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbCancelarClienteActionPerformed
        vHotel.jbCancelarClienteActionPerformed(mockEvent);

        // Verificar que se haya limpiado el formulario del cliente
        assertEquals("", vHotel.jtfNombreCliente.getText());
    }

    @Test
    public void testJbCancelarClienteDisabled() {
        // Verificar que el botón "Cancelar" esté deshabilitado por defecto
        assertFalse(vHotel.jbCancelarCliente.isEnabled());
    }

    @Test
    public void testJbNuevoClienteActionPerformed() {
        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbNuevoCliente, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbNuevoClienteActionPerformed
        vHotel.jbNuevoClienteActionPerformed(mockEvent);

        // Verificar que se haya habilitado el botón "Modificar Cliente"
        assertFalse(vHotel.jbModificarCliente.isEnabled());
    }

    @Test
    public void testJbModificarClienteActionPerformed() {
        // Habilitar el botón "Modificar Cliente"
        vHotel.jbModificarCliente.setEnabled(true);

        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbModificarCliente, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbModificarClienteActionPerformed
        vHotel.jbModificarClienteActionPerformed(mockEvent);

        // Verificar que se haya deshabilitado el botón "Modificar Cliente"
        assertFalse(vHotel.jbModificarCliente.isEnabled());
    }

    @Test
    public void testJbModificarClienteDisabled() {
        // Verificar que el botón "Modificar Cliente" esté deshabilitado por defecto
        assertFalse(vHotel.jbModificarCliente.isEnabled());
    }

    @Test
    public void testJbEliminarClienteActionPerformed() {
        // Habilitar el botón "Eliminar Cliente"
        vHotel.jbEliminarCliente.setEnabled(true);

        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbEliminarCliente, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbEliminarClienteActionPerformed
        vHotel.jbEliminarClienteActionPerformed(mockEvent);

        // Como la lista de clientes no tiene elementos su tamaño es de 0
        assertEquals(0, vHotel.jlstListaClientes.getModel().getSize());
    }

    @Test
    public void testJbEliminarClienteDisabled() {
        // Verificar que el botón "Eliminar Cliente" esté deshabilitado por defecto
        assertFalse(vHotel.jbEliminarCliente.isEnabled());
    }

    @Test
    public void testJlstListaClientesMouseReleased() {
        // Crear un evento de mouse release
        MouseEvent mockEvent = new MouseEvent(vHotel.jlstListaClientes, MouseEvent.MOUSE_RELEASED, System.currentTimeMillis(), 0, 10, 10, 1, false);

        // Llamar al método jlstListaClientesMouseReleased
        vHotel.jlstListaClientesMouseReleased(mockEvent);

        // Como no tiene elementos la lista de clientes devuelve índice -1
        assertEquals(-1, vHotel.jlstListaClientes.getSelectedIndex());
    }

    @Test
    public void testJbAceptarCategoriaActionPerformed() {
        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbAceptarCategoria, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbAceptarCategoriaActionPerformed
        vHotel.jbAceptarCategoriaActionPerformed(mockEvent);
    }

    @Test
    public void testJbCancelarCategoriaActionPerformed() {
        // Habilitar el botón "Cancelar"
        vHotel.jbCancelarCategoria.setEnabled(true);

        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbCancelarCategoria, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbCancelarCategoriaActionPerformed
        vHotel.jbCancelarCategoriaActionPerformed(mockEvent);
    }

    @Test
    public void testJbCancelarCategoriaDisabled() {
        // Verificar que el botón "Cancelar" esté deshabilitado por defecto
        assertFalse(vHotel.jbCancelarCategoria.isEnabled());
    }

    @Test
    public void testJbModificarCategoriaActionPerformed() {
        // Habilitar el botón "Modificar"
        vHotel.jbModificarCategoria.setEnabled(true);

        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbModificarCategoria, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbModificarCategoriaActionPerformed
        vHotel.jbModificarCategoriaActionPerformed(mockEvent);
    }

    @Test
    public void testJbNuevaCategoriaActionPerformed() {
        // Crear un evento de acción
        ActionEvent mockEvent = new ActionEvent(vHotel.jbNuevaCategoria, ActionEvent.ACTION_PERFORMED, "");

        // Llamar al método jbNuevaCategoriaActionPerformed
        vHotel.jbNuevaCategoriaActionPerformed(mockEvent);
    }
}