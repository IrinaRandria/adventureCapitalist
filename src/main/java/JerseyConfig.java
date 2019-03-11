
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irandria
 */
@Component
@ApplicationPath("/adventureisis") //quel chemin

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(Webservices.class);
    }
}
