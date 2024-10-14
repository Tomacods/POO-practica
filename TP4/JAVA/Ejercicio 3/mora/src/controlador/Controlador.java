
public class Controlador {

    Vista vista;
    EstadosUnidos eeuu;
    Argentina arg;

    public Controlador(Vista vista, EstadosUnidos eeuu, Argentina arg) {
        this.vista = vista;
        this.eeuu = eeuu;
        this.arg= arg;
        }

    public void iniciarVista() {
        vista.mostrarEjemploJDialogConEntradas();
        agregarListeners(); 
    }

    private void agregarListeners() {
        // Añadir listener para detectar cuando el usuario hace la selección
        vista.addSeleccionListener(e -> {
            System.out.println("Botón Seleccionar presionado");
            if ("Eeuu".equals(vista.getSeleccion())) {
                System.out.println("Seleccionado: Eeuu");
                formatearEeuu(); // Llamar al formateo si se selecciona "Eeuu"
            } if ("Arg".equals(vista.getSeleccion())) {
                formatearArg();
            }
            ;
        });
    }

    private void formatearEeuu() {
        Double monto = vista.getMontoIngresado();
        String nuevoMonto = eeuu.formatearMoneda(monto);
        Integer dia = vista.getDiaIngresado();
        Integer mes = vista.getMesIngresado();
        Integer año = vista.getAñoIngresado();
        String nuevaFecha = eeuu.formatearFecha(dia, mes, año);
        vista.label(nuevaFecha, nuevoMonto);

    }

    private void formatearArg() {
        Double monto = vista.getMontoIngresado();
        String nuevoMonto = arg.formatearMoneda(monto);
        Integer dia = vista.getDiaIngresado();
        Integer mes = vista.getMesIngresado();
        Integer año = vista.getAñoIngresado();
        String nuevaFecha = arg.formatearFecha(dia, mes, año);
        vista.label(nuevaFecha, nuevoMonto);

    }

}
