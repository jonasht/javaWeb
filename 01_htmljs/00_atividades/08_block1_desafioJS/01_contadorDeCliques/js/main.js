let contador = 0;
const cContador = document.querySelector('.contador')
function contarClique() {
    if (contador != 300){
        
        contador++;
        document.getElementById('contador').innerHTML = contador

        if (contador <= 100){
            cContador.style.color = 'green';

        } else if(contador <=150) {
            cContador.style.color = 'yellow';
        } else {
            cContador.style.color = 'red';

        }

    }
}
