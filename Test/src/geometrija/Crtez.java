package geometrija;


import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Crtez extends JPanel{
	int x;
	int y;
	public Crtez() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				x = e.getX();
				y = e.getY();
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame prozor = new JFrame("Crtanje");
		prozor.setSize(800, 600);
		Crtez c = new Crtez();
		prozor.getContentPane().add(c);
		prozor.setVisible(true);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void paint(Graphics g){
		/*Tacka t1 = new Tacka(x, y);
		t1.crtajSe(g);
		repaint();
		t1.setBoja("crvena");
		t1.setSelektovan(true);
		t1.crtajSe(g);
		Linija l1 = new Linija(new Tacka(20, 20), new Tacka(120, 40));
		l1.crtajSe(g);
		
		Pravougaonik p1 = new Pravougaonik(new Tacka(150, 30), 100, 50,"pLAVa");
		Kvadrat kv1 = new Kvadrat(new Tacka(300, 30), 100, "cRVeNa");
		p1.crtajSe(g);
		p1.setBojaUnutrasnjosti("zuta");
		p1.popuni(g);
		kv1.setBojaUnutrasnjosti("plava");
		
		kv1.crtajSe(g);
		kv1.popuni(g);
		Krug kr1 = new Krug(new Tacka(500, 400), 100,"zelena");
		kr1.crtajSe(g);
		kr1.popuni(g);*/
	}

}