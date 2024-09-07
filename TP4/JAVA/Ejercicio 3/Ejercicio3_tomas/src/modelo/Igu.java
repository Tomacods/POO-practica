
package modelo;


interface Igu {
    
    public abstract String formatearMoneda (Double cantidad);
    public abstract  String  formatearFecha (int dia, int mes, int anio) throws FechaInvalida;
    
}

