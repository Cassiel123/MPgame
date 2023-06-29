public class UserController {
    private static UserController instance;
    private SessionController sessionController;
    private User currentUser;

    // Constructor privado para evitar instancias directas
    private UserController() {
        this.setSessionController(sessionController = new SessionController());
    }

    // Método estático para obtener la instancia única del UserController
    public static UserController getInstance() {
        if (instance == null) {
            synchronized (UserController.class) {
                if (instance == null) {
                    instance = new UserController();
                }
            }
        }
        return instance;
    }
    public void startMenu(User user){
        this.setCurrentUser(this.getSessionController().getCurrentUser());
        if (user instanceof UserOperator) {

            }else if (user instanceof UserPlayer){
            System.out.println("te muestro menu jugador");
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
}
