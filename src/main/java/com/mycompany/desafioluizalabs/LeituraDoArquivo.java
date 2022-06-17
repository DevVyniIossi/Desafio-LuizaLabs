/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioluizalabs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dev.VyniIossi
 */
public class LeituraDoArquivo {
    
    private String caminhoDoArquivoParaLeitura;

    public LeituraDoArquivo(String caminhoDoArquivoParaLeitura) {
        this.caminhoDoArquivoParaLeitura = caminhoDoArquivoParaLeitura;
    }
    
    public RetornoDaLeituraDoArquivo LerArquivo() {
        
        try{
             FileInputStream stream = new FileInputStream(caminhoDoArquivoParaLeitura); 
            
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linhaDoArquivo = br.readLine();
            
            RetornoDaLeituraDoArquivo retornoDaLeituraDoArquivo = new RetornoDaLeituraDoArquivo();
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyyMMdd");
            
            while(linhaDoArquivo != null) {
                if (linhaDoArquivo != null)
                {
                    //Obter pedido do usuario
                    int identificacaoDoUsuario = Integer.parseInt(linhaDoArquivo.substring(0, 10));
                    String nomeDoUsuario = linhaDoArquivo.substring(10, 55).trim();
                    
                    PedidoUsuario pedidoDoUsuario = retornoDaLeituraDoArquivo.ObterPelaIdentificacaoDoUsuario(identificacaoDoUsuario, nomeDoUsuario);
                    
                    int numeroDoPedido = Integer.parseInt(linhaDoArquivo.substring(55, 66));
                    Date dataDoPedido = formatoData.parse(linhaDoArquivo.substring(87, 95));
                    
                    Pedido pedido = pedidoDoUsuario.ObterPedidoPeloNumero(numeroDoPedido, dataDoPedido);
                    
                    ItemPedido itemPedido = new ItemPedido();
                    itemPedido.setIdentificacaoDoProduto(Integer.parseInt(linhaDoArquivo.substring(66, 75)));
                    itemPedido.setValorDoProduto(Double.parseDouble(linhaDoArquivo.substring(75, 87)));
                    
                    pedido.AdicionarItemPedido(itemPedido);
                    pedido.CalcularValorTotal();
                    
                }
                
                linhaDoArquivo = br.readLine();
            }
            
            return retornoDaLeituraDoArquivo;
            
        } catch (ParseException ex){    
            Logger.getLogger(LeituraDoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeituraDoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeituraDoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
}
