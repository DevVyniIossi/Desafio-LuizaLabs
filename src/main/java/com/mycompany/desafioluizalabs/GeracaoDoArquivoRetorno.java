/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioluizalabs;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dev.VyniIossi
 */
public class GeracaoDoArquivoRetorno {
    
    public void GravarArquivoJson(String caminhoParaSalvarOArquivo, RetornoDaLeituraDoArquivo retornoDaLeituraDoArquivo)
    {
        try 
        {
            Gson gson = new Gson();
            String json = gson.toJson(retornoDaLeituraDoArquivo);

            FileWriter myWriter = new FileWriter(caminhoParaSalvarOArquivo);
            myWriter.write(json);
            myWriter.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportacaoDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportacaoDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
