package Procesos;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Postres.*;
public class ManejadorDePrecio {
	
	 public static double calcularPrecioFinal(Postre Postre){
	        double precioFinal;
	        double precioParcial=Postre.getPrecioParcial();
	        ArrayList<Aderezo> aderezos=Postre.getAderezos();
	        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
	        return precioFinal;
	    }
	 
	 public String showPrecioFinal(Postre Postre){
	        return "Precio Final: $ " + calcularPrecioFinal(Postre);
	    }

}
