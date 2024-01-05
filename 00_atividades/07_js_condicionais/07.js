// Validação de Triângulo:
// Crie um programa que verifica se três segmentos formam um triângulo
//  e, se sim, determina seu tipo (equilátero, isósceles, escaleno).



function validarTriangulo(lado1, lado2, lado3) {
    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
      if (lado1 === lado2 && lado2 === lado3) {
        return "Triângulo Equilátero"
      } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
        return "Triângulo Isósceles"
      } else {
        return "Triângulo Escaleno"
      }
    } else {
      return "Não é um triângulo válido"
    }
  }
  
function enfeitar(){
    console.log('=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=')
}
  let lado1 = 5
  let lado2 = 5
  let lado3 = 5
  
  enfeitar()
  console.log(`\t\tlado 1: ${lado1}`)
  console.log(`\t\tlado 2: ${lado2}`)
  console.log(`\t\tlado 3: ${lado3}`)
  console.log(`\t\t${validarTriangulo(lado1, lado2, lado3)}`)
  enfeitar()