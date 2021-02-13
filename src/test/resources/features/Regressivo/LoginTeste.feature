#language: pt
#encoding: UTF-8


@Project @TesteRegressivo
Funcionalidade: Login

  @Login
  Esquema do Cenario: Login invalido
    Dado que estou na pagina "<URL>"
    Quando preencho o campo usuario com o valor "<Usuario>"
    E preencho o campo senha com o valor "<Usuario>"
    Entao clico no botão "Entrar"
    E valido a mensagem e-mail invalido

    Exemplos: 
      | URL                           																																						|       Usuario              |
      | https://login.webmotors.com.br/?&r=https://www.webmotors.com.br&inst=header:webmotors::logar-ou-cadastrar | WIL.AMORIM23@GMAIL.COM     |
