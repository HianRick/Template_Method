1. Qual problema o exemplo resolve?

O exemplo resolve o problema de ter jogos diferentes que seguem a mesma sequência de execução: iniciar, jogar e finalizar. Sem o Template Method, cada jogo poderia implementar essa ordem de forma diferente ou duplicar a lógica do fluxo principal.

2. Por que esse padrão foi usado?

O padrão Template Method foi usado porque ele permite definir um fluxo fixo na classe abstrata Game, por meio do método play(), mas deixa que cada jogo implemente os detalhes das etapas. Assim, Football e Chess seguem a mesma estrutura, mas com comportamentos próprios.

3. Quais classes, interfaces ou objetos participam da solução?

A classe abstrata Game participa como a classe principal do padrão, pois define o método template play(). As classes Football e Chess são subclasses concretas, responsáveis por implementar os métodos start(), playTurn() e end(). No método main, os objetos football e chess são criados e executam o fluxo definido por Game.

4. Como o fluxo do exemplo funciona?

O fluxo começa quando o método play() é chamado. Esse método sempre executa as etapas na mesma ordem: primeiro chama start(), depois playTurn() e por fim end(). Quando o objeto é Football, as mensagens são relacionadas ao futebol. Quando o objeto é Chess, as mensagens são relacionadas ao xadrez. Assim, a ordem do algoritmo fica padronizada, mas o comportamento de cada etapa muda conforme o tipo de jogo.

# Evolução do Template Method

## O que o exemplo original fazia
O sistema simulava jogos utilizando o padrão comportamental Template Method.

## Evolução realizada
Foi adicionada uma nova etapa chamada `saveProgress()` no fluxo principal do jogo.

## Alterações feitas
- Criação do método abstrato `saveProgress()`;
- Implementação do método nas subclasses;
- Inclusão da etapa no método template `play()`;
- Adição de um novo jogo para demonstrar escalabilidade.,