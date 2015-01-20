# language: pt
# encoding: iso-8859-1
Funcionalidade: Listar Continentes
  
  Como um usuário
  Quero listar os continentes
  Para que seja possível selecionar um continente a partir da listagem

  Cenario: Deve retornar uma lista vazia
    Dado que não existam registros cadastrados no banco
    Quando eu acesso a listagem de continentes
    Entao devo receber uma lista vazia como resposta

  Cenario: Deve retornar todos os registros
    Dado que existam registros cadastrados no banco
    Quando eu acesso a listagem de continentes
    Entao devo receber uma listagem com todos os registros

  Cenario: Deve retornar lista ordenada de forma crescente
    Dado que existam registros cadastrados no banco
    Quando eu acesso a listagem de continentes
    Entao devo receber uma lsitagem com os registros ordenados por nome de forma crescente
