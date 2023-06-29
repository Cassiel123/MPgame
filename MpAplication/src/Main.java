public class Main {
    public static void main(String[] args) {
     UserController usercontroller = UserController.getInstance();
     usercontroller.getSessionController().DoOperation();
     usercontroller.setCurrentUser(usercontroller.getSessionController().getCurrentUser());
     usercontroller.startMenu(usercontroller.getCurrentUser());

    }
}