import java.util.Scanner;

public class OperatorMenu extends AbstractMenu{
    @Override
    public void start() {
        this.presentarMenu();
    }

    @Override
    public void presentarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opcion 1: Editar personaje ");
        System.out.println("Opcion 2: Añadir arma a personaje");
        System.out.println("Opcion 3: Añadir armadura a personaje");
        System.out.println("Opcion 4: Añadir fortalezas a personaje");
        System.out.println("Opcion 5: Añadir debilidades a personaje");
        System.out.println("Opcion 6: Añadir esbirros");
        System.out.println("Opcion 7: Validar desafios");
        System.out.println("Opcion 8: Banear usuarios");
        System.out.println("Opcion 9: Desbanear usuarios");
        System.out.println("Opcion 10: Salir del sistema");
        System.out.println("Opcion 11: Darse de baja");
        int opcion = scanner.nextInt();
        this.realizarOpcion(opcion);

    }

    @Override
    public void realizarOpcion(int op) {
        switch (op) {
            case 1:{
                OptionEditCharacter optionEditCharacter = new OptionEditCharacter();
                optionEditCharacter.start();
            }
            case 2:{
                OptionAddWeapon optionAddWeapon = new OptionAddWeapon();
                optionAddWeapon.start();
            }
            case 3:{
                OptionAddArmor optionAddArmor = new OptionAddArmor();
                optionAddArmor.start();
            }
            case 4:{
                OptionAddFortress optionAddFortress = new OptionAddFortress();
                optionAddFortress.start();
            }
            case 5:{
                OptionAddWeakness optionAddWeakness = new OptionAddWeakness();
                optionAddWeakness.start();
            }
            case 6:{
                OptionAddMiniom optionAddMiniom = new OptionAddMiniom();
                optionAddMiniom.start();
            }
            case 7:{
                OptionValidateChallenge optionValidateChallenge = new OptionValidateChallenge();
                optionValidateChallenge.start();
            }
            case 8:{
                OptionBanUser optionBanUser = new OptionBanUser();
                optionBanUser.start();
            }
            case 9:{
                OptionUnbanUser optionUnbanUser = new OptionUnbanUser();
                optionUnbanUser.start();
            }
            case 10:{
                OptionLogOut optionLogOut = new OptionLogOut();
                optionLogOut.start();
            }
            case 11:{
                OptionDeleteUser optionDeleteUser = new OptionDeleteUser();
                optionDeleteUser.start();
            }
        }
    }
}
