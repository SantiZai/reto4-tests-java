import static org.junit.jupiter.api.Assertions.assertEquals;

import src.main.java.Habitacion;

import org.junit.jupiter.api.Test;

class HabitacionTest {

    private final Habitacion habitacion = new Habitacion();

    @Test
    void roomNumber() {
        assertEquals(0, habitacion.numeroHabitacion);
    }

    @Test
    void categoryRoom() {
        assertEquals(0, habitacion.categoriaHabitacion);
    }

    @Test
    void roomPrice() {
        assertEquals(0, habitacion.precioHabitacion);
    }

}