/*Defina la clase TarifaProveedor con un método calcular(totalSMS, totalMinutos,
totalGigas) que, dado la cantidad de mensajes, minutos de llamada y GB de consumo de
datos calcule el valor en pesos a pagar. El valor a retornar del método calcular debe ser
la suma de los resultados obtenidos en los métodos calcularSMS(totalSMS),
calcularMinutosDeLlamada(totalMinutos) y calcularConsumoGB(totalGigas)
Los valores por defecto de cada servicio son
● Mensajes de texto(SMS): $1
● Minuto de llamada: $15
● Gigas(GB) de internet: $20.
Además de los métodos anteriores, debe poseer un método abstracto getNombre() que retorne el nombre del proveedor*/

public abstract class TarifaProveedor {
    protected String nombre;
    protected int totalSMS;
    protected int totalMinutos;
    protected int totalGigas;

    public TarifaProveedor(String Nombre){ // Constructor
        this.nombre = Nombre;
    }
    
    public double calcular(int totalSMS, int totalMinutos, int totalGigas){
        return calcularSMS(totalSMS) + calcularMinutosDeLlamada(totalMinutos) + calcularConsumoGB(totalGigas);
    }

    public double calcularSMS(int totalSMS){
        return totalSMS;
    }

    public double calcularMinutosDeLlamada(int totalMinutos){
        return totalMinutos * 15;
    }

    public double calcularConsumoGB(int totalGigas){
        return totalGigas * 20;
    }

    public abstract String getNombre(); // Método abstracto

}
