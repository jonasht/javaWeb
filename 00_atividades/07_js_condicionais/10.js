// 10. Simulador de Empréstimo: 
// Desenvolva um programa que simula um sistema de empréstimo,
//  determinando se um cliente é elegível com base na renda, idade e histórico de crédito.


function verificarElegibilidadeParaEmprestimo(renda, idade, historicoCredito) {
    const rendaMinima = 2000 
    const idadeMinima = 18
    const historicoCreditoPositivo = true 
  
    // Verifique a elegibilidade
    if (renda >= rendaMinima && idade >= idadeMinima && historicoCredito === historicoCreditoPositivo) {
      return "Elegível para o empréstimo!";
    } else {
      return "Não elegível para o empréstimo.";
    }
  }
  
  // Exemplo de uso:
  const rendaCliente = 2500
  const idadeCliente = 20
  const historicoCreditoCliente = true
  
  const resultado = verificarElegibilidadeParaEmprestimo(rendaCliente, idadeCliente, historicoCreditoCliente);
  console.log(resultado);
  