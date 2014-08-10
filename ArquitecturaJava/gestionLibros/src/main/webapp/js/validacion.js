function validacion() {
	var isbn = document.getElementById("isbn");
	var miformulario = document.getElementById("formularioAltaLibro");
	if (isbn.value == "") {
		alert("datos no validos");
		return false;
	} else {
		miformulario.submit();
	}
}