package boletin20;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Colexio {

    Alumno alum = new Alumno();
    int rexistro=5500;
    String rexist=String.valueOf(rexistro);
    Map<String, Alumno> rex = new TreeMap();

    public static int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Dar de alta alumno", "Dar de baixa alumno", "Localizar alumno ", "Visualizar todos os alumnos", "Sair do programa"}, "Sair do programa");
        return opcion + 1;

    }

    public void darDeAlta() {
        String aux = alum.darNome();
        int auxNot;
        while (aux.compareToIgnoreCase("fin") != 0 && aux != null) {
            auxNot = alum.darNota();
            rex.put(String.valueOf(rexistro+1) , new Alumno(aux,auxNot));
            aux = alum.darNome();
        }
 }

    public void darDeBaixa(){
        String crave=JOptionPane.showInputDialog("introduce nº crave do alumno a borrar");
        for(int i=0;i<rex.size();i++){
          if (crave==rexist){
              rex.remove(i);
                JOptionPane.showMessageDialog(null, "Borraches: "+crave, "AVISO!", JOptionPane.WARNING_MESSAGE);
          }else
              JOptionPane.showMessageDialog(null, "Non existe: "+crave, "ERRO!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void localizarAlumno(){
        JOptionPane.showInputDialog(null, "introduce o nº do alumno que queres atopar", "Busqueda", JOptionPane.PLAIN_MESSAGE);
        
    }
    public void amosarAlumnos(){
        String map="";
        map+=rexist+alum.toString();
        JOptionPane.showMessageDialog(null, map);
    }


}
