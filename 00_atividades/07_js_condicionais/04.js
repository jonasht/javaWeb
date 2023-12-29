// 4. Idade e Categoria:
//  Crie um programa que determina a categoria de uma pessoa baseada na idade 
// (criança, adolescente, adulto, idoso).



let idade = -1


if (idade >= 0){
    if (idade <= 6){
        console.log("bebe")
    } else if (idade <= 12){
        console.log("criança")
    } else if (idade <= 18){
        console.log("adulto")
    } else if (idade <= 60){
        console.log("idoso")
    } 
} else {
    console.log("nao idade")
}
