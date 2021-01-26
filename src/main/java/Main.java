import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Conn conn = new Conn();

        try (Connection cnx = conn.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
