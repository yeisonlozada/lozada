package vista;

import Modelo.*;
import javax.swing.JOptionPane;

public class Vista {
	public static void main(String[] args) {
		Funciones ob1 = null;
		Funciones ob2 = null;
		Funciones ob3 = null;
		int opc;
		int N = 1;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.Cargar\n2.Imprimir\n3.salir:"));
			switch (opc) {
			case 1:
				do {
					opc = Integer.parseInt(
							JOptionPane.showInputDialog("Menu\n1.Aleatorio\n2.Teclado\n3.Multiplicar\n4.Volver:"));
					switch (opc) {
					case 1:
						JOptionPane.showMessageDialog(null, " Teclado Aletorio" );
						ob1 = new Funciones();
						break;
					case 2:
						JOptionPane.showMessageDialog(null, " Cargar" );
						ob2 = new Funciones(N);
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Multiplicación" );
						
						ob3 = new Funciones(ob1,ob2);
						break;
					}
				} while (opc != 4);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "IMPTIMIR ");
				do {
					opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.001\n2.002\n3.003\n4.Volver:"));
					switch (opc) {
					case 1:
						JOptionPane.showMessageDialog(null, " OO1" );
						ob1.imprimir1(ob1);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, " OO2" );
						ob2.imprimir2(ob2);
						break;
					case 3:
						JOptionPane.showMessageDialog(null, " OO3" );
						ob3.imprimir3(ob3);
						break;
					}
				} while (opc != 4);
				break;
			}

		} while (opc != 3);
	}
}
