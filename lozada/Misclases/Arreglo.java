package Misclases;
import javax.swing.JOptionPane;

public class Arreglo {
		int v[]=new int[5];
		public void cargar(){
		       for (int i=0;i<5;i++){
			v[i]=Integer.parseInt(JOptionPane.showInputDialog("v["+i+"]:"));
			
		       }
		}
		public void impri(){
			String salida="los datos del arreglo son:\n";
		       for (int i=0;i<5;i++){
			    salida=salida+v[i]+" ";
		       }
			JOptionPane.showMessageDialog(null,salida);

		}
		 public void  invertir() {
		    	int j=v.length -1;
		    	String salid="los datos invertidos del arreglo son:\n";
		    	for (int i = 4; i >=0; i--) {
				           salid=salid+ v[i]+" ";
			        }
		    	JOptionPane.showMessageDialog(null,salid);
		}   
	    
	    public void ordenarBurbuja(int[] vector) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (v[i] < v[j]) {
					int numero = v[i];
					v[i] = v[j];
					v[j] = numero;

				}
			}
		}
	}
	    public void secuencial(){
			for (int i = 0; i < v.length; i++){
				for (int j = 0; j < v.length; j++){
					if (v[i] > v[j]){
						int aux = v[i];
						v[i] = v[j];
						v[j] = aux;
					}
				}
			}
		}
	}
	
	


