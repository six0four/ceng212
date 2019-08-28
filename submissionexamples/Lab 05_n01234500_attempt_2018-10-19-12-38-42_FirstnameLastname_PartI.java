/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstnameLastname_PartI;

import java.sql.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author 
 */
public class FirstnameLastname_PartI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
		String s = null;
		Runtime rt = Runtime.getRuntime();
		try {
			Process p = rt.exec("ls");
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("exception happened - here's what I know: ");
			e.printStackTrace();
		}	
        JTextField field1 = new JTextField();
        JPasswordField field2 = new JPasswordField();
        Object[] fields = {
            "Username", field1,
            "Password", field2
        };
        JOptionPane.showConfirmDialog(null,fields,"Password Dialog",JOptionPane.OK_CANCEL_OPTION);
        String Username = field1.getText();
        String Password = String.valueOf(field2.getPassword());

        Connection conn;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@apollo.humber.ca:1521:msit",Username, Password);
        Statement stmt;
        stmt = conn.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("SELECT * FROM medri.people");
        while (rs.next()) {
            System.out.print(rs.getString("firstname")+"\n");
        }//close while
    }
}