
História do usuário 

Sendo eu um usuário do plano de saúde Unimed Coop 
Quero acessar o Guia Médico  
Para buscar médicos no Rio de Janeiro 


Dado que o usuario acessar a página da Unimed Cooperativa atraves da url "http://www.unimed.coop.br/"

Quando visualiza a tela principal

E clicar no botão Consulte agora

Então será redirecionado para a tela Encontre um médico

E clicar na aba Busca detalhada

E selecionar o estado Rio de Janeiro no listbox Estado

E clicar no botão pesquisar

Então a aplicação redireciona o usuário para página de resultados

E validar resultados que contenha tipo de Especialidade

E validar resultados que contenha nome da Cidade



Cenário: Acessar Guia Médico para pesquisa em São Paulo não apresentação de resultados


Dado que o usuário acessa a página da Unimed Cooperativa atraves da url "http://www.unimed.coop.br/"

Quando visualiza a tela principal

E clicar no botão Consulte agora

Então será redirecionado para a tela Encontre um médico

E clicar na aba Busca detalhada

E selecionar o estado Rio de Janeiro no listbox Estado

E clicar no botão pesquisar

Então a aplicação redireciona o usuário para página de resultados

E validar a não existência de resultados que contenha nome da Cidade São Paulo

E clicar no botão Ver mais resultados

E validar a não existência de resultados que contenha nome da Cidade São Paulo

E clicar no botão Ver mais resultados

E validar a não existência de resultados que contenha nome da Cidade São Paulo


