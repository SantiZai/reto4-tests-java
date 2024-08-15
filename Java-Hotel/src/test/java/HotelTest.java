package src.test.java;

import src.main.java.Categoria;
import src.main.java.Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    private Hotel hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hotel();
    }

    @Test
    void testCrearCategoriasPorDefecto() {
        hotel.crearCategoriasPorDefecto();
        assertEquals(3, hotel.listaCategorias.size());
        assertEquals("A", ((Categoria) hotel.listaCategorias.get(0)).idCategoria);
        assertEquals("B", ((Categoria) hotel.listaCategorias.get(1)).idCategoria);
        assertEquals("C", ((Categoria) hotel.listaCategorias.get(2)).idCategoria);
    }

    @Test
    void testNuevaCategoria() {
        hotel.nuevaCategoria("D", 20, "Clase Economica");
        assertEquals(1, hotel.listaCategorias.size());
        assertEquals("D", ((Categoria) hotel.listaCategorias.get(0)).idCategoria);
    }

    @Test
    void testModificarCategoria() {
        hotel.crearCategoriasPorDefecto();
        hotel.modificarCategoria(0, "Z", 200, "Clase VIP");
        Categoria categoriaModificada = (Categoria) hotel.listaCategorias.get(0);
        assertEquals("Z", categoriaModificada.idCategoria);
        assertEquals(200, categoriaModificada.precioCategoria);
        assertEquals("Clase VIP", categoriaModificada.descripcionCategoria);
    }

    @Test
    void testEliminarCategoria() {
        hotel.crearCategoriasPorDefecto();
        hotel.eliminarCategoria(0);
        assertEquals(2, hotel.listaCategorias.size());
        assertEquals("B", ((Categoria) hotel.listaCategorias.get(0)).idCategoria);
    }

    @Test
    void testTomarCategoria() {
        hotel.crearCategoriasPorDefecto();
        Categoria categoria = (Categoria) hotel.tomarCategoria(0);
        assertNotNull(categoria);
        assertEquals("A", categoria.idCategoria);
    }
}
