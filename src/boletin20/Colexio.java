package boletin20;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Colexio {

    Alumno alum = new Alumno();
    private int rexistro = 5500;

    Map<String, Alumno> rex = new TreeMap();

    public static int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Dar de alta alumno", "Dar de baixa alumno", "Localizar alumno ", "Visualizar todos os alumnos", "Sair do programa"}, "Sair do programa");
        return opcion + 1;

    }

    public void darDeAlta() {
        int confirma;
        do {
            String nom = JOptionPane.showInputDialog("introduce nome");
            int not = Integer.parseInt(JOptionPane.showInputDialog("introduce a nota"));
            rex.put(String.valueOf(rexistro), new Alumno(nom, not));
            rexistro++;
            confirma = JOptionPane.showConfirmDialog(null, "Añadir outro alumno?", "AVISO!!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        } while (confirma == 0);
    }

    public void darDeBaixa() {
        String crave = JOptionPane.showInputDialog("introduce nº crave do alumno a borrar");
            if (rex.containsKey(crave)) {
                rex.remove(crave);
                JOptionPane.showMessageDialog(null, "Borraches: " + crave, "AVISO!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Non existe: " + crave, "ERRO!", JOptionPane.WARNING_MESSAGE);
            }
        
    }

    public void localizarAlumno() {
        String atopa = JOptionPane.showInputDialog(null, "introduce o nº do alumno que queres atopar", "Busqueda", JOptionPane.PLAIN_MESSAGE);
        boolean existe=rex.containsKey(atopa);
        if (existe){
        JOptionPane.showMessageDialog(null, atopa + " é " + rex.get(atopa) );
        }else{
            JOptionPane.showMessageDialog(null, "Non existe"+atopa, "ERRO!!", JOptionPane.WARNING_MESSAGE);
        }
            

        
    }

    public void amosarAlumnos() {
        String map = "";
        Iterator it = rex.keySet().iterator();
        while (it.hasNext()) {
            String crave=(String) it.next();
            map += crave + rex.get(crave) + "\n---------------------\n";

        }
        JOptionPane.showMessageDialog(null, map);
    }

}
