<h1>Desafio Técnico Luiza Labs</h1>

Esse repositório tem o propósito de apresentar a solução do desafio técnico.

<h2>Objetivo</h2>

Temos uma demanda para integrar dois sistemas. O sistema legado que possui um arquivo de pedidos desnormalizado, precisamos transformá-lo em um arquivo json normalizado. E para isso precisamos satisfazer alguns requisitos.

<h2>Objetivo do desafio</h2>

Faça um sistema que receba um arquivo ou diretório e processe-os para o novo formato.

<h3>Entrada de dados</h3>
O arquivo do sistema legado possui uma estrutura em que cada linha representa uma parte de um pedido. Os dados estão padronizados por tamanho de seus valores, respeitando a seguinte tabela:

![tabela](https://user-images.githubusercontent.com/100815122/170606176-7421af5a-a5e4-4498-b247-853eea5ea4af.jpg)

Observação: todos os campos numéricos são completados com ‘0’ à esquerda. Os demais com espaço à esquerda.

Dados de exemplo (a primeira linha não consta no arquivo):
![1](https://user-images.githubusercontent.com/100815122/170606583-70e28cfe-bcac-4cb1-8420-f2bc4928d658.jpg)

<h3>Saída de dados</h3>

O formato de saída deve seguir a seguinte estrutura:

![Desafio técnico 2 (1)_Page3](https://user-images.githubusercontent.com/100815122/170607276-cf4727db-a25a-4ac0-a8e9-07894978a0ec.png)

<h2>Key words</h2>
<ul>
    <li>Testes</li>
    <li>Lógica</li>
    <li>Simplicidade</li>
    <li>SOLID</li>
    <li>Linguagem (não estamos falando de framework)</li> 
</ul>



# Software Utilizado

\- Apache NetBeans IDE

## Linguagem Utilizado

<ul>
    <li>Java</li>
<ul></ul>

# Como executar

- Baixar o repositório em formato ZIP.

- Após download do arquivo ZIP, abrir o Apache NetBeans IDE ou o seu programa IDE de preferencia.

- Em seguida, importe o seu arquivo através de File => Import Project => From ZIP.

  ![1](https://user-images.githubusercontent.com/100815122/174321527-a6baec38-746d-4650-b68d-6bf3e7d8cc61.jpg)

- Ou após o download do arquivo, extrair o ZIP em sua pasta de preferência e abra o arquivo através de File => Open Project e seleciona o arquivo desejado.

  ![2](https://user-images.githubusercontent.com/100815122/174321532-2fe561b1-166c-4937-8fb7-f13e98076db0.jpg)

- Após abrir o arquivo, na aba Projects, selecione o nome do arquivo do projeto, que é DesafioLuizaLabs, em seguida Source Packages, após isso abrir a aba com.mycompany.desafioluizalabs após isso abrir o arquivo ImportacaoDeArquivo.java.

  ![3](https://user-images.githubusercontent.com/100815122/174321533-fb3f8323-e98c-4de9-b778-0d0bc2d3c81b.jpg)

- Com o arquivo ImportacaoDeArquivo.java aberto, ir em Run Project, como na imagem abaixo:

![4](https://user-images.githubusercontent.com/100815122/174321535-c1730d84-eb37-4c27-9c13-3ac0f19615c7.jpg)

- Após clicar em Run Project, irá abrir uma nova janela, que está executando o arquivo, siga o passo a passo, descrito antes de importar o arquivo. 

![5](https://user-images.githubusercontent.com/100815122/174321539-aa2ed11e-a2d6-4f3c-9c43-3bccd75f0e4e.jpg)

- Após passo a passo, o processo estará concluído e o novo arquivo estará na mesma pasta do arquivo original.

- E  abrir o arquivo JSON em NotePad++ ou similar, ou em Json visualizer.

![6](https://user-images.githubusercontent.com/100815122/174321541-bf3bc649-4644-4b9b-a00d-07b151519361.jpg)
