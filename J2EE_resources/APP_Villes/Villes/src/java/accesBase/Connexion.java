/*
 * InterfaceBdd.java
 *
 * Created on 25 octobre 2005, 11:08
 *
 * Classe contenant toutes les méthodes d'accès à la base de données
 */
package accesBase;
import bean.*;

/**
 *
 * @author fayolle
 */
public class Connexion {
    
 /*********  Connexion      ****************************/
    public static java.sql.Connection ouvrirCon() throws Exception
    {
        // définir le pilote ODBC
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        
        
        //définir la connection
        java.sql.Connection con;
        con=java.sql.DriverManager.getConnection("jdbc:odbc:mfville","visiteur","visiteur");
        return con;   
    }
}
