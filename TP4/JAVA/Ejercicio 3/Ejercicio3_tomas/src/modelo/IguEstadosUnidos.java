
package modelo;

import java.text.NumberFormat;
import java.util.Locale;


public class IguEstadosUnidos implements Igu {
    
    @Override
    public String formatearMoneda(Double cantidad) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US); // Formato de moneda en Estados Unidos
        return currencyFormatter.format(cantidad);
    }
    
    @Override
    public String formatearFecha(int dia, int mes, int anio) throws FechaInvalida {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900 || anio > 2100) {
            throw new FechaInvalida("Fecha inválida");
        }
        return String.format("%02d/%02d/%d", mes, dia, anio); // %02d: 2 digitos, rellenando con 0 si es necesario 
    }
    
}