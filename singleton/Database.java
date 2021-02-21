public class Database {
    private static Database instancia = null;

    private Database() {}

    public static Database getInstance() {
        if (instancia == null) {
            instancia = new Database();
        }

        return instancia;
    }

    public void getConnection(String user, String password) {
        String exp_user = "postgres";
        String exp_pass = "postgres";
        if (exp_user.equals(user) && exp_pass.equals(password)) {
            System.out.println("Agora você está conectado ao banco de dados.");
        }
        else {
            System.out.println("Credenciais incorretas.");
        }
    }
}
