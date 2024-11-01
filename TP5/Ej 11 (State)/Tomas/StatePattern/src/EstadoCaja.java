public interface EstadoCaja {
    void atenderPersona(Persona persona);
    void suspender(Caja caja);
    void cerrar(Caja caja);
    void abrir(Caja caja);
}