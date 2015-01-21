# language: pt
# encoding: iso-8859-1
Funcionalidade: Alterar Paises
  
  Como um usuário
  Quero alterar um pais 
  Para que seja possível manter um cadastro de paises

  Cenario: Deve validar alteracao do pais
    Dado que quero efetuar a atualizacao de um pais "paisValido"
    Quando eu efetuo a operacao de alterar um pais
    Entao a consulta pelo campo nome deve retornar 1 registro com os dados de entrada

  Esquema do Cenario: Deve validar campos obrigatorios
    Dado que quero efetuar a atualizacao de um pais "paisValido"
    E nao preencho o <campo obrigatorio>
    Quando eu efetuo a operacao de alterar um pais
    Entao devo receber a mensagem "Campos obrigatórios não informados."

    Exemplos: 
      | campo obrigatorio |
      | nome              |
      | codigo            |
      | continente        |

  Esquema do Cenario: Nao deve incluir pais duplicado
    Dado que quero efetuar a atualizacao de um pais "paisValido"
    E preencho o <campo> com o mesmo valor de outro pais ja cadastrado
    Quando eu efetuo a operacao de alterar um pais
    Entao devo receber a mensagem "País ja cadastrado."

    Exemplos: 
      | campo      |
      | nome       |
      | codigo     |
      | continente |
