package src.main.java;

import javax.swing.JDialog;

/**
 * La clase {@code Acerca} representa un cuadro de diálogo "Acerca de..." para la aplicación.
 * <p>
 * Este cuadro de diálogo muestra información sobre la aplicación, como el título,
 * el desarrollador y otros detalles relevantes.
 * </p>
 *
 * <p><b>Nota:</b> Esta clase extiende {@code JDialog} y se usa principalmente para
 * mostrar información estática.</p>
 *
 * @author David
 * @version 1.0
 */
public class Acerca extends JDialog {

    /**
     * Constructor para crear el cuadro de diálogo "Acerca de...".
     *
     * @param parent El marco principal de la aplicación que actuará como el propietario de este diálogo.
     * @param modal Indica si el cuadro de diálogo es modal o no.
     */
    public Acerca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Método de inicialización de componentes.
     * Configura y dispone los elementos de la interfaz de usuario dentro del cuadro de diálogo.
     */
    private void initComponents() {
        jlDuke = new javax.swing.JLabel();
        jlVHotel = new javax.swing.JLabel();
        jlDavid = new javax.swing.JLabel();
        jlGestion = new javax.swing.JLabel();
        jlCurso = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jbtnAceptar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setTitle("Acerca de...");
        setFont(new java.awt.Font("Verdana", 0, 10));
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jlDuke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/duke.gif")));
        jlDuke.setBorder(new javax.swing.border.EtchedBorder());
        getContentPane().add(jlDuke);
        jlDuke.setBounds(10, 10, 110, 130);

        jlVHotel.setFont(new java.awt.Font("Verdana", 3, 24));
        jlVHotel.setText("VHotel");
        getContentPane().add(jlVHotel);
        jlVHotel.setBounds(140, 20, 90, 30);

        jlDavid.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDavid.setText("David Díaz Pescador");
        getContentPane().add(jlDavid);
        jlDavid.setBounds(140, 90, 130, 14);

        jlGestion.setFont(new java.awt.Font("Verdana", 3, 12));
        jlGestion.setText("Gestión visual de un Hotel");
        getContentPane().add(jlGestion);
        jlGestion.setBounds(150, 50, 180, 16);

        jlCurso.setFont(new java.awt.Font("Verdana", 0, 10));
        jlCurso.setText("2º A.S.I. - I.E.S. Castro da Uz");
        getContentPane().add(jlCurso);
        jlCurso.setBounds(140, 105, 166, 14);

        jlFecha.setFont(new java.awt.Font("Verdana", 0, 10));
        jlFecha.setText("Enero 2004");
        getContentPane().add(jlFecha);
        jlFecha.setBounds(140, 120, 63, 14);

        jbtnAceptar.setFont(new java.awt.Font("Verdana", 0, 10));
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        getContentPane().add(jbtnAceptar);
        jbtnAceptar.setBounds(260, 150, 75, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 350) / 2, (screenSize.height - 205) / 2, 350, 205);

        jlVHotel.setName("jlVHotel");
        jlDavid.setName("jlDavid");
        jlGestion.setName("jlGestion");
        jbtnAceptar.setName("jbtnAceptar");
    }

    /**
     * Método que maneja el evento de acción del botón "Aceptar".
     * <p>
     * Oculta y cierra el cuadro de diálogo cuando se hace clic en el botón.
     * </p>
     *
     * @param evt El evento de acción generado por el botón "Aceptar".
     */
    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
    }

    /**
     * Método que maneja el evento de cierre del cuadro de diálogo.
     * <p>
     * Oculta y cierra el cuadro de diálogo cuando se intenta cerrar la ventana.
     * </p>
     *
     * @param evt El evento de ventana generado al intentar cerrar el cuadro de diálogo.
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {
        setVisible(false);
        dispose();
    }

    // Declaración de variables de los componentes de la interfaz
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlDavid;
    private javax.swing.JLabel jlDuke;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlGestion;
    private javax.swing.JLabel jlVHotel;

}
