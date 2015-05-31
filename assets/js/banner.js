var numImagens = 9;
var path = "../assets/img/banner/";
var iter = 1;
var ext = ".jpg";

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
