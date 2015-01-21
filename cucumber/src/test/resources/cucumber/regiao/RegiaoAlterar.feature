# language: pt
# encoding: iso-8859-1
Funcionalidade: Inserir Regiões
  
  Como um usuário
  Quero alterar uma região
  Para que seja possível manter um cadastro de regiões

  Cenario: Deve validar alteracão da região
    Dado que quero efetuar a atualizacao de uma região "regiaoValida"
    Quando eu efetuo a operação de alterar uma região
    Entao a consulta pelo campo nome deve retornar 1 registro com os dados de entrada

  Esquema do Cenario: Deve validar campos obrigatórios
    Dado que quero efetuar a atualização de uma região "regiaoValida"
    E não preencho o <campo obrigatorio>
    Quando eu efetuo a operação de alterar uma região
    Entao devo receber a mensagem "Campos obrigatórios não informados."

    Exemplos: 
      | campo obrigatorio |
      | nome              |
      | pais              |
      | area              |

  Esquema do Cenario: Não deve incluir região duplicada
    Dado que quero efetuar a atualização de uma região "regiaoValida"
    E preencho os campos nome e pais com os mesmos valores de outra região já cadastrada
    Quando eu efetuo a operação de alterar uma região
    Entao devo receber a mensagem "Região já cadastrada."
