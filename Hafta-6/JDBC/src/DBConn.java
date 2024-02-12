import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            PreparedStatement pr = connect.prepareStatement("INSERT INTO employees(name,position,salary) VALUES (?,?,?)");

            pr.setString(1,"Joe");
            pr.setString(2,"Intern");
            pr.setInt(3,1000);
            pr.executeUpdate();

            pr.setString(1,"John");
            pr.setString(2,"Jr.Dev");
            pr.setInt(3,3000);
            pr.executeUpdate();

            pr.setString(1,"Tom");
            pr.setString(2,"Mid.Dev");
            pr.setInt(3,5000);
            pr.executeUpdate();

            pr.setString(1,"Alex");
            pr.setString(2,"Senior Dev.");
            pr.setInt(3,7000);
            pr.executeUpdate();

            pr.setString(1,"Jesus");
            pr.setString(2,"Team Lead");
            pr.setInt(3,10000);
            pr.executeUpdate();

            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            System.out.println("Çalışan Listesi : ");
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("Position : " + resultSet.getString("position"));
                System.out.println("Salary : " + resultSet.getInt("salary"));
                System.out.println("----------------------------------");
            }

            pr.close();
            st.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}