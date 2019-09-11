/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_rmi_anillo;

import broadcast.BCAST;
import broadcast.RegistroMaquina;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.Registry;
import token.AdministradorToken;

/**
 *
 * @author julio
 */
public class Main {

   
    public static void main(String[] args) throws Exception {
        boolean cliente = true;
        //AdministradorTokenImpl adm = new AdministradorTokenImpl();

        BCAST bcast1 = null;
        BCAST bcast2 = null;
        
         try {
            bcast1 = new BCAST(
                    !cliente,   //true:  como cliente  false: como server
                    true        //permanecer buscando    
            );
            
            bcast2 = new BCAST(
                    cliente, //true:  como cliente  false: como server
                    true //permanecer buscando    
            );
            

        } catch (Exception ex) {
        }
        
        
        

        
       
    }

}
