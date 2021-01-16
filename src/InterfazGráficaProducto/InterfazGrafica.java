package InterfazGráficaProducto;


// PAQUETES DE DONDE VIENENN LOS COMPONENTES DE LAS INTERFACES GRÁFICAS
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class InterfazGrafica extends JFrame implements ActionListener{
	
	private static final int DISTANCIA_ENTRE_COMPONENTES = 120;

	private JButton botonAcceptar;
	private JLabel etiquetaAcceptar, etiquetaMensaje;
	private JTextField entradaAcceptar;
	
	
	public InterfazGrafica(){
		setTitle("Interfaz de prueba");
		setLayout(new FlowLayout()); //  la clase que decide como se reparten los botones (Y demas controles) dentro de la ventana se llama Layout
		
		etiquetaAcceptar();
		entradaAcceptar();
		botonAcceptar();
		etiquetaMensaje();
		
		configuracion();
		
		
	}
	
	public void etiquetaAcceptar() {
		etiquetaAcceptar = new JLabel("Introduce un texto");
		add(etiquetaAcceptar);
	}
	
	public void entradaAcceptar() {
		entradaAcceptar = new JTextField();
		entradaAcceptar.setBounds(0,0, 100, 30);
		add(entradaAcceptar);
	}
	
	public void botonAcceptar() {
		botonAcceptar = new JButton("Aceptar");
		botonAcceptar.addActionListener(this);
		add(botonAcceptar);
	}
	
	public void etiquetaMensaje() {
		etiquetaMensaje = new JLabel("Aquí irá un mensaje");
		add(botonAcceptar);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == botonAcceptar){
			etiquetaMensaje.setText(entradaAcceptar.getText());
			System.out.println(entradaAcceptar.getText());
		}
		
		
	}
	

	
	public void configuracion(){
		//pack(); // lanza la interfaz (la aplicación)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // colocar boton de cerrar
		setVisible(true);

		setBounds(0,0,550,400);
		setLocationRelativeTo(null); // localizacion, con null lo coloca en el centrro
		//setResizable(true); // No se permita cambiar el tamaño
	}
		
	public static void main(String[] args) {
		InterfazGrafica interfaz = new InterfazGrafica();
		
		
	}
	
	
	

}
