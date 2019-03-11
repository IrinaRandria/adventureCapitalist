
import generated.World;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irandria
 */
  
public class Services {
    
    public World readWorldFromXml(){
        //lire le fichier XML conçu dans la section précédente et le retourner sous la forme d’un objet Java de type World
        //tp Jaxb changer en fichier xml
//pointeur
        InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");
        return null;
    }
    
    public void saveWordlToXml(World world) {
        //réaliser l’opération symétrique
        OutputStream output = new FileOutputStream(file);  //mon nom ou world
        
    }
    
}