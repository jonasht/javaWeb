//CASO DE USO
// VERIFICAR A IDADE DE UMA PESSOA COM AS REGRAS
// MENOR QUE 2 ANOS "BEBÊ"
// MAIOR QUE 2 ANOS E MENOR QUE 12 ANOS "CRIANÇA"
// MAIOR QUE 12 E MENOR QUE 18 ANOS "ADOLESCENTE"
// MAIOR QUE 18 E MENOR QUE 60 "ADULTO"
// MAIOR QUE 60  ANOS "IDOSO"

let idade = -2

if (idade < 2 && idade >= 0){
    console.log("bebe")
}else if(idade < 12){
    console.log("criança")
}else if (idade < 18){
    console.log("adolescente")
}else if(idade < 60){
    console.log("adulto")
}else if (idade >= 60 && idade <= 180) {
    console.log("jovem sabio idoso")
}else{
    console.log("idade inválida")
}