/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Arthur
 */

package factory;
import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException;

public class ConnectionFactory {
     public  Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/arthurcmfatividade3?serverTimezone=UTC","root","SENHA@123");
		 }         
		 catch(SQLException xxx) {
			throw new RuntimeException(xxx);
		 }
     }
     
    
    
}
