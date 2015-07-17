var numImagens = 9,
  path = "../assets/img/banner/",
  iter = 1,
  ext = ".jpg";

function banner () {
  var img = document.getElementById("fundo-img");
  img.src = path + iter + ext;

  iter = (iter + 1) % numImagens;
}

window.onload = function(){
  setInterval(function(){
    banner();
  }, 3000);
}
