package Modelo;

import java.util.Random;

import javax.swing.JOptionPane;

 public class Funciones {

	 int M[][];

	public Funciones() {
		M = new int[3][3];
		Random r = new Random();
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				M[i][j] = r.nextInt(99);
			}
		}
	}

	public Funciones(int N) {

		M = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				M[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite dato:"));
				;
			}
		}
	}

	public Funciones(Funciones ob1, Funciones ob2) {
		M = new int[3][3];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				for (int j2 = 0; j2 < M.length; j2++) {
					M[i][j] += ob1.M[i][j2] * ob2.M[j2][i];
				}
				

			}
		}

	}

	public void imprimir1(Funciones ob1) {
		String salida = "lOS DATOS SON: \n";
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				salida += M[i][j] + " ";
			}
			salida += "\n";
		}
		JOptionPane.showInternalMessageDialog(null, salida);
	}

	public void imprimir2(Funciones ob2) {
		String salida = "lOS DATOS SON: \n";
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				salida += M[i][j] + " ";
			}
			salida += "\n";
		}
		JOptionPane.showInternalMessageDialog(null, salida);
	}

	public void imprimir3(Funciones ob3) {
		String salida = "lOS DATOS SON: \n";
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M.length; j++) {
				salida += M[i][j] + " ";
			}
			salida += "\n";
		}
		JOptionPane.showInternalMessageDialog(null, salida);

	}

}
