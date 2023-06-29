public class LoginController extends SessionController{
    private SessionController sessionController;
    public LoginController(SessionController sessionController) {

    }
    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }
}
