/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nekojarashi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author y-okubo
 */
public interface Hello extends Remote {
    String sayHello() throws RemoteException;    
}
