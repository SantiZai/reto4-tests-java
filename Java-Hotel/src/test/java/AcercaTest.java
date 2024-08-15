package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import src.main.java.Acerca;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AcercaTest {

    private static Acerca acerca;

    @BeforeAll
    public static void setUp() throws InterruptedException, InvocationTargetException {
        CountDownLatch latch = new CountDownLatch(1);
        SwingUtilities.invokeAndWait(() -> {
            acerca = new Acerca(null, true);
            acerca.setVisible(true);
            latch.countDown();
        });
        latch.await(5, TimeUnit.SECONDS);
    }

    @Test
    public void testTitulo() {
        SwingUtilities.invokeLater(() -> {
            assertNotNull(acerca);
            assertEquals("Acerca de...", acerca.getTitle());
        });
    }

    @Test
    public void testEtiquetas() {
        SwingUtilities.invokeLater(() -> {
            JLabel jlVHotel = (JLabel) findComponentByName(acerca.getContentPane(), "jlVHotel");
            assertNotNull(jlVHotel);
            assertEquals("VHotel", jlVHotel.getText());

            JLabel jlDavid = (JLabel) findComponentByName(acerca.getContentPane(), "jlDavid");
            assertNotNull(jlDavid);
            assertEquals("David Díaz Pescador", jlDavid.getText());

            JLabel jlGestion = (JLabel) findComponentByName(acerca.getContentPane(), "jlGestion");
            assertNotNull(jlGestion);
            assertEquals("Gestión visual de un Hotel", jlGestion.getText());
        });
    }

    @Test
    public void testBotonAceptar() {
        SwingUtilities.invokeLater(() -> {
            JButton jbtnAceptar = (JButton) findComponentByName(acerca.getContentPane(), "jbtnAceptar");
            assertNotNull(jbtnAceptar);
            jbtnAceptar.doClick();
            assertFalse(acerca.isVisible());
        });
    }

    private Component findComponentByName(Container container, String name) {
        for (Component component : container.getComponents()) {
            if (name.equals(component.getName())) {
                return component;
            }
            if (component instanceof Container) {
                Component found = findComponentByName((Container) component, name);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }
}