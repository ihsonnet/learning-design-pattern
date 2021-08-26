public class AdminManager {
    public static void main(String[] args) {
        SingletonSuperAdmin sa1 = SingletonSuperAdmin.getInstance();
        SingletonSuperAdmin sa2 = SingletonSuperAdmin.getInstance();

        System.out.println("Super Admin 1 Login Attempt:");
        sa1.login("sa" , "nz201" );

        System.out.println("\n");

        System.out.println("Super Admin 2 Login Attempt:");
        sa2.login("sa" , "p@ssw0rd" );

    }
}