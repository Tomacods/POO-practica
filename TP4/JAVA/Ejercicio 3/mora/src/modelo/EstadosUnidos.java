public class EstadosUnidos implements Formateo {
    //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html //Se puede hacer con tipo el tipo fecha tmb
    @Override
    public  String formatearMoneda(Double cantidad){
        String doubleString = String.valueOf(cantidad);
        return "$USD" + doubleString;
    }
    @Override
    public  String formatearFecha (Integer dia, Integer mes, Integer año){
        return String.valueOf(año) +"/" +String.valueOf(mes)+"/" +  String.valueOf(dia);

    }
}
