
package InterfazGrafica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfazGrafica extends JFrame implements ActionListener{
	
	private JLabel etiqueta;
	private JTextField entradaTexto;
	private JButton boton;
	private JTextArea muestraTexto;
	
	public InterfazGrafica() {
		
		JPanel panelPrincipal = new JPanel();
		JPanel panelSuperior = new JPanel();
		JPanel panelMedio = new JPanel();
		
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		panelSuperior.setLayout(new FlowLayout());
		panelMedio.setLayout(new FlowLayout());
		
		panelPrincipal.add(panelSuperior);
		panelPrincipal.add(panelMedio);
		
		etiqueta = new JLabel("Introduce un texto");
		etiqueta.setBounds(0,0, 400, 30);
		panelSuperior.add(etiqueta);
		
		entradaTexto = new JTextField(15);		
		panelSuperior.add(entradaTexto);
		
		boton = new JButton("Enviar");
		boton.addActionListener(this);
		panelSuperior.add(boton);
		
		muestraTexto = new JTextArea(25, 40);
		muestraTexto.setEditable(false);
		panelMedio.add(muestraTexto);
		
		
		this.add(panelPrincipal);
		this.setTitle("Nuestra ventana");
		this.setBounds(0,0, 600, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
			String texto = entradaTexto.getText();
			muestraTexto.append(texto + "\n");
			entradaTexto.setText("");
			//muestraTexto.setText(texto);
			System.out.println(texto);
		
		
	}

	
	public static void main(String[]a ) {
		new InterfazGrafica();
	}



	
	
}
