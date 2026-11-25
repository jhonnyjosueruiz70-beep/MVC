package ec.edu.espoch.mvc.VISTA;

import ec.edu.espoch.mvc.CONTRLOADOR.ControladorOperaciones;

public class Vista {
    
    ControladorOperaciones controlador = new ControladorOperaciones();

    public String getnumOne() {

        return "5";

    }

    public String getnumTwo() {

        return "0";

    }

    public void mostrar(float respuesta) {
        System.out.println(" la respuesta es :" + respuesta);

    }
    
    public void mostrarError () {
        System.out.println("ERROR");
        

    }
    
    public void enviar(){
        controlador.controlarOperacion();
    }
}
