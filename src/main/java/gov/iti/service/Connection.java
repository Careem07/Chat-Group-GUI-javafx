package gov.iti.service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Connection {

    Registry reg;
    ChatServerInt serverRef;

    private Connection () {
        try {
            reg = LocateRegistry.getRegistry();
            serverRef =(ChatServerInt) reg.lookup("ChatService"); 
            //ClientInt clientRef = (ClientInt) reg.lookup("STYLESHEET_CASPIAN");
            
            } catch(Exception ex) { 
                ex.printStackTrace();
            }
    }

    private static Connection instance = new Connection();

    public static Connection getInstance() {
        return instance;
    }
    
    public ChatServerInt getServerRef() {
        return serverRef;
    }
}
