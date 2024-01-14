
const frutas = [
    'maça',
    'banana',
    'pera',
    'tomate',
    'morango',
    'abacaxi',
    'laranja',
    'uva',
    'limão'
]

tmn = frutas.length

for (let i = 0; i < tmn; i++){
    const espacos = ' '.repeat(7 - frutas[i].length)
    console.log(`${espacos}${frutas[i]} : ${frutas[i].length} letras`)
}