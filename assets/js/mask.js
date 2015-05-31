function telMask(tel) {
		var tel = document.getElementById("tel");


    tel.value = tel.value.replace(/\D/, "");
    tel.value =tel.value.replace(/^(\d{2})(\d{4,5})(\d{4})(.)/g,"($1) $2-$3");
    v=v.replace(/(\d)(\d{4})$/,"$1-$2");

		// this.value = v;

}


// window.onload = function(){
//   document.getElementById('tel').onkeyup = function(){
// 	};
// };
