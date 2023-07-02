import java.io.*;

public class UserController {
    private static UserController instance;
    private SessionController sessionController;
    private User currentUser;

    // Constructor privado para evitar instancias directas
    private UserController()  {

        try {
            deserializeSessionController();
        }
        catch(FileNotFoundException e){
            SessionController sessionController = new SessionController();
            this.setSessionController(sessionController);
            try {
                serializeSessionController(this.getSessionController());
            } catch (IOException ex) {}

        } catch (IOException e) {
            SessionController sessionController = new SessionController();
            this.setSessionController(sessionController);
            try {
                serializeSessionController(this.getSessionController());
            } catch (IOException ex) {}
        } catch (ClassNotFoundException e) {
            SessionController sessionController = new SessionController();
            this.setSessionController(sessionController);
            try {
                serializeSessionController(this.getSessionController());
            } catch (IOException ex) {}
        }


    }

    // Método estático para obtener la instancia única del UserController
    public static UserController getInstance() throws IOException {
        if (instance == null) {

            instance = new UserController();

        }
        return instance;
    }
    public void startMenu(User user){
        this.setCurrentUser(this.getSessionController().getCurrentUser());
        if (user instanceof UserOperator) {
            OperatorMenu operatorMenu = new OperatorMenu();
            operatorMenu.start();
            }else if (user instanceof UserPlayer){
            UserMenu userMenu = new UserMenu();
            userMenu.start();
            }
    }


    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public void serializeSessionController(SessionController sessionController) throws FileNotFoundException, IOException {

        String fichero = "SessionController.dat";
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero));
        salida.writeObject(sessionController);
        salida.close();

    }

    public void deserializeSessionController() throws FileNotFoundException,IOException, ClassNotFoundException{

        String fichero = System.getProperty("user.dir")+"\\SessionController.dat";
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fichero));
        SessionController sessionController = (SessionController) entrada.readObject();
        this.setSessionController(sessionController);
        entrada.close();

    }
}
