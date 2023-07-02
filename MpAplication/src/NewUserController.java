import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class NewUserController extends SessionController{
    private SessionController sessionController;
    public NewUserController(SessionController sessionController) throws IOException {
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
                this.serializeUser(userOperator);
                super.getNickNameToPassword().put(nombre,nick);
                this.getSessionController().getNickNameToPassword().put(nick,contraseña);
                this.setCurrentUser(userOperator);
                break;
            case 2:
                UserPlayer userPlayer = new UserPlayer(nombre,nick,contraseña);
                this.serializeUser(userPlayer);
                this.getSessionController().getNickNameToPassword().put(nick,contraseña);
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

    public void serializeUser(User user) throws FileNotFoundException, IOException {

        String fichero = user.getNick()+".dat";
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero));
        salida.writeObject(user);
        salida.close();

    }
}
