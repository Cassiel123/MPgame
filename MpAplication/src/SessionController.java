import java.util.HashMap;
import java.util.Scanner;

public class SessionController {
    private HashMap<String,String> nickNameToPassword;
    private User currentUser;

    public SessionController() {
        HashMap<String,String> map = new HashMap<>();
        this.setNickNameToPassword(map);
    }

    public void DoOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pulse 1 para iniciar sesion");
        System.out.println("Pulse 2 para registrarse como nuevo usuario");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                LoginController loginController = new LoginController(this);
                this.setCurrentUser(loginController.getCurrentUser());
                break;
            case 2:
                NewUserController newUserController = new NewUserController(this);
                this.setCurrentUser(newUserController.getCurrentUser());
                break;
        }
    }

    public HashMap<String, String> getNickNameToPassword() {
        return nickNameToPassword;
    }

    public void setNickNameToPassword(HashMap<String, String> nickNameToPassword) {
        this.nickNameToPassword = nickNameToPassword;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
