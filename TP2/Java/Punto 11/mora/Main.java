public class Main {
    public static void main(String[] args) {

        Empresa empresaa = new Empresa("TABLADA", "CODIGO 6569");

        Persona empleado1 = new Persona("Mora", 21, "F", "si");
        Persona empleado2 = new Persona("Maria", 26, "F", "si");
        Persona empleado3 = new Persona("Leandro", 34, "M", "si");
        Persona empleado4 = new Persona("Victor", 43, "M", "si");
        Persona empleado5 = new Persona("Rocio", 24, "F", "si");

        empresaa.addPersona(empleado1);
        empresaa.addPersona(empleado2);
        empresaa.addPersona(empleado3);
        empresaa.addPersona(empleado4);
        empresaa.addPersona(empleado5);

        System.out.println(empresaa);
        
        for (Persona persona : empresaa.getPersonas()){
            System.out.println(persona);
            System.out.println();
        }
    }
}