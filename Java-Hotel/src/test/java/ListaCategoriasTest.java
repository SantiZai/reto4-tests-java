package src.test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.ListaCategorias;
import src.main.java.Categoria;

import static org.junit.jupiter.api.Assertions.*;

public class ListaCategoriasTest {
    private ListaCategorias listaCategorias;

    @BeforeEach
    void setUp() {
        listaCategorias = new ListaCategorias();
    }

    @Test
    void testHasMoreElements() {
        Categoria categoria = new Categoria("A", 100, "Clase A");
        assertFalse(listaCategorias.hasMoreElements());
    }

    @Test
    void testAdd() {
        Categoria categoria = new Categoria("A", 100, "Clase A");
        listaCategorias.add(categoria);
        assertEquals(1, listaCategorias.size());
    }

    @Test
    void testRemove() {
        Categoria categoria = new Categoria("A", 100, "Clase A");
        listaCategorias.add(categoria);
        listaCategorias.remove(categoria);
        assertEquals(0, listaCategorias.size());
    }

    @Test
    void testSet() {
        Categoria categoria1 = new Categoria("A", 100, "Clase A");
        Categoria categoria2 = new Categoria("B", 200, "Clase B");
        listaCategorias.add(categoria1);
        listaCategorias.set(0, categoria2);
        assertEquals(categoria2, listaCategorias.get(0));
    }
}
