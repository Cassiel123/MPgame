import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
     UserController usercontroller = UserController.getInstance();
     usercontroller.getSessionController().DoOperation();
     usercontroller.serializeSessionController(usercontroller.getSessionController());
     usercontroller.setCurrentUser(usercontroller.getSessionController().getCurrentUser());
     usercontroller.startMenu(usercontroller.getCurrentUser());

    }
}