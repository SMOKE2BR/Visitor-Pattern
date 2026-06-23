# Visitor Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Visitor** em Java, aplicado a um sistema de estoque com diferentes tipos de itens.

## 📌 Estrutura


  ***DIAGRAMA DE CLASSES***

  <img width="3014" height="2045" alt="592275628-a8edb0a2-8ba7-43f2-98e3-a2a57c1b6f60" src="https://github.com/user-attachments/assets/2c80b8ee-8406-44ee-b458-b685ed18f790" />


- **Interface**
  - `ItemEstoque` → define o contrato para os itens do estoque, com o método `aceitar(Visitor)`.

- **Classes concretas**
  - `Perecivel` → representa itens com data de validade.
  - `NaoPerecivel` → representa itens duráveis, com quantidade em estoque.
  - `Refrigerado` → representa itens que precisam de temperatura controlada.

- **Visitor**
  - `Visitor` → interface que define operações específicas para cada tipo de item.
  - `EstoqueVisitor` → implementação concreta que exibe informações dos itens conforme seu tipo.

- **Classe de execução**
  - `Main` → instancia diferentes itens de estoque e utiliza o visitor para exibir suas informações.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/visitor`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Não Perecível: Arroz (Qtd: 50)
Perecível: Leite (Validade: 20/07/2026)
Refrigerado: Sorvete (Temp Máx: -10.0°C)


## 🎯 Objetivo

O padrão **Visitor** permite separar algoritmos da estrutura de objetos sobre os quais operam.  
Neste exemplo, o `EstoqueVisitor` centraliza a lógica de exibição dos itens (`Perecivel`, `NaoPerecivel`, `Refrigerado`), sem precisar modificar as classes dos itens quando novas operações são adicionadas.
