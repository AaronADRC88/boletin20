
package boletin20;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Colexio {
  Alumno alum=new Alumno();
    String rexist="5500";
    Map<String,Alumno> rex=new TreeMap();
        public static int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Dar de alta alumno", "Dar de baixa alumno", "Localizar alumno ", "Visualizar todos os alumnos", "Sair do programa"}, "Sair do programa");
        return opcion + 1;
        
    }

        
public void darDeAlta(){
    String aux=alum.darNome();
    int auxNot;
    while(aux.compareToIgnoreCase("fin")!=0 && aux==null){
    auxNot=alum.darNota();
    Integer.parseInt(rexist);
    rex.put(rexist+1, alum);
    aux=alum.darNome();
    }
    
}



}
