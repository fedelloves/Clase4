
package com.mycompany.clase4;

import com.mycompany.clase4.model.Client;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("clients")
public class ClientResource {
    
    @GET
    @Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Client> getClients(){
        
        List<Client> clients = new ArrayList<>();
        
        Client c1 = new Client();
        Client c2 = new Client();
        
        c1.setName("Juan");
        c1.setLastName("Perez");
        c1.setAge(25);
        
        c2.setName("Alberto");
        c2.setLastName("Gomez");
        c2.setAge(50);
        
        clients.add(c1);
        clients.add(c2);
        
        return clients;
    }
}
