package gov.iti.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import gov.iti.db1.mavenproject2.SenderScreenController;
import javafx.application.Platform;

public class ClientImp  extends UnicastRemoteObject implements ClientInt{

    SenderScreenController chatController;

    public ClientImp(SenderScreenController chatController) throws RemoteException {

        this.chatController=chatController;
    }

    public ClientImp() throws RemoteException {
        //super();
        //TODO Auto-generated constructor stub
    }



    @Override
    public void receive(String msg) throws RemoteException {
        // TODO Auto-generated method stub
        Platform.runLater(()->chatController.appendMsgToTextArea(msg));
        //chatController.appendMsgToTextArea(msg);
    }
    
}
