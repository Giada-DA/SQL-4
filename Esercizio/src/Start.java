import java.sql.*;

public class Start {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/newdb", "root", "root00");
            statement = conn.createStatement();
            String query = "ALTER TABLE newdb.students ADD country VARCHAR(30);";
            statement.execute(query);
            statement.execute("UPDATE newdb.students SET country = 'Gemania' WHERE student_id = 4;");
            statement.execute("UPDATE newdb.students SET country = 'Gemania' WHERE student_id = 1;");
            statement.execute("UPDATE newdb.students SET country = 'Italia' WHERE student_id = 2 OR student_id = 3;");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
