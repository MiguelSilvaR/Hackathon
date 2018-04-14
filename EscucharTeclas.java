package mx.itesm.squad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

@SuppressWarnings("serial")
public class EscucharTeclas extends JFrame implements KeyListener {
	public static char caracter;
	public static boolean aleatorio = false;
	public static int coordenada1 = 100, coordenada2 = 100;
	public Random rnd = new Random(System.currentTimeMillis());
	public static boolean condPaint = false;
	public static int ancho = Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int alto = Toolkit.getDefaultToolkit().getScreenSize().height;

	private JButton bAceptar;

	public EscucharTeclas() {
		add(getbAceptar());
		inicializador();
	}


	private void inicializador() {
		JFrame ventana = new JFrame();
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setTitle("VanillaPiano");
		setVisible(true);
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setLayout(null);
		JLabel etiqueta1 = new JLabel("Presione las letras del abecedario para generar cuadros con respecto a su ubicaci\u00f3n en el teclado.");
		JLabel etiqueta2 = new JLabel("Presione 0 para reiniciar y 1 para aleatorizar mosaicos");
		ventana.add(etiqueta1);
		ventana.add(etiqueta2);
		ventana.setSize(650, 500);
		ventana.setVisible(true);
		etiqueta1.setBounds(50, 150, 800, 50);
		etiqueta2.setBounds(50, 180, 800, 50);
		JButton boton = new JButton("Aceptar");
		boton.setBounds(250, 250, 100, 50);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				ventana.dispose();
			}

		});
		ventana.add(boton);
	}
	private JButton getbAceptar() {
		bAceptar = new JButton("Aceptar");
		bAceptar.addKeyListener(this);
		bAceptar.setBounds(0, 0, 0, 0);
		return bAceptar;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (aleatorio ==  false){
			if (key == KeyEvent.VK_0) {
				getContentPane().setBackground(Color.white);
			}
			if (key == KeyEvent.VK_1){
				getContentPane().setBackground(Color.white);
				if (aleatorio == true)
					aleatorio = false;
				else
					aleatorio = true;
			}
			if (key == KeyEvent.VK_Q) {
				SoundClipTest l1 = new SoundClipTest("C1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = 100;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_W) {
				SoundClipTest l1 = new SoundClipTest("D1.wav");
				getContentPane().setBackground(Color.red);
				coordenada1 = 200;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_E) {
				SoundClipTest l1 = new SoundClipTest("E1.wav");
				//setBackground(Color.pink);
				getContentPane().setBackground(Color.blue);
				coordenada1 = 300;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_R) {
				SoundClipTest l1 = new SoundClipTest("F1.wav");
				getContentPane().setBackground(Color.yellow);
				coordenada1 = 400;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_T) {
				SoundClipTest l1 = new SoundClipTest("G1.wav");
				getContentPane().setBackground(Color.green);
				coordenada1 = 500;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_Y) {
				SoundClipTest l1 = new SoundClipTest("A1.wav");
				getContentPane().setBackground(Color.cyan);
				coordenada1 = 600;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_U) {
				SoundClipTest l1 = new SoundClipTest("B1.wav");
				getContentPane().setBackground(Color.pink);
				coordenada1 = 700;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_I) {
				SoundClipTest l1 = new SoundClipTest("C2.wav");
				getContentPane().setBackground(Color.magenta);
				coordenada1 = 800;
				coordenada2 = 100;
				condPaint = true;
				repaint();

			}
			if (key == KeyEvent.VK_O) {
				SoundClipTest l1 = new SoundClipTest("D2.wav");
				getContentPane().setBackground(Color.orange);
				coordenada1 = 900;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_P) {
				SoundClipTest l1 = new SoundClipTest("E2.wav"); //falta un audio para este
				getContentPane().setBackground(Color.orange);
				coordenada1 = 1000;
				coordenada2 = 100;
				condPaint = true;
				repaint();
			}
//----------------------------------------------------------------------------------------------------------------
			if (key == KeyEvent.VK_A) {
				SoundClipTest l1 = new SoundClipTest("F2.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = 100;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_S) {
				SoundClipTest l1 = new SoundClipTest("G2.wav");
				getContentPane().setBackground(Color.red);
				coordenada1 = 200;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_D) {
				SoundClipTest l1 = new SoundClipTest("A2.wav");
				//setBackground(Color.pink);
				getContentPane().setBackground(Color.blue);
				coordenada1 = 300;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_F) {
				SoundClipTest l1 = new SoundClipTest("B2.wav");
				getContentPane().setBackground(Color.yellow);
				coordenada1 = 400;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_G) {
				SoundClipTest l1 = new SoundClipTest("C3.wav");
				getContentPane().setBackground(Color.green);
				coordenada1 = 500;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_H) {
				SoundClipTest l1 = new SoundClipTest("D3.wav");
				getContentPane().setBackground(Color.cyan);
				coordenada1 = 600;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_J) {
				SoundClipTest l1 = new SoundClipTest("E3.wav");
				getContentPane().setBackground(Color.pink);
				coordenada1 = 700;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_K) {
				SoundClipTest l1 = new SoundClipTest("F3.wav");
				getContentPane().setBackground(Color.magenta);
				coordenada1 = 800;
				coordenada2 = 200;
				condPaint = true;
				repaint();

			}
			if (key == KeyEvent.VK_L) {
				SoundClipTest l1 = new SoundClipTest("G3.wav");
				getContentPane().setBackground(Color.orange);
				coordenada1 = 900;
				coordenada2 = 200;
				condPaint = true;
				repaint();
			}
//--------------------------------------------------------------------------------------------------------------
			if (key == KeyEvent.VK_Z) {
				SoundClipTest l1 = new SoundClipTest("A3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = 100;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_X) {
				SoundClipTest l1 = new SoundClipTest("B3.wav");
				getContentPane().setBackground(Color.red);
				coordenada1 = 200;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_C) {
				SoundClipTest l1 = new SoundClipTest("C4.wav");
				//setBackground(Color.pink);
				getContentPane().setBackground(Color.blue);
				coordenada1 = 300;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_V) {
				SoundClipTest l1 = new SoundClipTest("D4.wav");
				getContentPane().setBackground(Color.yellow);
				coordenada1 = 400;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_B) {
				SoundClipTest l1 = new SoundClipTest("E4.wav");
				getContentPane().setBackground(Color.green);
				coordenada1 = 500;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_N) {
				SoundClipTest l1 = new SoundClipTest("F4.wav");
				getContentPane().setBackground(Color.cyan);
				coordenada1 = 600;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_M) {
				SoundClipTest l1 = new SoundClipTest("G4.wav");
				getContentPane().setBackground(Color.pink);
				coordenada1 = 700;
				coordenada2 = 300;
				condPaint = true;
				repaint();
			}
		}
		 /*				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();  */
		else {
			if (key == KeyEvent.VK_0) {
				getContentPane().setBackground(Color.white);
			}
			if (key == KeyEvent.VK_1){
				getContentPane().setBackground(Color.white);
				if (aleatorio == true)
					aleatorio = false;
				else
					aleatorio = true;
			}
			if (key == KeyEvent.VK_Q) {
				SoundClipTest l1 = new SoundClipTest("C1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_W) {
				SoundClipTest l1 = new SoundClipTest("D1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_E) {
				SoundClipTest l1 = new SoundClipTest("E1.wav");
				//setBackground(Color.pink);
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_R) {
				SoundClipTest l1 = new SoundClipTest("F1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_T) {
				SoundClipTest l1 = new SoundClipTest("G1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_Y) {
				SoundClipTest l1 = new SoundClipTest("A1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_U) {
				SoundClipTest l1 = new SoundClipTest("B1.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_I) {
				SoundClipTest l1 = new SoundClipTest("C2.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();

			}
			if (key == KeyEvent.VK_O) {
				SoundClipTest l1 = new SoundClipTest("D2.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_P) {
				SoundClipTest l1 = new SoundClipTest("E2.wav"); //falta un audio para este
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
//----------------------------------------------------------------------------------------------------------------
			if (key == KeyEvent.VK_A) {
				SoundClipTest l1 = new SoundClipTest("F2.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_S) {
				SoundClipTest l1 = new SoundClipTest("G2.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_D) {
				SoundClipTest l1 = new SoundClipTest("A2.wav");
				//setBackground(Color.pink);
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_F) {
				SoundClipTest l1 = new SoundClipTest("B2.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_G) {
				SoundClipTest l1 = new SoundClipTest("C3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_H) {
				SoundClipTest l1 = new SoundClipTest("D3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_J) {
				SoundClipTest l1 = new SoundClipTest("E3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_K) {
				SoundClipTest l1 = new SoundClipTest("F3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();

			}
			if (key == KeyEvent.VK_L) {
				SoundClipTest l1 = new SoundClipTest("G3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
//--------------------------------------------------------------------------------------------------------------
			if (key == KeyEvent.VK_Z) {
				SoundClipTest l1 = new SoundClipTest("A3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_X) {
				SoundClipTest l1 = new SoundClipTest("B3.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_C) {
				SoundClipTest l1 = new SoundClipTest("C4.wav");
				//setBackground(Color.pink);
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_V) {
				SoundClipTest l1 = new SoundClipTest("D4.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_B) {
				SoundClipTest l1 = new SoundClipTest("E4.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_N) {
				SoundClipTest l1 = new SoundClipTest("F4.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
			if (key == KeyEvent.VK_M) {
				SoundClipTest l1 = new SoundClipTest("G4.wav");
				getContentPane().setBackground(Color.black);
				coordenada1 = rnd.nextInt(ancho);
				coordenada2 = rnd.nextInt(alto);
				condPaint = true;
				repaint();
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//getContentPane().setBackground(Color.white);
		condPaint = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void paint(Graphics g) {
		if (condPaint) {
			g.drawRect(coordenada1, coordenada2, 100, 100);
			Color color = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
			g.setColor(color);
			g.fillRect(coordenada1, coordenada2, 100, 100);
		}
		else {
			g.setColor(Color.white);
			g.fillRect(0, 0, 2000, 2000);
		}
	}
}