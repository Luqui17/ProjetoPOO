
package Oficina.Context;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
  
  public Connection GetConnection(){
    Connection conn = null;
    
    //Carregar o driver do mysql
    try{
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException ex){
      ex.printStackTrace();
    }
    
    //Criando conexão
    try{
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc?useSSL=false", "root", "123456789");
    }catch(SQLException ex){
      ex.printStackTrace();
    }
    return conn;
  }
}
