# language: pt
# encoding: iso-8859-1
Funcionalidade: Pesquisar Paises
  
  Como um usuário
  Quero pesquisar os paises
  Para que seja possível localizar um pais

  Esquema do Cenario: Deve pesquisar paises por filtro existente 
    Dado que existam paises cadastrados
    E preencho o <filtro> com um valor valido
    Quando eu efetuo a pesquisa de paises
    Entao são apresentados os registros correspondentes ao filtro informado

    Exemplos: 
      | filtro     |
      | nome       |
      | codigo     |
      | continente |

  Esquema do Cenario: Deve pesquisar paises por filtro inexistente
    Dado que existam paises cadastrados
    E preencho o <filtro> com um valor invalido
    Quando eu efetuo a pesquisa de paises
    Entao nenhum registro e retornado pela pesquisa

    Exemplos: 
      | filtro     |
      | nome       |
      | codigo     |
      | continente |

  Cenario: Deve pesquisar pais por todos filtros existentes
    Dado que existam paises cadastrados
    E preencho o filtro nome com um valor valido
    E preencho o filtro codigo com um valor valido
    E preencho o filtro continente com um valor valido
    Quando eu efetuo a pesquisa de paises
    Entao são apresentados os registros correspondentes ao filtro informado

  Cenario: Deve pesquisar pais por todos filtros inexistentes
    Dado que existam paises cadastrados
    E preencho o filtro nome com um valor invalido
    E preencho o filtro codigo com um valor invalido
    E preencho o filtro continente com um valor invalido
    Quando eu efetuo a pesquisa de paises
    Entao nenhum registro e retornado pela pesquisa
