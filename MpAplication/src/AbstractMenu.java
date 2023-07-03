public abstract class AbstractMenu {
    private User user;
    public void start(User user){}
    public void presentarMenu(){}
    public void realizarOpcion(int op){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}