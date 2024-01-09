
document.addEventListener('DOMContentLoaded', function() {
    var inputMin = document.querySelector('.input_min');
    var inputMax = document.querySelector('.input_max');
    var pNumero = document.getElementById('p_numero');

    function gerar(min, max) {
        return Math.floor(Math.random() * (max - min + 1)) + min;
    }

    window.sortearNumero = function() {
        var min = parseInt(inputMin.value);
        var max = parseInt(inputMax.value);

        if (isNaN(min) || isNaN(max)) {
            alert("Por favor, insira valores numéricos para mínimo e máximo.");
            return;
        }

        var numeroSorteado = gerar(min, max);
        pNumero.textContent = numeroSorteado;
    };
});
