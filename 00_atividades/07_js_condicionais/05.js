// 5. Conversor de Notas:
// Escreva um programa que converte notas numéricas em conceitos
//  (A, B, C, D, F) baseado em um sistema de pontuação.




function converter (nota){
    if (nota <= 2){
        return 'F'
    } else if (nota <= 4){
        return 'D'
    } else if (nota <= 6){
        return 'C'
    } else if (nota <= 8){
        return 'B'
    } else if (nota <= 10){
        return 'A'
    }
}

// usando a funcao normalmente
let nota = 1
console.log(converter(nota))


// usando a funcao com loop for
for (var i = 0; i<=10; i++){
    console.log("nota", i, "=", converter(i))

}
