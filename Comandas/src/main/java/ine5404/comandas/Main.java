/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.IOException;

/**
 *
 * @author 17100508
 */
public class Main {
    public static void main(String args[]) throws IOException{
        String arqName = "pers.bin";
        
        GerenciadorDeUsuarios genUsr = new GerenciadorDeUsuarios();
        genUsr.addLoginSenha("Geraldo", "123");
        genUsr.addLoginSenha("Baltha", "abc");
        
        Persistencia<GerenciadorDeUsuarios> pers = new Persistencia<>();
        pers.gravar(genUsr, arqName);
        
        System.out.println(genUsr.autenticar("Geraldo", "123"));
    }
}
