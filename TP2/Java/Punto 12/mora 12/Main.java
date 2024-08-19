public class Main {
    public static void main(String[] args) {

        Empresa empresaa = new Empresa("TABLADA", "CODIGO 6569");

        Puesto administrativo = new Puesto("Administrativo");
        Puesto gerente = new Puesto("Gerente");
        Puesto tesorero = new Puesto("Tesorero");

        Persona empleado1 = new Persona("Mora", 21, "F", "Si", administrativo);
        Persona empleado2 = new Persona("Maria", 26, "F", "Si", administrativo);
        Persona empleado3 = new Persona("Leandro", 34, "M", "Si", administrativo);
        Persona empleado4 = new Persona("Victor", 43, "M", "Si", gerente);
        Persona empleado5 = new Persona("Rocio", 24, "F", "Si", tesorero);

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