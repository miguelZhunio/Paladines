package paladines.clases;

/**
 *
 * @author Zhunio Miguel
 */
public final class Administrador {
    private final String name = "admin";
    private final String password = "1234567890";

    public Administrador() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Administrador{" + "name=" + name + ", password=" + password + '}';
    }
    
    
}
