// Coloque seu código JavaScript aqui
const celsiusInput = document.getElementById('celsius');
const fahrenheitInput = document.getElementById('fahrenheit');
const kelvinInput = document.getElementById('kelvin');

function atualizarValores(valor, tipo) {

  if (tipo === 'celsius') {
    if (isNaN(valor)){
      fahrenheitInput.value = ''
      kelvinInput.value = ''
    } else {

      fahrenheitInput.value = ((valor * 9) / 5 + 32).toFixed(2);
      kelvinInput.value = (valor + 273.15).toFixed(2);
    }
  } else if (tipo === 'fahrenheit') {
    if (isNaN(valor)){
      celsiusInput.value = '';
      kelvinInput.value = '';

    } else {

      celsiusInput.value = (((valor - 32) * 5) / 9).toFixed(2);
      kelvinInput.value = (((valor - 32) * 5) / 9 + 273.15).toFixed(2);
    }
  } else if (tipo === 'kelvin') {
    if (isNaN(valor)){
      celsiusInput.value = '';
      fahrenheitInput.value = '';

    } else {

      celsiusInput.value = (valor - 273.15).toFixed(2);
      fahrenheitInput.value = (((valor - 273.15) * 9) / 5 + 32).toFixed(2);
    }
  }
}

celsiusInput.addEventListener('input', function () {
  atualizarValores(parseFloat(celsiusInput.value), 'celsius');
});

fahrenheitInput.addEventListener('input', function () {
  atualizarValores(parseFloat(fahrenheitInput.value), 'fahrenheit');
});

kelvinInput.addEventListener('input', function () {
  atualizarValores(parseFloat(kelvinInput.value), 'kelvin');
});
