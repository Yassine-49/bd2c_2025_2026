
/*
 * ArticleBdd.java
 *
 * Created on 12 septembre 2006, 16:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package accesBase;
import bean.*;

/**
 *
 * @author fayolle
 */
public class VilleBdd {
    
     //*********  Lecture de tous les articles du catalogue *********************
  
      public static void lire(ListeVille villes) throws Exception
    {
        //Lecture des articles
         java.sql.Connection con;
        con=Connexion.ouvrirCon();
        
	//execution d'une requete select
	java.sql.PreparedStatement comm=con.prepareStatement("Select * from ville where nbrhab > 500000 order by nbrhab desc");
			
	java.sql.ResultSet rs=comm.executeQuery();
        
       //balayage du ResultSet
	while (rs.next())
        {
               Ville v=new Ville();
               //Attention !! il faut mettre les colonnes dans le bon ordre!!!!!
               v.setNom(rs.getString("nom"));   
               v.setNbrhab(rs.getString("nbrhab")); 
             //ajouter à la collection
               villes.ajouter(v);
         }
	
        //fermeture de la commande
	comm.close();        
        //fermer la connection
        con.close();
    }         
}
