// Verificador de Ano Bissexto:
// Implemente um programa que verifica se um ano é bissexto ou não.


function verificarAnoBissexto(ano) {
    return (ano % 4 === 0 && ano % 100 !== 0) || ano % 400 === 0 ? "Ano Bissexto" : "Não é um Ano Bissexto";
  }
  
  const ano = 2023
  const resultado = verificarAnoBissexto(ano)
  console.log(resultado)