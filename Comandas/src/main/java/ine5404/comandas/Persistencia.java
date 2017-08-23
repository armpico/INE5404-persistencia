/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author martin
 */
public class Persistencia<E> {
    //implemente uma classe para gravar e recuperar uma Comanda e um GerenciadorDeUsuarios
    public void gravar (E obj, String arqName) throws FileNotFoundException, IOException{
        FileOutputStream arquivo = new FileOutputStream(arqName);
        ObjectOutputStream saida = new ObjectOutputStream(arquivo);
        saida.writeObject(obj);
        saida.close();
    }
    
    public E ler(String arqName) throws IOException, ClassNotFoundException{
        FileInputStream arquivo = new FileInputStream(arqName);
        ObjectInputStream entrada = new ObjectInputStream(arquivo);
        E obj = (E) entrada.readObject();
        entrada.close();
        
        return obj;
    }
}
