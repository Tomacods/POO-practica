public class Argentina implements Formateo {
    @Override
    public  String formatearMoneda(Double cantidad){
        String doubleString = String.valueOf(cantidad);
        return "$ARS" + doubleString;
    }
    @Override
    public  String formatearFecha (Integer dia, Integer mes, Integer año){
        return String.valueOf(dia) +"/"+ String.valueOf(mes) +"/"+ String.valueOf(año);

    }

}
