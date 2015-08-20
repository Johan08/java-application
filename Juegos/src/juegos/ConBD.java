/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package juegos;

import java.sql.*;
import javax.swing.JOptionPane;

class ConBD {
    static String myUrl="jdbc:oracle:thin:@localhost:1521:xe";
    static String myUsuario="system";
    static String myPwd="root";//pongo la clave de mi oracle (root en mi note por ejemplo)
    public static void conectar() throws Exception {
        Connection conn= null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            conn= DriverManager.getConnection(myUrl,myUsuario,myPwd);
            if(conn != null){
                System.out.print("Conexión a base de datos "+myUrl+"...OK!! :-)");
                JOptionPane.showMessageDialog(null,"Conexión a base de datos OK","1UP",1);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Conexión a base de datos no realizada","Game Over",1);
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//fin conectar
    static void verTodos() {
        try {
            Connection conn =null;
            ResultSet resultado= null;
            Statement sentencia;
            conn = DriverManager.getConnection(myUrl, myUsuario, myPwd);
            sentencia=conn.createStatement(resultado.TYPE_SCROLL_INSENSITIVE,resultado.CONCUR_UPDATABLE);
            resultado=sentencia.executeQuery("SELECT NOMBRE,DESARROLLADOR,LANZAMIENTO,PLATAFORMA,CONTROLES FROM JUEGOS ORDER BY 1");
            boolean existe=resultado.first();
            if (existe)
                    JuegoMain.muestraTodos(resultado);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"No hay datos en la tabla","Game Over",1);
        }
    }//fin vertodos
    static void agregaDatos(String n,String d,String l,String p,String c) {
        Connection conn =null;
        Statement sentencia;
        try {
            String sqlStmt="INSERT INTO JUEGOS VALUES((SELECT MAX(ID)+1 FROM JUEGOS),'"+n+"','"+d+"','"+l+"','"+p+"','"+c+"')";
            System.out.println(sqlStmt);
            conn = DriverManager.getConnection(myUrl, myUsuario, myPwd);
            sentencia=conn.createStatement();
            sentencia.executeUpdate(sqlStmt);
            JOptionPane.showMessageDialog(null,"Registro agregado exitosamente","Level UP",1);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR!!!!","Game Over",1);
        }
        verTodos();
    }//fin agregadatos
    static void modificaDatos(String a, String m, Object valueAt, Object ValueAt) {
        Connection conn =null;
        Statement sentencia;
        try {
            String sqlStmt="UPDATE JUEGOS SET "+a+"='"+m+"' WHERE NOMBRE='"+valueAt+"' AND DESARROLLADOR='"+ValueAt+"'";
            System.out.println(sqlStmt);
            conn = DriverManager.getConnection(myUrl, myUsuario, myPwd);
            sentencia=conn.createStatement();
            sentencia.executeUpdate(sqlStmt);
            JOptionPane.showMessageDialog(null,"Registro modificado exitosamente","Level UP",1);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR!!! (nombre y desarrollador no pueden quedar vacios)","Game Over",1);
        }
        verTodos();
    }//fin modificadatos
    static void eliminaDatos(Object valueAt, Object ValueAt){
        Connection conn =null;
        Statement sentencia;
        try {
            String sqlStmt="DELETE FROM JUEGOS WHERE NOMBRE='"+valueAt+"' AND DESARROLLADOR='"+ValueAt+"'";
            System.out.println(sqlStmt);
            conn = DriverManager.getConnection(myUrl, myUsuario, myPwd);
            sentencia=conn.createStatement();
            sentencia.executeUpdate(sqlStmt);
            JOptionPane.showMessageDialog(null,"Registro eliminado exitosamente","K.O.",1);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR!!!!","Game Over",1);
        }
        verTodos();
    }//fin eliminadatos
        
}//fin clase
