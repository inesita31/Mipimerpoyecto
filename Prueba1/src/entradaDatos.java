import javax.swing.*;
public class entradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre");
		  
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		  int edad_usuario = Integer.parseInt(edad);
		  
		  edad_usuario ++;
		
		System.out.println( " Mi nombre es " + nombre_usuario + " el  año que viene tendre " + edad_usuario);
	}

}
