Algoritmo "Calculadora_De_Imposto_De_Renda"
// Disciplina   : L�gica de Programa��o Algor�tmica
// Descri��o   : Calcula o imposto de renda de acordo com sal�rio inserido no programa.
// Autor(a)    : Marcelo Sodr� Raposo Junior
// Data atual  : 07/06/2022
Var
   // Se��o de Declara��es das vari�veis
   salario, salarioDeduzidoIR, IR: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("-------------------------------")
   escreval("CALCULADORA DE IMPOSTO DE RENDA")
   escreval("-------------------------------")
   escreval
   escreval("DIGITE SEU SAL�RIO")
   leia(salario)
   escreval

   se(salario <= 1903.98) entao
      escreval("N�o ser� deduzido imposto de renda.")
      escreval("-------------------------------")
      escreval("Valor do IR: 0,00")
      escreval("Sal�rio L�quido: ", salario:5:2)
      escreval("-------------------------------")
   sen�o
      se(salario >= 1903.99) e (salario <= 2826.65) entao
         escreval("Ser� deduzido do seu sal�rio uma al�quota de 7,5%")
         IR <- (salario * 0.075)
         salarioDeduzidoIR <- salario - IR
         escreval("-------------------------------")
         escreval("Valor do IR: ", IR)
         escreval("Sal�rio L�quido ", salarioDeduzidoIR:5:2)
         escreval("-------------------------------")
      senao
         se(salario >= 2826.66) e (salario <= 3751.05) entao
            escreval("Ser� deduzido do seu sal�rio uma al�quota de 15%")
            IR <- (salario * 0.15)
            salarioDeduzidoIR <- salario - IR
            escreval("-------------------------------")
            escreval("Valor do IR: ", IR)
            escreval("Sal�rio L�quido: ", salarioDeduzidoIR:5:2)
            escreval("-------------------------------")
         senao
            se(salario >= 3751.06) e (salario <= 4664.68) entao
               escreval("Ser� deduzido do seu sal�rio uma al�quota de 22,5%")
               IR <- (salario * 0.225)
               salarioDeduzidoIR <- salario - IR
               escreval("-------------------------------")
               escreval("Valor do IR: ", IR)
               escreval("Sal�rio L�quido: ", salarioDeduzidoIR:5:2)
               escreval("-------------------------------")
            senao
               escreval("Ser� deduzido do seu sal�rio uma al�quota de 27,5%")
               IR <- (salario * 0.275)
               salarioDeduzidoIR <- salario - IR
               escreval("-------------------------------")
               escreval("Valor do IR: ", IR)
               escreval("Seu sal�rio � de ", salarioDeduzidoIR:5:2)
               escreval("-------------------------------")
            fimse
         fimse
      fimse
   fimse
Fimalgoritmo