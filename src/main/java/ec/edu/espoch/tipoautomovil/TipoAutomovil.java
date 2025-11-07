/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.tipoautomovil;

import ec.edu.espoch.tipoautomovil.automovil.Automovil;
import ec.edu.espoch.tipoautomovil.enumeracion.ColorAutomovil;
import ec.edu.espoch.tipoautomovil.enumeracion.TipoCombustible;
import ec.edu.espoch.tipoautomovil.enumeracion.TipoMarcas;

/**
 *
 * @author gsupe
 */
public class TipoAutomovil {

    public static void main(String[] args) {
        
        
        
       Automovil automovilUno=new Automovil("Ferrari", "12Cilindri", 1, TipoCombustible.GASOLINA, TipoMarcas.COMPACTO, 2, 2, 150, ColorAutomovil.ROJO, 20);
        
        automovilUno.mostrarInformacion();
        
        automovilUno.setVelocidadActual(100);
        System.out.println("Velocidad actual: " + automovilUno.getVelocidadActual() + " km/h");
        
        automovilUno.acelerar(20);
        automovilUno.desacelerar(50);
        automovilUno.frenar();
        
        
    
        
    }
}
