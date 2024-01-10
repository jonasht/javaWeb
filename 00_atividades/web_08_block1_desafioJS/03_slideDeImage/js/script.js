const imagens = [
    './img/1.jpg',  './img/2.jpg',  './img/3.jpg',
    './img/4.jpg',  './img/5.jpg',  './img/6.jpg', 
    './img/7.jpg',  './img/8.jpg',  './img/9.jpg'
  ];
  let index = 0;
  const imagem = document.getElementById('imagem');
  const bt_avancar = document.getElementById('bt_avancar');
  const bt_voltar = document.getElementById('bt_voltar');
  
  function mostrarImagem() {
    imagem.src = imagens[index];
  }
  
  bt_voltar.addEventListener('click', function () {
    index = (index - 1 + imagens.length) % imagens.length;
    mostrarImagem();
  });
  
  bt_avancar.addEventListener('click', function () {
    index = (index + 1) % imagens.length;
    mostrarImagem();
  });
  
  // Carrega a primeira imagem automaticamente ao iniciar a página
  mostrarImagem();
  