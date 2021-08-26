public class SingletonSuperAdmin {
    private final String name="Super Admin";
    private final String username="sa";
    private final String password="p@ssw0rd";

    private SingletonSuperAdmin(){
        System.out.println("Create New Instance!");
    }

    public static SingletonSuperAdmin superAdmin = null;

    public static SingletonSuperAdmin getInstance(){
        if(superAdmin == null){
            superAdmin = new SingletonSuperAdmin();
        }
        return superAdmin;
    }

    public void login(String username, String password){
        assert this.username == username && this.password == password : "Something wrong";
        if (this.username == username && this.password == password){
            System.out.println("Login Successful!");
        }
        else {
            System.out.println("You entered wrong credentials!");
        }
    }
}

