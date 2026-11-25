package ec.edu.espoch.mvc.CONTRLOADOR;

import ec.edu.espoch.mvc.MODELO.InterfaceOperacion;
import ec.edu.espoch.mvc.MODELO.Operacion;
import ec.edu.espoch.mvc.MODELO.Operaciones;
import ec.edu.espoch.mvc.VISTA.Vista;

/**
 *
 * @author User
 */
public class ControladorOperaciones {

    public void controlarOperacion() {
        Vista vista = new Vista ();
        try {
            
            
            
            float numUno=Float.parseFloat(vista.getnumOne());
            float numDos =Float.parseFloat(vista.getnumTwo());
            
            
            
            
            Operacion operacion = new Operacion(numUno, numDos);
            InterfaceOperacion interfazOperacion = new Operaciones();
            float respuesta = interfazOperacion.sumar(operacion);
            
           
            vista.mostrar(respuesta);
            

        } catch (Exception e) {
            vista.mostrarError();
        }
    }
}
