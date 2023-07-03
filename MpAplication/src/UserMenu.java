public class UserMenu extends AbstractMenu{
    @Override
    public void start() {

    }

    @Override
    public void presentarMenu() {
        System.out.println("Opcion 1: Registrar personaje ");
        System.out.println("Opcion 2: Dar de baja personaje ");
        System.out.println("Opcion 3: Elegir armas ");
        System.out.println("Opcion 4: Elegir armaduras");
        System.out.println("Opcion 5: Desafiar a otro usuario");
        System.out.println("Opcion 6: Consultar historial de oro");
        System.out.println("Opcion 7: Consultar ranking global");
        System.out.println("Opcion 8: Salir del sistema");
        System.out.println("Opcion 9: Darse de baja");

    }

    @Override
    public void realizarOpcion(int op) {
    }
}
