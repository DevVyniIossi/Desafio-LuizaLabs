/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioluizalabs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dev.VyniIossi
 */
public class PedidoUsuario {
   private int IdentificacaoUsuario;
   private String NomeDoUsuario;
   private List<Pedido> Pedidos;

    public PedidoUsuario(int IdentificacaoUsuario, String NomeDoUsuario) {
        this.IdentificacaoUsuario = IdentificacaoUsuario;
        this.NomeDoUsuario = NomeDoUsuario;
        this.Pedidos = new ArrayList<>();
    }
    
    public Pedido ObterPedidoPeloNumero(int numeroDoPedido, Date dataDoPedido){
        Pedido pedido = this.Pedidos.stream().filter(x -> x.getNumeroDoPedido() == numeroDoPedido).findFirst().orElse(null);

        if (pedido == null){
            pedido = new Pedido(numeroDoPedido,dataDoPedido);
            this.Pedidos.add(pedido);
        }
        
        return pedido;
        
    }

    public void setIdentificacaoUsuario(int IdentificacaoUsuario) {
        this.IdentificacaoUsuario = IdentificacaoUsuario;
    }

    public void setNomeDoUsuario(String NomeDoUsuario) {
        this.NomeDoUsuario = NomeDoUsuario;
    }

    public int getIdentificacaoUsuario() {
        return IdentificacaoUsuario;
    }

    public String getNomeDoUsuario() {
        return NomeDoUsuario;
    }
}
