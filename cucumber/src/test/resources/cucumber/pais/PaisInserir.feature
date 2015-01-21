# language: pt
# encoding: iso-8859-1
Funcionalidade: Inserir Paises
  
  Como um usuário
  Quero inserir um pais
  Para que seja possível manter um cadastro de paises

  Cenario: Deve inserir um pais
    Dado que quero efetuar o cadastro de um novo "paisValido" 
    Quando eu efetuo a operacao de inserir um pais
    Entao a inclusao pelo campo nome deve retornar 1 registro

  Esquema do Cenario: Deve validar campos obrigatorios
    Dado que quero efetuar o cadastro de um novo "paisValido"
    E nao preencho o campo <campo obrigatorio>
    Quando eu efetuo a operacao de inserir um pais
    Entao devo receber a mensagem "Campos obrigatórios não informados."

    Exemplos: 
      | campo obrigatorio |
      | nome              |
      | codigo            |
      | continente        |

  Cenario: Deve validar pais duplicado
    Dado que quero efetuar o cadastro de um novo "paisValido"
    E este pais ja esta cadastrado
    Quando eu efetuo a operacao de inserir um pais
    Entao devo receber a mensagem "País ja cadastrado."
