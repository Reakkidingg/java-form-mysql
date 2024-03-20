/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Reakkidingg_
 */
public class MyData {
    private static Connection dataCon;
    
    public static void connectionDB(String ip, String dbName, String user, String pass) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        dataCon=DriverManager.getConnection("jdbc:mysql://"+ip+"/"+dbName+"?allowPublicKeyRetrieval=true&verifyServerCertificate=true&useSSL=false",user,pass);
    }

    /**
     * @return the dataCon
     */
    public static Connection getDataCon() {
        return dataCon;
    }

    /**
     * @param aDataCon the dataCon to set
     */
    public static void setDataCon(Connection aDataCon) {
        dataCon = aDataCon;
    }
    
}
