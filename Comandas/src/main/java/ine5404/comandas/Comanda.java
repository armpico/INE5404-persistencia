/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author martin
 */
public class Comanda implements Serializable {
    protected Cliente cliente;
    protected LinkedList<Pedido> pedidos;
    //faca uma lista de pedidos

    public Comanda(Cliente cliente) {
        this.cliente = cliente;
        pedidos = new LinkedList<>();
    }
    
    public void addPedido(Pedido pedido){
        //implementar
        pedidos.add(pedido);
    }
    
    public double getTotal(){
        double total = 0;
        for(Pedido p: pedidos){
            total += p.getValor();
        }      
        return total;
    }
}
