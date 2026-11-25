package ec.edu.espoch.mvc.MODELO;

/**
 *
 * @author User
 */
public class Operaciones implements InterfaceOperacion {
    @Override
    public float sumar (Operacion operacion) {
        return operacion.getNumUno()+operacion.getNumDos();
    }
}
