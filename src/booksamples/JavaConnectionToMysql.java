package booksamples;

import java.sql.Connection;
import java.sql.DriverManager;
// connection to mysql workbench through netbeans;
class JavaConnectioToMysql {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","yourpassword");
            if (conn!=null) {
                System.out.println("Connection successfull");
            }
        } catch (Exception e) {
            System.out.println("Connection false to database");

        }
    }

}