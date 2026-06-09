# Aula 4 - Sistema Bancario Parte 1

Nesta aula, comecei um mini projeto de Sistema Bancario em Java para praticar Programacao Orientada a Objetos na pratica.

O objetivo foi criar uma classe `Conta`, com `titular` e `saldo`, e aprender a proteger esses dados usando encapsulamento.

## O que foi praticado

- Criacao de classe e objeto
- Construtor
- Uso do `this`
- Atributos `private`
- Metodos `public`
- Deposito com validacao
- Saque com validacao
- Getter para consultar dados
- Setter para alterar dados com seguranca

## Conceitos importantes

O construtor foi usado para criar uma conta ja com titular e saldo inicial.

O `private` foi usado para impedir que o saldo e o titular fossem alterados diretamente fora da classe.

Os getters foram usados para consultar informacoes da conta.

Os setters foram usados para alterar informacoes com regras de validacao.

## Resultado

Nesta parte, a classe `Conta` passou a ter regras proprias:

- Nao aceita deposito invalido
- Nao permite saque maior que o saldo
- Nao aceita titular vazio
- Cria uma conta segura mesmo quando os dados iniciais sao invalidos

Essa aula marcou minha evolucao de apenas criar objetos para criar uma classe com comportamento e protecao de dados.
