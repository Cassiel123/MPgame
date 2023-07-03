import java.util.Scanner;

public class OptionRegisterCharacter implements OptionInterface{
    @Override
    public void start() {
        int option = this.presentOptions();

    }
    private int presentOptions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al metodo de registro de personaje");
        System.out.println("Que tipo de personaje va a querer registrar ");
        System.out.println("Escriba y presione enter segun su eleccion");
        System.out.println("Opcion 1: Vampiro");
        System.out.println("Opcion 2: Licantropo");
        System.out.println("Opcion 3: Cazador");
        int option = scanner.nextInt();
        return option;
    }
}
