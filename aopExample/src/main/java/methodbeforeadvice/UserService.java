package methodbeforeadvice;

public interface UserService {
    public abstract void login(String name, String passwd);

    public abstract void logout();
}
