// Jogo de Adivinhação:
// Crie um jogo onde o programa escolhe um número aleatório e
//  o jogador tem que adivinhar qual é.
//  O programa deve fornecer dicas se o número fornecido é maior ou menor.


function jogoAdivinhacao() {
    const numeroAleatorio = Math.floor(Math.random() * 100) + 1; 
    let tentativas = 0;
  
    while (true) {
      const palpite = parseInt(prompt("Adivinhe o número (de 1 a 100):"));
  
      if (isNaN(palpite)) {
        alert("Por favor, insira um número válido.");
        continue;
      }
  
      tentativas++;
  
      if (palpite === numeroAleatorio) {
        alert(`Parabéns! Você acertou em ${tentativas} tentativas.`);
        break;
      } else if (palpite < numeroAleatorio) {
        alert("Tente um número maior.");
      } else {
        alert("Tente um número menor.");
      }
    }
  }
  
  jogoAdivinhacao();
  