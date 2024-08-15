package src.test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.Categoria;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {
    private Categoria categoria;

    @BeforeEach
    void setUp() {
        categoria = new Categoria("A", 100, "Clase A");
    }

    @Test
    void testCategoriaInicializacion() {
        assertEquals("A", categoria.idCategoria);
        assertEquals(100, categoria.precioCategoria);
        assertEquals("Clase A", categoria.descripcionCategoria);
    }

    @Test
    void testSetIdCategoria() {
        categoria.idCategoria = "B";
        assertEquals("B", categoria.idCategoria);
    }

    @Test
    void testSetPrecioCategoria() {
        categoria.precioCategoria = 200;
        assertEquals(200, categoria.precioCategoria);
    }

    @Test
    void testSetDescripcionCategoria() {
        categoria.descripcionCategoria = "Clase B";
        assertEquals("Clase B", categoria.descripcionCategoria);
    }
}
