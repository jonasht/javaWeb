// 3. Calculadora Simples:   - 
// Implemente uma calculadora que recebe dois números e uma operação 
// (adição, subtração, multiplicação, divisão) e retorna o resultado.


// function somar(n1, n2) {
//     return n1 + n2
// }
// function subtrair(n1, n2) {
//     return n1 - n2
// }
// function multiplicar(n1, n2) {
//     return n1 * n2
// }

// function divisão(n1, n2) {
//     return n1 / n2
// }

function calculadora(n1, n2, operacao){
    if (operacao == '+') {
        return `${n1} + ${n2} = ${n1+n2}`
    } else  if (operacao == '-') {
        return `${n1} - ${n2} = ${n1-n2}`
    } else  if (operacao == '*') {
        return `${n1} X ${n2} = ${n1*n2}`
    } else  if (operacao == '/') {
        return `${n1} / ${n2} = ${n1/n2}`
    } 
}

let n1 = 2
let n2 = 5

console.log(calculadora(n1, n2, '+'))
console.log(calculadora(n1, n2, '-'))
console.log(calculadora(n1, n2, '*'))
console.log(calculadora(n1, n2, '/'))

