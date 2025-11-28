/*
 * Client.java
 *
 * Created on 21 octobre 2005, 12:00
 *
*/
package bean;

import accesBase.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/*********  Classe Catalogue  *********************/

public class ListeVille {
	
    private Vector villes=new Vector();
    
    public void lire()  throws Exception {
         VilleBdd.lire(this);
     }
    
    public void ajouter(Ville v){
        villes.add(v);
    } 
     
     public Vector getVilles(){
        return villes;
    }
     
     public void setVilles(Vector vec){
        villes=vec;
     }
  }
