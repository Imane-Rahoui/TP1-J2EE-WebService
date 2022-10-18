package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJAXWS {
    public static void main(String[] args) {
        String url="http://localhost:8084/";
        Endpoint.publish(url,new BanqueService());
        //Endpoint.publish("http://0.0.0.0:8084/",new BanqueService()); //tt les interfaces réseaux
        System.out.println("deployed succesfully");
        // http://localhost:8084/?wsdl
        // <portType> <operation>
        // http://localhost:8084/?xsd=1 xml schema
    }
}
