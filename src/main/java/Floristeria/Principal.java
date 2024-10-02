package Floristeria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Principal extends JFrame implements FocusListener, ActionListener, KeyListener {

    private static final String MENSAJE_SELECCION_DEPARTAMENTO = "Seleccione un departamento";
    private static final String MENSAJE_TIEMPO_INGRESAR = "Ingrese el tiempo";
    private static final String MENSAJE_ERROR = "ERROR";

    JComboBox<String> departamento;
    JButton calcularBtn, reiniciarBtn, salidaBtn, bienvenidaBtn;
    JTextField tiempoField, nombreField, apellidoField, resultadoField;
    JLabel mensajeLbl, copyrightLbl;

    public Principal() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        // Configuración del layout principal
        this.setLayout(new BorderLayout());

        // Panel para el logo
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.PINK);

        // Cargar imagen
        ImageIcon logo = new ImageIcon("C:\\Users\\wcaro\\OneDrive\\Documentos\\NetBeansProjects\\FloristeriaWendy\\src\\main\\java\\Floristeria\\lflor.png");
        Image logoDimension = logo.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon adjustedLogo = new ImageIcon(logoDimension);
        JLabel imageLabel = new JLabel(adjustedLogo);

        // Añadir imagen al panel del logo
        logoPanel.add(imageLabel);
        
        //Icono en la barra de título
        this.setIconImage(logo.getImage());

        // Añadir el panel del logo al área norte del BorderLayout
        this.add(logoPanel, BorderLayout.NORTH);

        // Panel principal para los campos y botones, usa GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta título nombre
        JLabel titulonombreLbl = new JLabel("Ingrese su nombre:");
        titulonombreLbl.setFont(new Font("Arial", Font.BOLD, 20));
        titulonombreLbl.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(titulonombreLbl, gbc);  // Añadir al panel con GridBagLayout

        // Campo para nombre
        nombreField = new JTextField("Ingrese su nombre");
        nombreField.addFocusListener(this);
        gbc.gridy = 1;
        mainPanel.add(nombreField, gbc);

        // Etiqueta título apellido
        JLabel tituloapellidoLbl = new JLabel("Ingrese su apellido:");
        tituloapellidoLbl.setFont(new Font("Arial", Font.BOLD, 20));
        tituloapellidoLbl.setForeground(Color.BLACK);
        gbc.gridy = 2;
        mainPanel.add(tituloapellidoLbl, gbc);

        // Campo para apellido
        apellidoField = new JTextField("Ingrese su apellido");
        apellidoField.addFocusListener(this);
        gbc.gridy = 3;
        mainPanel.add(apellidoField, gbc);

        // Lista desplegable para el departamento
        String[] dptos = {"Seleccione una opción", "Atención al cliente", "Logística", "Gerentes"};
        departamento = new JComboBox<>(dptos);
        gbc.gridy = 4;
        mainPanel.add(departamento, gbc);

        // Campo para introducir el tiempo
        tiempoField = new JTextField("Ingrese un número entero");
        tiempoField.addFocusListener(this);
        tiempoField.addKeyListener(this);
        gbc.gridy = 5;
        mainPanel.add(tiempoField, gbc);

        // Campo para mostrar el resultado del cálculo
        resultadoField = new JTextField("Resultado");
        resultadoField.setEditable(false);
        gbc.gridy = 6;
        mainPanel.add(resultadoField, gbc);
        
        // Panel para los botones Calcular y Reiniciar
        JPanel buttonPanel1 = new JPanel(new FlowLayout());
        buttonPanel1.setBackground(Color.PINK); // Opcional: establece el color de fondo

        // Botón para calcular
        calcularBtn = new JButton("Calcular");
        calcularBtn.setForeground(Color.WHITE);
        calcularBtn.setBackground(new Color(186, 85, 211));
        calcularBtn.setOpaque(true);
        calcularBtn.setBorderPainted(false);
        calcularBtn.addActionListener(this);
        buttonPanel1.add(calcularBtn);

        // Botón para reiniciar
        reiniciarBtn = new JButton("Reiniciar");
        reiniciarBtn.setForeground(Color.WHITE);
        reiniciarBtn.setBackground(new Color(186, 85, 211));
        reiniciarBtn.setOpaque(true);
        reiniciarBtn.setBorderPainted(false);
        reiniciarBtn.addActionListener(this);
        buttonPanel1.add(reiniciarBtn);

        // Añadir el panel de botones al mainPanel
        gbc.gridy = 7; // Cambiar la fila a donde desees agregar el panel
        mainPanel.add(buttonPanel1, gbc);

        // Panel para los botones Regresar
        JPanel buttonPanel2 = new JPanel(new FlowLayout());
        buttonPanel2.setBackground(Color.PINK); // Opcional: establece el color de fondo

       
        // Añadir el panel de regreso al mainPanel
        gbc.gridy = 9; // Cambiar la fila a donde desees agregar el panel
        mainPanel.add(buttonPanel2, gbc);

        
        // Botón para regresar a la pantalla de bienvenida
        bienvenidaBtn = new JButton("Regresar a Bienvenida");
        bienvenidaBtn.addActionListener(this);
        gbc.gridy = 9;
        mainPanel.add(bienvenidaBtn, gbc);

        // Botón para salida
        salidaBtn = new JButton("Salir");
        salidaBtn.setForeground(Color.WHITE);
        salidaBtn.setBackground(new Color(186, 85, 211));
        salidaBtn.setOpaque(true);
        salidaBtn.setBorderPainted(false);
        salidaBtn.addActionListener(this);
        gbc.gridy = 10;
        mainPanel.add(salidaBtn, gbc);

        // Mensaje label
        mensajeLbl = new JLabel("");
        gbc.gridy = 11;
        mainPanel.add(mensajeLbl, gbc);

        // Añadir el panel principal al área central del BorderLayout
        this.add(mainPanel, BorderLayout.CENTER);

        // Panel para el copyright
        JPanel footerPanel = new JPanel();
        copyrightLbl = new JLabel("©2024 WENDYTOMAS FLORISTERIA. Todos los Derechos Reservados");
        footerPanel.add(copyrightLbl);
       
        

        // Configuración de la ventana
        this.setTitle("Bienvenido a Floristeria Wendy");
        this.setLocationRelativeTo(null);
        this.setSize(600, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.PINK);
    }
 @Override
   public void focusGained(FocusEvent fe) {
        if (fe.getSource() == nombreField && nombreField.getText().equals("Ingrese su nombre")) {
            nombreField.setText("");
        } else if (fe.getSource() == apellidoField && apellidoField.getText().equals("Ingrese su apellido")) {
            apellidoField.setText("");
        } else if (fe.getSource() == tiempoField && tiempoField.getText().equals("Ingrese un número entero")) {
            tiempoField.setText("");
        }
    }
 @Override
    public void focusLost(FocusEvent fe) {
        
        if (fe.getSource() == nombreField && nombreField.getText().isEmpty()) {
            nombreField.setText("Ingrese su nombre");
        } else if (fe.getSource() == apellidoField && apellidoField.getText().isEmpty()) {
            apellidoField.setText("Ingrese su apellido");
        } else if (fe.getSource() == tiempoField && tiempoField.getText().isEmpty()) {
            tiempoField.setText("Ingrese un número entero");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == calcularBtn) {
            String dpto = (String) departamento.getSelectedItem();
            String tiempoStr = tiempoField.getText();
            if (!validarEntrada(tiempoStr, dpto)) return;
            
             int tiempoInt = Integer.parseInt(tiempoStr);
            String mensaje = calcularVacaciones(dpto, tiempoInt);
            mostrarMensaje(mensaje);
            resultadoField.setText(mensaje);

        } else if (source == reiniciarBtn) {
            reiniciarFormulario();
        } else if (source == bienvenidaBtn) {
            this.dispose();
            new BienvenidaFlores();  // Debe haber una clase para la bienvenida
        } else if (source == salidaBtn) {
            System.exit(0);
        }
    }
     private boolean validarEntrada(String tiempoStr, String dpto) {
        if (dpto.isEmpty() || dpto.equals("Seleccione una opción")) {
           JOptionPane.showMessageDialog(this, "Seleccione un departamento", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (tiempoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el tiempo", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void mostrarMensaje(String mensaje) {
        mensajeLbl.setText(mensaje);
        mensajeLbl.setVisible(true);
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
     private void reiniciarFormulario() {
         nombreField.setText("Ingrese su nombre");
         apellidoField.setText("Ingrese su apellido");
        departamento.setSelectedIndex(0);
        tiempoField.setText("Ingrese un número entero");
        resultadoField.setText("");
        mensajeLbl.setText("");
    }

    private String calcularVacaciones(String dpto, int tiempoInt) {
        switch (dpto) {
            case "Atención al cliente":
                return calcularVacacionesAtencionCliente(tiempoInt);
            case "Logística":
                return calcularVacacionesLogistica(tiempoInt);
            case "Gerentes":
                return calcularVacacionesGerentes(tiempoInt);
            default:
                return "Departamento desconocido";
        }
    }
    private String calcularVacacionesAtencionCliente(int tiempoInt) {
        if (tiempoInt == 1) return "6 días de vacaciones";
        if (tiempoInt <= 6) return "14 días de vacaciones";
        return "20 días de vacaciones";
    }

    private String calcularVacacionesLogistica(int tiempoInt) {
        if (tiempoInt == 1) return "7 días de vacaciones";
        if (tiempoInt <= 6) return "15 días de vacaciones";
        return "22 días de vacaciones";
    }

    private String calcularVacacionesGerentes(int tiempoInt) {
        if (tiempoInt == 1) return "10 días de vacaciones";
        if (tiempoInt <= 6) return "20 días de vacaciones";
        return "30 días de vacaciones";
    }
    @Override
    public void keyTyped(KeyEvent ke) {
        char entrada = ke.getKeyChar();
        if (!Character.isDigit(entrada)) {
            ke.consume();  // Solo permitir números
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}