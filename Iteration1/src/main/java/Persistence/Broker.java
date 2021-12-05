/*****************************************************
Class:  Broker.java
Author: XXXX
Version: 0.1.7
Control Change:
0.1.0 Añadimos los métodos XXXX, XXXXX, XXXX
0.1.1: Corregirmos el defecto XXXX en la clase XXXX
....
0.1.7: Corregimos XXXX 


***************************************************/


package Persistence;
import java.sql.*;

public class Broker {
	static String dbURL = " ";
    static String username = "root";
    static String password = "1234";
    protected static Broker broker=null;
    protected static Connection BBDD;

    public Broker() throws Exception {
        Class.forName(" ");
        BBDD=DriverManager.getConnection(dbURL, username, password);
    }

    public static Broker getBroker() throws Exception {
        if (broker==null) {
        	broker=new Broker();
        }
        return broker;
    }

    public static int insert(String SQL) throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }

    public int update(String SQL)throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }

    public static int delete(String SQL) throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }
}
