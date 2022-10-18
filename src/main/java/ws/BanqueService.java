package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.Collections;
import java.util.Date;
import java.util.List;

//un POJO plain old java object : simple classe java sans exigences
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 10.6;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) { //par def args0
        return new Compte(code,Math.random()*9800,new Date());
    }

    @WebMethod
    public List<Compte> getList(){
        return List.of(
                new Compte(1,Math.random()*9800,new Date()),
                new Compte(2,Math.random()*9800,new Date()),
                new Compte(3,Math.random()*9800,new Date())
        );
    }
}
