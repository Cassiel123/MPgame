import java.util.Scanner;

public class LoginController extends SessionController{
    private SessionController sessionController;
    public LoginController(SessionController sessionController) {
        this.setSessionController(sessionController);
        this.accessValidatedOrDenied();
    }
    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }
    public boolean accessValidatedOrDenied(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de Inicio de sesion");
        System.out.println("Primero introduzca su nick y valide con enter");
        String nick = scanner.nextLine();
        System.out.println("A continuacion escriba su contraseña y valide con enter");
        String contraseña = scanner.nextLine();
        if(this.getSessionController().getNickNameToPassword().containsKey(nick)){

            return true;
        }
        return false;
    }
}
