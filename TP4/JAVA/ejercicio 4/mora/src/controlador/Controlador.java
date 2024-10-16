
public class Controlador {
    private Vista vista;
    private Ingles ingles;
    private Portugues portugues;
    private Frances frances;

    public Controlador(Vista vista, Ingles ingles, Portugues portugues, Frances frances){
        this.vista=vista;
        this.ingles=ingles;
        this.portugues=portugues;
        this.frances=frances;
        mostrar();
    }

    public void mostrar(){
        vista.ventanaPrincipal();
        traducir();
    }

    private void traducir(){
        vista.addListener(e -> {
            System.out.println("Botón Seleccionar presionado");
            switch (vista.getSeleccion()) {
                case (1):
                    traducirIngles();
                //    System.out.println("Seleccionado: ingles");
                    break;
                case (2):
              //  System.out.println("Seleccionado: portugues");
                traducirPortugues();

                break;
                case (3):
                //System.out.println("Seleccionado: Frances");
                traducirFrances();
                break;
            
                default:
                    break;
            }
            /* if (vista.getSeleccion() == 1) {
                System.out.println("Seleccionado: ingles");
                traducirIngles();
            } else if (vista.getSeleccion()==2) {
            }  */
        });
        
    }

    /* private void traducirr(){
        String mostrar = "Opción no válida.";
        Traduccion seleccion;
        String  idioma= vista.getSeleccion();
        switch (idioma) {
            case ("Ingles"):
            seleccion = new Ingles();
            break;
            case ("Portugues"):
            seleccion = new Portugues();
            break; 
            case ("Frances"):
            seleccion = new Frances();
            break;

            default:
                break;
        } */

    /*     switch (vista.getMensaje()) {
            case "Saludar":
                mostrar= ingles.saludar();
                break;
            case "Despedirse":
                System.out.println("Pasó por la cola 2");
                mostrar= ingles.despedirse();
                break;
            case "Pedir cafe":
                mostrar = ingles.pedirCafe();
                break;
            case "Cuanto cuesta":
                mostrar = ingles.cuantoCuesta();
                break;
            case "Donde queda":
            mostrar= ingles.dondeQueda();
            break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        vista.label(mostrar);
    } */

    private void traducirIngles(){
        String mostrar = "Opción no válida.";
        switch (vista.getMensaje()) {
            case "Saludar":
                mostrar= ingles.saludar();
                break;
            case "Despedirse":
                //System.out.println("Pasó por la cola 2");
                mostrar= ingles.despedirse();
                break;
            case "Pedir cafe":
                mostrar = ingles.pedirCafe();
                break;
            case "Cuanto cuesta":
                mostrar = ingles.cuantoCuesta();
                break;
            case "Donde queda":
            mostrar= ingles.dondeQueda();
            break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        vista.label(mostrar);
    }

    private void traducirPortugues(){
        String mostrar = "Opción no válida.";
        switch (vista.getMensaje()) {
            case "Saludar":
                mostrar= portugues.saludar();
                break;
            case "Despedirse":
                System.out.println("Pasó por la cola 2");
                mostrar= portugues.despedirse();
                break;
            case "Pedir cafe":
                mostrar = portugues.pedirCafe();
                break;
            case "Cuanto cuesta":
                mostrar = portugues.cuantoCuesta();
                break;
            case "Donde queda":
            mostrar= portugues.dondeQueda();
            break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        vista.label(mostrar);
    }

    private void traducirFrances(){
        String mostrar = "Opción no válida.";
        switch (vista.getMensaje()) {
            case "Saludar":
                mostrar= frances.saludar();
                break;
            case "Despedirse":
                System.out.println("Pasó por la cola 2");
                mostrar= frances.despedirse();
                break;
            case "Pedir cafe":
                mostrar = frances.pedirCafe();
                break;
            case "Cuanto cuesta":
                mostrar = frances.cuantoCuesta();
                break;
            case "Donde queda":
            mostrar= frances.dondeQueda();
            break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        vista.label(mostrar);
    }

}

