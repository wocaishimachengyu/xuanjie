package service;
import javax.jws.WebService;  

@WebService(endpointInterface="service.IHelloWorld")  
public class HelloWorldImpl implements IHelloWorld {  
    public String sayHello(String text) {     
        return "Hello" + text ;  
    }  
}  
