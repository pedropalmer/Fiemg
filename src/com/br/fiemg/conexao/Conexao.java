
package com.br.fiemg.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection conectar() throws SQLException {
        
        Connection con = null;
        
        final String URL = "jdbc:mysql://localhost:3306/fiemg?useTimezone=true&serverTimezone=UTC";
        final String USER = "root";
        final String PASS = "1234";
        
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexão estabelecida!");
            return con;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public static void desconectar (Connection con){
        try {
            con.close();                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:"+e);
        }
    }    
}
