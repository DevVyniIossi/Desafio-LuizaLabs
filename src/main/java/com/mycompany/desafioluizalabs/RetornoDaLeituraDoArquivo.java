/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioluizalabs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dev.VyniIossi
 */
public class RetornoDaLeituraDoArquivo {
    
    
    private List<PedidoUsuario> PedidosDosUsuario;

    public RetornoDaLeituraDoArquivo() {
        this.PedidosDosUsuario = new ArrayList<>();
    }
    
    public PedidoUsuario ObterPelaIdentificacaoDoUsuario(int identificacaoUsuario, String nomeDoUsuario) 
    {
        PedidoUsuario pedidoDoUsuario = this.PedidosDosUsuario.stream().filter(x -> x.getIdentificacaoUsuario() == identificacaoUsuario).findFirst().orElse(null);   
            
            if (pedidoDoUsuario == null){
                pedidoDoUsuario = new PedidoUsuario(identificacaoUsuario, nomeDoUsuario);
                this.PedidosDosUsuario.add(pedidoDoUsuario);
            }
        
        
        return pedidoDoUsuario;
    } 
    
}


