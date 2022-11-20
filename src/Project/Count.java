/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

/**
 *
 * @author Sharia
 */
public class Count {

    public static String countrows() {
        Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = null;

        ResultSet rs = null;
        try {
            Statement s = conn.createStatement();

            ps = conn.prepareStatement("select count(PatientID) from DATA");

            rs = ps.executeQuery();
            
            int size = rs.getInt(1);
            System.out.println(size);
            int vacant = 100 - size;
            String x;
            x = Integer.toString(vacant);
            return x;

        } catch (Exception e) {
            return null;
        } finally {
            try {
                conn.close();
                rs.close();
                ps.close();

            } catch (Exception e) {
            }
        }
    }
    public static int countnullrows() {
        Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = null;

        ResultSet rs = null;
        try {
            Statement s = conn.createStatement();

            ps = conn.prepareStatement("select count(PatientID) from DATA where (PatientID = 'Released')");

            rs = ps.executeQuery();
            
            int size = rs.getInt(1);
            System.out.println(size);
            int countrows =  size;
 
            return countrows;

        } catch (Exception e) {
            return 0;
        } finally {
            try {
                conn.close();
                rs.close();
                ps.close();

            } catch (Exception e) {
            }
        }
    }
}