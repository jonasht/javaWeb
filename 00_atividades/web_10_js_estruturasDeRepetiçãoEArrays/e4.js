const numeros = [5, 8, 4, 12, 7, 1, 4]

let maiorNumero = 0

for (let i = 0; i < numeros.length; i++)
  if (numeros[i] > maiorNumero)
    maiorNumero = numeros[i]

console.log(`maior numero: ${maiorNumero}`)
