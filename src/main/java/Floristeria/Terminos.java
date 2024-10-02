/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Floristeria;

/**
 *
 * @author wcaro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Terminos extends JFrame implements FocusListener, ActionListener{
    ImageIcon logo;
    JScrollPane scroll;
    JTextArea terminosTxt;
    JButton rechazarBtn, continuarBtn;
    JCheckBox aceptarCbx;
    
    public Terminos(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        //configuración del layout
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.insets= new Insets(10,10,10,10);
        // cargar imagen
        logo = new ImageIcon(("C:\\Users\\wcaro\\OneDrive\\Documentos\\NetBeansProjects\\FloristeriaWendy\\src\\main\\java\\Floristeria\\lflor.png"));
        Image logoDimension = logo.getImage().getScaledInstance(200,200 ,Image.SCALE_SMOOTH);
        ImageIcon adjustedlogo = new ImageIcon(logoDimension);
        JLabel imageLabel = new JLabel(adjustedlogo);
        
        // añadir el logo en la parte superior
        gbc.gridx=0; //columna
        gbc.gridy=0;//fila
        gbc.gridwidth=2;//ocupa dos columnas
        gbc.anchor=GridBagConstraints.CENTER; //centrar
        this.add(imageLabel,gbc);
        
        //Icono en la barra de título
        this.setIconImage(logo.getImage());
        
        //Etiqueta titulo condiciones
        JLabel titulocondicionesLbl = new JLabel("Términos y condiciones");
        titulocondicionesLbl.setFont(new Font("Arial", Font.BOLD, 20));
        //titulocondicionesLbl.setBounds(75, 230, 350, 30);
        titulocondicionesLbl.setForeground(Color.WHITE);
        
       // Añadir el título en la parte superior, utilizando GridBagConstraints
gbc.gridx = 0; // Columna
gbc.gridy = 1; // Fila
gbc.gridwidth = 2; // Ocupa dos columnas
gbc.anchor = GridBagConstraints.CENTER; // Centrar 
this.add(titulocondicionesLbl,gbc);
        
        //Texto de Términos y condiciones
        terminosTxt = new JTextArea("""
                                    T\u00e9rminos y Condiciones de Uso
                                    Fecha de \u00faltima actualizaci\u00f3n: [Fecha]
                                    
                                    Bienvenido a [McDonalds]. Antes de utilizar nuestros servicios, te pedimos que leas cuidadosamente los siguientes t\u00e9rminos y condiciones. Al acceder y utilizar nuestra plataforma, aceptas estar sujeto a los presentes T\u00e9rminos y Condiciones de Uso./n
                                    
                                    1. Aceptaci\u00f3n de los T\u00e9rminos
                                    Al utilizar la plataforma [Nombre de la Plataforma], aceptas cumplir y respetar estos t\u00e9rminos y condiciones, as\u00ed como todas las leyes y normativas aplicables. Si no est\u00e1s de acuerdo con alguno de los t\u00e9rminos, no debes utilizar la plataforma./n
                                    
                                    2. Servicios Ofrecidos
                                    [N\u00famero breve de descripci\u00f3n de los servicios que la plataforma ofrece a los usuarios, por ejemplo, redes sociales, comercio electr\u00f3nico, etc.]/n
                                    
                                    Nos reservamos el derecho de modificar, suspender o interrumpir cualquier aspecto de los servicios en cualquier momento, con o sin previo aviso./n
                                    
                                    3. Cuentas de Usuario
                                    Para acceder a ciertos servicios, es posible que se te solicite crear una cuenta. Al crear una cuenta, te comprometes a proporcionar informaci\u00f3n precisa, completa y actualizada. Eres responsable de mantener la confidencialidad de tus credenciales de acceso y de todas las actividades que ocurran bajo tu cuenta./n
                                    
                                    3.1 Responsabilidad del Usuario
                                    No debes compartir tu cuenta ni contrase\u00f1as con terceros./n
                                    Eres responsable del uso de tu cuenta, incluyendo cualquier actividad que se realice desde ella./n
                                    Notif\u00edcanos de inmediato cualquier uso no autorizado de tu cuenta./n
                                    4. Uso Aceptable
                                    Te comprometes a utilizar la plataforma de forma legal y \u00e9tica. Los usuarios est\u00e1n prohibidos de:/n
                                    
                                    Subir, publicar o transmitir contenido que sea ilegal, ofensivo, difamatorio o que infrinja derechos de propiedad intelectual./n
                                    Utilizar la plataforma para fines fraudulentos, maliciosos o comerciales sin autorizaci\u00f3n expresa./n
                                    Intentar acceder, interferir o alterar el sistema de la plataforma mediante hacking, ingenier\u00eda inversa o cualquier otro m\u00e9todo no autorizado./n
                                    5. Propiedad Intelectual
                                    Todos los derechos de propiedad intelectual relacionados con la plataforma, incluyendo pero no limitado a, logotipos, marcas, gr\u00e1ficos, texto, dise\u00f1o y software, pertenecen a [Nombre de la Plataforma] o a sus licenciantes. El uso no autorizado de cualquier material protegido puede resultar en la suspensi\u00f3n o terminaci\u00f3n de tu cuenta./n
                                    
                                    6. Contenido de los Usuarios
                                    Si decides compartir contenido en la plataforma (como publicaciones, im\u00e1genes, comentarios, etc.), otorgas a [Nombre de la Plataforma] una licencia no exclusiva, mundial, libre de regal\u00edas y transferible para usar, reproducir, modificar, distribuir y mostrar dicho contenido en relaci\u00f3n con la operaci\u00f3n de la plataforma./n
                                    
                                    6.1 Derechos del Usuario
                                    Sigues siendo el propietario de cualquier contenido que publiques.
                                    No puedes publicar contenido que infrinja los derechos de autor, marcas registradas u otros derechos de propiedad intelectual de terceros./n
                                    7. Pol\u00edtica de Privacidad
                                    Nuestra pol\u00edtica de privacidad, disponible en [enlace a la pol\u00edtica de privacidad], describe c\u00f3mo recopilamos, usamos y protegemos tu informaci\u00f3n personal. Al aceptar estos t\u00e9rminos, tambi\u00e9n aceptas los t\u00e9rminos de nuestra pol\u00edtica de privacidad.
                                    
                                    8. Limitaci\u00f3n de Responsabilidad
                                    En la medida en que la ley lo permita, [Nombre de la Plataforma] no ser\u00e1 responsable por ning\u00fan da\u00f1o indirecto, incidental, especial, punitivo o consecuente que resulte del uso o la imposibilidad de uso de la plataforma. No garantizamos que la plataforma funcione sin interrupciones o errores, ni que est\u00e9 libre de virus o componentes da\u00f1inos.
                                                                                                          
                                    9. Terminaci\u00f3n
                                    Podemos suspender o cancelar tu acceso a la plataforma en cualquier momento, sin previo aviso, si creemos que has violado estos t\u00e9rminos o est\u00e1s involucrado en actividades fraudulentas, ilegales o que perjudiquen a otros usuarios o a la plataforma.""");
               
        terminosTxt.setFont(new Font("Arial", Font.PLAIN, 12));
        terminosTxt.setOpaque(true);
        terminosTxt.setForeground(Color.white);
        terminosTxt.setBackground(new Color(173, 216, 230));
        terminosTxt.setLineWrap(true);//ajustar el texto a la ventana
        terminosTxt.setWrapStyleWord(true);
        terminosTxt.setPreferredSize(new Dimension(600,800));
        
        //Scroll para términos y condiciones
        scroll = new JScrollPane(terminosTxt);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // añadir el área de términos con scroll
        gbc.gridx=0;
        gbc.gridy = 5; 
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH; // Para que ocupe todo el ancho y alto disponible
        gbc.weightx = 2.0; // Estirar en el eje X
        gbc.weighty = 2.0; // Estirar en el eje Y
        this.add(scroll,gbc);
        
        
        //Checkbox para aceptar términos
        aceptarCbx = new JCheckBox("yo  " + MainFlores.usuario +"  Acepto los términos y condiciones");
        aceptarCbx.setFont(new Font("Arial", Font.BOLD, 12));
        aceptarCbx.addActionListener(this);
        aceptarCbx.setForeground(Color.white);
        aceptarCbx.setBackground(new Color(173, 216, 230));
        
        
        
         // Añadir el checkbox en la parte inferior
        gbc.gridx = 0; 
        gbc.gridy = 6;
        gbc.gridwidth = 2; 
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(aceptarCbx,gbc);
        
        
        
        //Botón No aceptar
        rechazarBtn = new JButton("No aceptar");
        //rechazarBtn.setBounds(150,530,160,40);
        rechazarBtn.setForeground(Color.WHITE);
        rechazarBtn.setBackground(new Color(173, 216, 230));
        rechazarBtn.setOpaque(true);
        rechazarBtn.setBorderPainted(false);
        rechazarBtn.addActionListener(this);
        rechazarBtn.setEnabled(true);
        
        
        //Botón siguiente
        continuarBtn = new JButton("Siguiente");
        //continuarBtn.setBounds(500,530,160,40);
        continuarBtn.setForeground(Color.WHITE);
        continuarBtn.setBackground(new Color(173, 216, 230));
        continuarBtn.setOpaque(true);
        continuarBtn.setBorderPainted(false);
        continuarBtn.addActionListener(this);
        continuarBtn.setEnabled(false);
        
        // Añadir los botones en la parte inferior, uno al lado del otro
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END; // Alineamos el botón "No aceptar" a la derecha
        this.add(rechazarBtn, gbc);

        gbc.gridx = 1; 
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.LINE_START; // Alineamos el botón "Siguiente" a la izquierda
        this.add(continuarBtn, gbc);
        
        //Ventana términos
        this.setTitle("Bienvenido(a) " + MainFlores.usuario);
        this.setLocationRelativeTo(null);
        this.setSize(900, 600);
        //this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.pink);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==aceptarCbx){
            if (aceptarCbx.isSelected()){
                continuarBtn.setEnabled(true);
                rechazarBtn.setEnabled(false);
            } else {
                continuarBtn.setEnabled(false);
                rechazarBtn.setEnabled(true);
            }
        } else if(ae.getSource()==rechazarBtn){
            // volver a la pantalla de bienvenida
            BienvenidaFlores BienvenidaFlores = new BienvenidaFlores();
            MainFlores.usuario="";
            this.dispose();
        } else if (ae.getSource() == continuarBtn){
            //continuar al menu principal
            Principal Principal = new Principal() {
                @Override
                public void focusGained(FocusEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            this.dispose();
        }
    }
   
@Override
    public void focusGained(FocusEvent fe) {
        // No se usa en este contexto
    }

    @Override
    public void focusLost(FocusEvent fe) {
        // No se usa en este contexto
    }

    public static void main(String[] args) {
        new Terminos() {};
    }
}
   
    
        
    
    

  
        
   

   
    

   
