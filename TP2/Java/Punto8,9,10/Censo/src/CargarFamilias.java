package Censo.src;

import java.time.LocalDate;
import java.util.ArrayList;


public class CargarFamilias {
    private ArrayList<PersonaCenso> personas = new ArrayList<>();
    private String direccion;
    private int cantidadPersonas;
    private int cantidadFamilias;

    public CargarFamilias(String direccion, int cantidadPersonas) {
        this.direccion = direccion;
        this.cantidadPersonas = cantidadPersonas;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    public void setCantidadFamilias(int cantidadFamilias) {
        this.cantidadFamilias = cantidadFamilias;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
    public int getCantidadFamilias() {
        return cantidadFamilias;
    }
    public void addPersona(PersonaCenso persona) {
        personas.add(persona);
    }
    public ArrayList<PersonaCenso> getPersonas() {
        return personas;
    }
    public void cargarFamilias() {
        for (int i = 0; i < cantidadFamilias; i++) {
            for (int j = 0; j < cantidadPersonas; j++) {
                PersonaCenso persona = new PersonaCenso("Nombre" + j, "Apellido" + j, LocalDate.of(1999, 10, 10), "Masculino", true);
                addPersona(persona);
            }
        }
    }
}
