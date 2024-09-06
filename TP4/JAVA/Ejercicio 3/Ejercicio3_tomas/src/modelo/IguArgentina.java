

package modelo;


import java.text.NumberFormat;
import java.util.Locale;

public class IguArgentina implements Igu {
    
    
    
    @Override
    public String formatearMoneda(Double cantidad) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-AR")); // Formato de moneda en Argentina
        return currencyFormatter.format(cantidad);
    }
    
    @Override
    public String formatearFecha(int dia, int mes, int anio) {
        return String.format("%02d/%02d/%d", dia, mes, anio); // %02d: 2 digitos, rellenando con 0 si es necesario 
    }
    
}
