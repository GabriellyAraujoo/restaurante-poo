# Modelagem Orientada a Objetos em Java

Três exercícios de modelagem de domínio em Java, cada um em sua pasta, com a
estrutura de classes, os construtores e as regras de negócio de um domínio real.

## O que este projeto demonstra

- **Encapsulamento** com atributos privados e acesso por `getters`/`setters`.
- **Composição**: um `Pedido` é feito de `Cliente` e de uma lista de `ItemMenu`,
  e é o `Pedido` que controla o total e o status, não o `Main`.
- **Construtores** que recebem os dados já validados, em vez de setters usados
  como construtor.
- **Responsabilidade de quem é do domínio**: `Aluno` calcula o próprio conceito,
  `Pedido` calcula o próprio total e respeita a capacidade máxima de itens.
- **Tratamento de lista vazia** antes de iterar, evitando `NoSuchElementException`.

## Estrutura

```
sistema-aluno/            Aluno, Turma e Main
  Aluno.java              matrícula, nota e o cálculo do conceito (A a D)
  Turma.java              menu interativo e a lista de alunos (ArrayList)
  Main.java               ponto de entrada

restaurante/programs/     Cliente, Pedido, ItemMenu e Main
  Cliente.java            cadastro do cliente, com método estático de factory
  ItemMenu.java           item do cardápio, com nome, categoria e preço
  Pedido.java             itens do pedido, total, status e capacidade máxima
  Main.java               ponto de entrada

pessoa/                   Pessoa e Main
  Pessoa.java             nome, data de nascimento e altura
  Main.java               ponto de entrada
```

O pacote `programs` no exercício do restaurante é o que o exercício original pedia;
mantive a estrutura de pastas para que ele compile exatamente como foi feito.

## Como executar

Requer um JDK instalado.

```bash
# Sistema de alunos
cd sistema-aluno && javac *.java && java Main

# Restaurante
cd restaurante && javac programs/*.java && java programs.Main

# Pessoa
cd pessoa && javac *.java && java Main
```

## Nota

Estes exercícios são material de aula. O código foi organizado por exercício para
que cada um compile e rode de forma independente, já que todos usavam a classe
`Main` e o mesmo conjunto de arquivos na pasta de origem.
