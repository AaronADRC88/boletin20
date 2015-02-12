package boletin20;

import javax.swing.JOptionPane;

public class Boletin20 {

    public static void main(String[] args) {
      Colexio obx=new Colexio();
        int op;
        int creado = 0;
        do {

           op = Colexio.menuSelect();
            switch (op) {
                case 1:
                    
                        obx.darDeAlta();
                        creado = 1;
                    
                    break;
                case 2:
                    
                        if (1 == creado) {
                           obx.darDeBaixa();
                        } else {
                            JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                        }
                   
                    break;
                case 3:
                    
                        if (1 == creado) {
                            obx.localizarAlumno();
                        } else {
                            JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                        }
                    
                    break;
                case 4:
                    
                        if (1 == creado) {
                           obx.amosarAlumnos();
                        } else {
                            JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                        }
                    
                    break;
                
                case 5:
                    if (op == 5 && op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 5 && op != 0);
    }
    
}
