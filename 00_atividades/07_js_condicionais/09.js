// Jogo de Adivinhação:
// Crie um jogo onde o programa escolhe um número aleatório e
//  o jogador tem que adivinhar qual é.
//  O programa deve fornecer dicas se o número fornecido é maior ou menor.

// coloque um numero aleatorio de 0 a 10
let palpite = 10
// gerar numero aleatorio
let numeroAleatorio = Math.floor(Math.random() * 10) + 1; // Gera um número aleatório de 1 a 100
    
  
if (palpite === numeroAleatorio) {
    console.log(`Parabéns! Você acertou`)
}




  
  
  