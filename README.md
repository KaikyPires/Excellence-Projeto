# Pizzaria Excellence

## Descrição
Este é um projeto prático de Programação Orientada a Objetos (POO) desenvolvido durante o curso de Sistemas de Informação. O sistema é para uma pizzaria e está integrado ao banco de dados PostgreSQL. Ele possui funcionalidades para gerenciar a home page, a área dos funcionários e a gerência.

## Tecnologias Utilizadas
- Java (utilizando Swing para a interface gráfica).
- PostgreSQL

## Estrutura do Projeto
O projeto está dividido em classes e interfaces, organizadas da seguinte maneira:

- `src/`: Diretório principal do código-fonte.
  - `Main.java`: Classe principal que inicializa a aplicação.
  - `controller/`: Pacote contendo as classes de controle.
  - `dao/`: Pacote contendo as classes de acesso a dados.
  - `pizzariaicons/`: Pacote com os ícones utilizados na interface.
  - `classes/`: Pacote contendo as classes de modelo, representando as entidades do sistema:
    - `Barista.java`: Classe que representa um barista.
    - `Bebidas.java`: Classe que representa as bebidas.
    - `ChefDeCozinha.java`: Classe que representa o chefe de cozinha.
    - `Cozinheiro.java`: Classe que representa um cozinheiro.
    - `Entregador.java`: Classe que representa um entregador.
    - `Funcionarios.java`: Classe base para os funcionários.
    - `FuncionariosTerceirizado.java`: Classe que representa funcionários terceirizados.
    - `Garcom.java`: Classe que representa um garçom.
    - `Gerente.java`: Classe que representa o gerente.
    - `Pedidos.java`: Classe que representa os pedidos.
    - `Pizza.java`: Classe que representa as pizzas.
  - `interfaces/`: Pacote contendo as interfaces do projeto:
 `interface_areaClientes.java`: Interface para a área dos clientes.
    - `interface_areaFuncionarios.java`: Interface para a área dos funcionários.
    - `interface_entrada.java`: Interface para a entrada do sistema.
    - `interface_cozinha.java`: Interface para a área da cozinha.
    - `interface_fachada.java`: Interface para a fachada do sistema.
    - `interface_gerencia.java`: Interface para a área de gerência.
    - `interface_rh.java`: Interface para o RH.
    - `interface_senhaGerencia.java`: Interface para a senha da gerência.

## Funcionalidades
- **Home Page**: Apresenta informações principais sobre a pizzaria.

   <img src= "https://github.com/KaikyPires/Sistema-de-Pizzaria-com-Banco-de-Dados-PostGreSQL/assets/129606756/91855358-3e3f-4c8b-b8d4-693d2520c1cf" alt="Imagem 1" style="width: 40%;">
   <img src="https://github.com/KaikyPires/Sistema-de-Pizzaria-com-Banco-de-Dados-PostGreSQL/assets/129606756/5cf315c3-a00d-4eb4-9191-a749ae787050" alt="Imagem 2" style="width: 40%;">
- **Área dos Funcionários**: Permite o cadastro e gerenciamento dos funcionários da pizzaria.
- <img src="https://github.com/KaikyPires/Sistema-de-Pizzaria-com-Banco-de-Dados-PostGreSQL/assets/129606756/5e046024-792f-4948-9803-a9dd9755b9c6" alt="Imagem 3" style="width: 40%;">
- **Gerência**: Possibilita o controle de pedidos, gerenciamento de estoque e outras funcionalidades administrativas.


<img src="https://github.com/KaikyPires/Sistema-de-Pizzaria-com-Banco-de-Dados-PostGreSQL/assets/129606756/8fa105f5-49f1-407c-bb91-812c8ea5ae97" alt="Imagem 5" style="width: 40%;">

<img src="https://github.com/KaikyPires/Sistema-de-Pizzaria-com-Banco-de-Dados-PostGreSQL/assets/129606756/0164d8a2-e7f7-4c20-940b-3cb77e59ab30" alt="Imagem 4" style="width: 40%;">

<img src="https://github.com/KaikyPires/Sistema-de-Pizzaria-com-Banco-de-Dados-PostGreSQL/assets/129606756/a4cc2fc6-52df-4319-aea8-eac48611cf55" alt="Imagem 6" style="width: 40%;">
