/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nekojarashi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author y-okubo
 */
public class HelloRMIClient {

    /**
     * @param args the command line arguments
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
//        for (String c:Naming.list("")) {
//            System.out.println(c);
//        }
        
        Hello hello = (Hello) Naming.lookup("hello");
        System.out.println(hello.sayHello());
    }
    
}
