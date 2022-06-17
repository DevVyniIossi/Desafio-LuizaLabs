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
public class Pedido {
    
    private int NumeroDoPedido;
    private Double ValorTotalPedido;
    private Date DataDoPedido;
    private  List<ItemPedido> ItensPedido;

    
    public Pedido(int NumeroDoPedido, Date DataDoPedido) {
        this.NumeroDoPedido = NumeroDoPedido;
        this.DataDoPedido = DataDoPedido;
        this.ItensPedido = new ArrayList<>();
    }
    
    public void AdicionarItemPedido(ItemPedido itemPedido){
        this.ItensPedido.add(itemPedido);
    }

    public void CalcularValorTotal(){
        Double ValorTotal = 0.0;
        
        for(ItemPedido item : this.ItensPedido){
            ValorTotal += item.getValorDoProduto();
        }
        
        this.setValorTotalPedido(ValorTotal);
    }
    
    public void setNumeroDoPedido(int NumeroDoPedido) {
        this.NumeroDoPedido = NumeroDoPedido;
    }

    public void setValorTotalPedido(Double ValorTotalPedido) {
        this.ValorTotalPedido = ValorTotalPedido;
    }

    public void setDataDoPedido(Date DataDoPedido) {
        this.DataDoPedido = DataDoPedido;
    }

    public int getNumeroDoPedido() {
        return NumeroDoPedido;
    }

    public Double getValorTotalPedido() {
        return ValorTotalPedido;
    }

    public Date getDataDoPedido() {
        return DataDoPedido;
    }
    
    public List<ItemPedido> getItensPedido() {
        return ItensPedido;
    }

    
}
