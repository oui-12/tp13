/**
 * Configuration CXF pour la publication du service web SOAP
 */
package com.example.demo.tp13.config;

import com.example.demo.tp13.ws.CompteSoapService;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration Spring pour Apache CXF.
 * Cette classe configure le point de terminaison SOAP du service CompteSoapService.
 */
@Configuration // Annotation de classe de configuration Spring
@AllArgsConstructor // Lombok: génère un constructeur avec tous les champs
public class CxfConfig {

    private CompteSoapService compteSoapService; // Service SOAP injecté
    private Bus bus; // Bus CXF injecté

    /**
     * Crée et configure le point de terminaison SOAP
     * @return Endpoint configuré et publié
     */
    @Bean // Définit un bean Spring
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, compteSoapService);
        endpoint.publish("/ws"); // Publie le service sur /ws
        return endpoint;
    }
}
