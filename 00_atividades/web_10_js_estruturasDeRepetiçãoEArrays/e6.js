const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
function limpar(){
    for (let i = 0; i < 50; i++)console.log('')
}
function printEfeite(){
    console.log("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
}
const numeros = [];

function lerNumero(i) {
    limpar()
    printEfeite()

    rl.question(`digite ${i + 1}º numero: `, (numeroDigitado) => {
    const numero = parseInt(numeroDigitado);

    if (!isNaN(numero)) {
      numeros.push(numero);

      if (numeros.length < 4) {
        lerNumero(numeros.length)
      } else {
        const soma = numeros.reduce((acc, num) => acc + num, 0)
        const media = soma / numeros.length

        limpar()
        printEfeite()
        console.log(`media: ${media}`)

        rl.close()
      }
    } else {
      console.log('por favor digite um numero valido')
      lerNumero(i)
    }
  })
}

lerNumero(0)
