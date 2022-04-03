
 function validar(){
 	let nome = frmContato.nome.value
 	let telemovel = frmContato.telemovel.value
 	let email = frmContato.email.value
 	if (nome === "") {
 		alert('Preencher o campo Nome')
 		frmContato.nome.focus()
 		return false
 		
 	} else if (telemovel=== "") {
 	alert("Preencher o campo Telemovel")
 		frmContato.telemovel.focus()
 		return false
 		}
 		 else if (email=== "") {
 	alert("Preencher o campo Email")
 		frmContato.email.focus()
 		return false
 		}
 		else { 
 		document.forms["frmContato"].submit()
 		}
 	}