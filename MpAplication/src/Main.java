public class Main {
    public static void main(String[] args) {
     UserController usercontroller = loginOrSinging();
     usercontroller.getSessionController().DoOperation();
     usercontroller.setCurrentUser(usercontroller.getSessionController().getCurrentUser());
     usercontroller.startMenu(usercontroller.getCurrentUser());

    }
    public static UserController loginOrSinging (){

       return  UserController.getInstance();

    }
}