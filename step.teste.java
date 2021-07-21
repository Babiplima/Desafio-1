
Classe loginTeste

   Funcionalidade: Login e senha incorreto
   In order para logar no aplicativo
   As a cliente
   I want realizar login no meu cadastro com login e senha


Given("I click com login e senha") do
    NoesisQuaChallenge.apk
  expect(app.NoesisQuaChallenge.apk.displayed?).to eq true
end
