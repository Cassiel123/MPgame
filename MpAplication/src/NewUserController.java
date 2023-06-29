import java.util.Scanner;

public class NewUserController extends SessionController{
    private SessionController sessionController;
    public NewUserController(SessionController sessionController) {
        this.setSessionController(sessionController);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de registro");
        System.out.println("Primero introduzca su nombre y valide con enter");
        String nombre = scanner.nextLine();
        System.out.println("A continuacion escriba su nick y valide con enter");
        String nick = scanner.nextLine();
        System.out.println("A continuacion escriba su contraseña y valide con enter");
        String contraseña = scanner.nextLine();
        System.out.println("Pulse 1 si es un operador, pulse 2 si es un jugador");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                UserOperator userOperator = new UserOperator(nombre,nick,contraseña);
                super.getNickNameToPassword().put(nombre,nick);
                this.getSessionController().getNickNameToPassword().put(nombre,nick);
                this.setCurrentUser(userOperator);
                break;
            case 2:
                UserPlayer userPlayer = new UserPlayer(nombre,nick,contraseña);
                this.getSessionController().getNickNameToPassword().put(nombre,nick);
                this.setCurrentUser(userPlayer);
                break;
        }
    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }
}
