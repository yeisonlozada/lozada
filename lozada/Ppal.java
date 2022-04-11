import Misclases.*;
import javax.swing.JOptionPane;
class Ppal{
	public static void main(String args[]){
		Arreglo ob=new Arreglo();
		int opc;
		do{
		   opc=Integer.parseInt(JOptionPane.showInputDialog("menu\n1.Cargar\n2.Imprimir\n3.Invertir\n4.Ordenar\n5.salir\nDigite opcion:"));
		   switch(opc){
			case 1:ob.cargar();break;
			case 2:ob.impri();break;
			case 3:ob.invertir();break;
			case 4:do{
				opc=Integer.parseInt(JOptionPane.showInputDialog("menu\n1.Burbuja\n2.Secuencial\nDigite opcion:"));
				switch(opc) {
				case 1:ob.ordenarBurbuja(null);break;
				case 2:ob.secuencial();break;
				
				}
			}while(opc<0);
	
		   }
		}while(opc!=5);
	}
}	

