public interface StateCaja {
    
    void atender(Cliente cliente);
    void abierta(Caja caja);
    void suspendida(Caja caja);
    void cerrada(Caja caja);
}
