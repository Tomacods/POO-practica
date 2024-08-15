import java.util.ArrayList;
import java.util.List;

public class EmpresaTomas {
    private String nombre;
    private String direccion;
    private List<PersonaTomas> empleados;

    public EmpresaTomas(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void addEmpleado(PersonaTomas empleado) {
        empleados.add(empleado);
    }
    public void getEmpleados() {
        for (PersonaTomas empleado : empleados) {
            System.out.println(empleado.getNombre());
        }
    }
    public void imprimirEmpleados() {
        for (PersonaTomas empleado : empleados) {
            empleado.imprimir();
        }
    }
    public void AñadirEmpleado(PersonaTomas empleado) {
        empleados.add(empleado);
    }
    public void ContarEmpleados() {
        System.out.println("Cantidad de empleados: " + empleados.size());
    }
    public void Imprimir () {
        System.out.println("Nombre de la empresa: " + nombre);
        System.out.println("Direccion de la empresa: " + direccion);
        System.out.println("Empleados: ");
        for (PersonaTomas empleado : empleados) {
            empleado.imprimir();
        }
    }
    public void AñadirEmpleadoPorTeclado (PersonaTomas empleado) {
        empleados.add(empleado);
    }
}


//strign decicion = (numero <20) ? "menor a 20" : "mayor a 20";
//swithc (numero) {
//  case 1: 

//arraylist <Integer> numeros = new ArrayList<>();
//numeros.add(1);
//numeros.add(2);
//numeros.add(3);
//numeros.add(4);

//for (int i = 0; i < numeros.size(); i++) {
// if (numeros.get(i) == 2) {
//para comparar cadenas
 //if (decicion.equals("menor a 20")) {
//  System.out.println("es menor a 20");
//} else {
//  System.out.println("es mayor a 20");
//}