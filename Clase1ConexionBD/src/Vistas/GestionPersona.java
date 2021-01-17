/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import clase1conexionbd.controlador.PersonaBD;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author OxOrboy!
 */
//public class GestionPersona extends JFrame {
//        JPanel panel = new JPanel();
//        public GestionPersona() {
//        //MOSTRAR PÁNTALLA
//        this.show();
//        //TITULO DE LA VENTANA
//        this.setTitle("Ventana");
//        //TAMAÑO DE VENTANA
//        this.setSize(400, 600);
//        //SE AGREGA UN LAYOUT PARA DISTRIUBUI A LA CLASE
//        JLabel label = new JLabel ("VENTANA DE REGISTRO PERSONAL");
//        JButton button = new JButton();
//        button.setText("REGISTAR PERSONA");
//        panel.add(label);
//        panel.add(button);
//        //AGREGE EL PANEL AL JFRAME
//        this.add(panel);
//        //CENTRAR PÁNTALLA
//        this.setLocationRelativeTo(null);
//        //FIN DEL PROGRAMA
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     

//    private JPanel panelTitulo = new JPanel();
//    private JPanel panelCuerpo = new JPanel();
//    private JPanel panelBotones = new JPanel();;
//    public GestionPersona() {
//        crearBotones();
//    //mostrar pantalla
//    this.show();
//    //titulo de la ventana 
//    this.setTitle("ventana");
//    // tamaño inicial de la ventana 
//    this.setSize(800,500);
//    // se agrega un layout distribuir los componentes 
//    //panel.setLayout(new BoxLayout (panel, BoxLayoud.PAGE_AXIS))
//    panelTitulo.setLayout(new FlowLayout());
//    //JPanel panel = new JPanel();
//    JLabel label= new JLabel("Registro de personas");
//        // agregar el panel a la ventana  
//        panelTitulo.add(label);
//    panelCuerpo.setLayout(new GridLayout(5,1));
//        panelCuerpo.add(new JLabel("Nombre:"));
//    panelCuerpo.add(new JTextField("Joan"));
//        panelCuerpo.add(new JLabel("Apellido:"));
//    panelCuerpo.add(new JTextField("Collaguazo"));
//        panelCuerpo.add(new JLabel("Direccion:"));
//    panelCuerpo.add(new JTextField("Calle Guayaquil"));
//        panelCuerpo.add(new JLabel("Correo:"));
//    panelCuerpo.add(new JTextField("joangamer12@gmail.com"));
//        panelCuerpo.add(new JLabel("celular:"));
//    panelCuerpo.add(new JTextField("0986500951"));    
//    //panelCuerpo.add(panelCuerpo);
//    //this.add(panelCuerpo);
//    //centrar la pantalla 
//    this.setLocationRelativeTo(null);
//    this.setSize(new Dimension (800, 300));
//    // finalizar proceso
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    
//    private void crearBotones(){
//        JButton boton1 = new JButton();
//        boton1.setText("AÑADIR");//ESTABLE UN TEXTO DENTRO DEL BOTON
//        boton1.setBounds(100, 100, 100, 40);
//        boton1.setEnabled(true);//ESTABLECE EL ENCENDIDO DE LOS BOTONES
//        panelBotones.add(boton1);
//    }
//        
//    
//
public class GestionPersona extends JFrame {
    
    //CREACION DE LOS PANELES PARA LA VENTA
    private JPanel panel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JTable table = new JTable();

    public GestionPersona() {

        //DATOS DE LA VENTANA PRINCIPAL
        this.setTitle("REGISTRO DE PERSONAS");
        this.setSize(400, 220);
        panel.setSize(300, 400);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));
        //TITULO DE LABEL
        JLabel label = new JLabel("REGISTRO DE PERSONAS");
        panel.add(label);
        //DATOS DEL PANEL
        panel1.setLayout(new GridLayout(6, 2));
        panel1.add(new JLabel("CEDULA"));
        JTextField cedula = new JTextField("0705572600");
        panel1.add(cedula);
        panel1.add(new JLabel("NOMBRES"));
        JTextField nombres = new JTextField("Joan Antony");
        panel1.add(nombres);
        panel1.add(new JLabel("APELLIDOS"));
        JTextField apellidos = new JTextField("Collaguazo Montero");
        panel1.add(apellidos);
        panel1.add(new JLabel("DIRECCION"));
        JTextField direccion = new JTextField("Calle Guayaquil");
        panel1.add(direccion);
        panel1.add(new JLabel("CORREO"));
        JTextField correo = new JTextField("joangamers12@gmail.com");
        panel1.add(correo);
        panel1.add(new JLabel("TELEFONO"));
        JTextField telefono = new JTextField("0986500951");
        panel1.add(telefono);
        this.add(panel1);
        panel1.setSize(350, 350);
        this.setLocationRelativeTo(null);

        //BOTONES:
        JButton guardar = new JButton("GUARDAR");
        JButton editar = new JButton("EDITAR");
        JButton eliminar = new JButton("ELIMINAR");
        panel.add(panel1);
        //AGREGAR BOTONES AL PANEL
        panel.add(guardar);
        panel.add(editar);
        panel.add(eliminar);

        this.add(panel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
