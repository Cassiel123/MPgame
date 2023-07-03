import java.util.Scanner;

public class UserMenu extends AbstractMenu{
    @Override
    public void start(User user) {
        this.setUser(user);
        this.presentarMenu();
    }

    @Override
    public void presentarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opcion 1: Registrar personaje ");
        System.out.println("Opcion 2: Dar de baja personaje ");
        System.out.println("Opcion 3: Elegir armas ");
        System.out.println("Opcion 4: Elegir armaduras");
        System.out.println("Opcion 5: Desafiar a otro usuario");
        System.out.println("Opcion 6: Consultar historial de oro");
        System.out.println("Opcion 7: Consultar ranking global");
        System.out.println("Opcion 8: Salir del sistema");
        System.out.println("Opcion 9: Darse de baja");
        int opcion = scanner.nextInt();
        this.realizarOpcion(opcion);

    }

    @Override
    public void realizarOpcion(int op) {
        switch (op) {
            case 1:{
                OptionRegisterCharacter optionRegisterCharacter = new OptionRegisterCharacter();
                optionRegisterCharacter.start();
            }
            case 2:{
                OptionDeleteCharacter optionDeleteCharacter = new OptionDeleteCharacter();
                optionDeleteCharacter.start();
            }
            case 3:{
                OptionChoseWeapon optionChoseWeapon = new OptionChoseWeapon();
                optionChoseWeapon.start();
            }
            case 4:{
                OptionChooseArmor optionChooseArmor = new OptionChooseArmor();
                optionChooseArmor.start();
            }
            case 5:{
                OptionChallenge optionChallenge = new OptionChallenge();
                optionChallenge.start();

            }
            case 6:{
                OptionHistoyGold optionHistoyGold = new OptionHistoyGold();
                optionHistoyGold.start();
            }
            case 7:{
                OptionSeeRank optionSeeRank = new OptionSeeRank();
                optionSeeRank.start();
            }
            case 8:{
                OptionLogOut optionLogOut = new OptionLogOut();
                optionLogOut.start();
            }
            case 9:{
                OptionDeleteUser optionDeleteUser = new OptionDeleteUser();
                optionDeleteUser.start();
            }
        }
    }
}
