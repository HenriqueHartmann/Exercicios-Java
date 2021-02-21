public class Main {

    public static void main(String[] args) {
        Database db1;
        db1 = Database.getInstance();
        db1.getConnection("admin", "admin");
        db1.getConnection("postgres", "admin");
        db1.getConnection("admin", "postgres");
        db1.getConnection("postgres", "postgres");
    }
}
