algoritmo "Lista3-Ex11"
// Fun��o :
// Autor :
// Data : 10/09/2014
// Se��o de Declara��es 
var
   i,ant,prox,temp:inteiro
inicio
// Se��o de Comandos


   // atribui�ao
   i:=1
   ant:=0
   prox:=1
   temp:=0
   
   enquanto (i <= 20) faca
            ant:= prox
            prox:= temp
            temp:= ant+prox
            
            escreva(temp)
            i:=i+1
   fimenquanto
   
fimalgoritmo
