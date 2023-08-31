Algoritmo "Calculadora_De_Imposto_De_Renda"
// Disciplina   : Lógica de Programação Algorítmica
// Descrição   : Calcula o imposto de renda de acordo com salário inserido no programa.
// Autor(a)    : Marcelo Sodré Raposo Junior
// Data atual  : 07/06/2022
Var
   // Seção de Declarações das variáveis
   salario, salarioDeduzidoIR, IR: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("-------------------------------")
   escreval("CALCULADORA DE IMPOSTO DE RENDA")
   escreval("-------------------------------")
   escreval
   escreval("DIGITE SEU SALÁRIO")
   leia(salario)
   escreval

   se(salario <= 1903.98) entao
      escreval("Não será deduzido imposto de renda.")
      escreval("-------------------------------")
      escreval("Valor do IR: 0,00")
      escreval("Salário Líquido: ", salario:5:2)
      escreval("-------------------------------")
   senão
      se(salario >= 1903.99) e (salario <= 2826.65) entao
         escreval("Será deduzido do seu salário uma alíquota de 7,5%")
         IR <- (salario * 0.075)
         salarioDeduzidoIR <- salario - IR
         escreval("-------------------------------")
         escreval("Valor do IR: ", IR)
         escreval("Salário Líquido ", salarioDeduzidoIR:5:2)
         escreval("-------------------------------")
      senao
         se(salario >= 2826.66) e (salario <= 3751.05) entao
            escreval("Será deduzido do seu salário uma alíquota de 15%")
            IR <- (salario * 0.15)
            salarioDeduzidoIR <- salario - IR
            escreval("-------------------------------")
            escreval("Valor do IR: ", IR)
            escreval("Salário Líquido: ", salarioDeduzidoIR:5:2)
            escreval("-------------------------------")
         senao
            se(salario >= 3751.06) e (salario <= 4664.68) entao
               escreval("Será deduzido do seu salário uma alíquota de 22,5%")
               IR <- (salario * 0.225)
               salarioDeduzidoIR <- salario - IR
               escreval("-------------------------------")
               escreval("Valor do IR: ", IR)
               escreval("Salário Líquido: ", salarioDeduzidoIR:5:2)
               escreval("-------------------------------")
            senao
               escreval("Será deduzido do seu salário uma alíquota de 27,5%")
               IR <- (salario * 0.275)
               salarioDeduzidoIR <- salario - IR
               escreval("-------------------------------")
               escreval("Valor do IR: ", IR)
               escreval("Seu salário é de ", salarioDeduzidoIR:5:2)
               escreval("-------------------------------")
            fimse
         fimse
      fimse
   fimse
Fimalgoritmo