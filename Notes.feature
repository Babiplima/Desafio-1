#Teste Login e senha QuaChalenge.apk

  #In order para logar no aplicativo
  #As a cliente
  #I want realizar login no meu cadastro com login e senha

Feature: Login e senha incorreto Login e senha incorreto
  # add login e senha incorreto
  @addlogin @validlogin
  Scenario: validar Login e senha incorreto
    Given o usuário logar com login e senha
    And o usuário está cadastrado com no app
    When usuário confirma login e senha
    Then usuário verá a mensagem “Usuario e/ou senha incorreto”

  # add login e senha com sucesso
  @addlogin @validlogin
  Scenario: validar Login e senha com sucesso
    Given  o usuário logar com login e senha #"login admin" "senha admin"#
    And o usuário está cadastrado com no app
    When usuário confirma login e senha
    Then usuário realizará o login com sucesso

   #Teste formTest QuaChalenge.apk
   Feature: Acessar o menu do aplicativo
  # acesse form
  @clicking @validate

  #In order acessar a opção Form
  #As a cliente quero acessar o Form
  #I want e escolher duas opções


  Scenario : Acesso ao menu opção formAcesso ao menu opção form
    Given o usuário acessar o menu
    And o usuário terá acesso a opção Form
    When usuário realizar acesso ao Form
    And o usuário terá várias opções a escolha
    Then o usuário escolherá duas opções ao seu gosto


