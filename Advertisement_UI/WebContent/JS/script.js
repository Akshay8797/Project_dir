var attempts = 3;
function check_form() {
	var email = document.getElementById("email").value;
	var pass = document.getElementById("pass").value;
	if (email == "akshay@mail.com" && pass == 12345) {
		alert("SuccessFully Logged In");
		document.location = "User.html";

	} else {
		if (attempts == 0) {
			alert("No Attempts Left");
		} else {
			attempts = attempts - 1;
			alert("Login Failed, " + attempts + " Login Attempts Available");
			if (attempts == 0) {
				document.getElementById("email").disabled = true;
				document.getElementById("pass").disabled = true;
				document.getElementById("userForm").disabled = true;
				document
						.writeln("<h1>You are Not Authorized to Access this Page!</h1>");
			}
		}
	}
	return false;
}

function registerFunction() {
	var mail = document.getElementById("emailReg").value;
	var pwd = document.getElementById("passReg").value;
	var first = document.getElementById("fName").value;
	var last = document.getElementById("lName").value;
	if (mail != "" && pwd != "" && first != "" && last != "") {
		alert("Registered Successfully!");
	}
}

function messageFunction() {
	var mail1 = document.getElementById("email1").value;
	var mail2 = document.getElementById("email2").value;
	var contact = document.getElementById("contact").value;
	var msg = document.getElementById("msgBody").value;
	if (mail1 != "" && contact != "" && msg != "") {
		alert("Message Sent!");
	}
}

function createFunction() {
	var sName = document.getElementById("sellerName").value;
	var sPhone = document.getElementById("sellerPhone").value;
	var pName = document.getElementById("prodName").value;
	var sp = document.getElementById("prodPrice").value;
	var desc = document.getElementById("prodDesc").value;
	if (sName != "" && sPhone != "" && pName != "" && sp != "" && desc != "") {
		alert("Advertisement Created!");
	}
}

function deleteFunction() {
	var aid = document.getElementById("adId").value;
	if (aid != "") {
		alert("Advertisement Deleted!");
		window.location="User.html";
	}
	else
		die();
}

function updateFunction() {
	var aId = document.getElementById("ad-Id").value;
	var uName = document.getElementById("updateName").value;
	var uPhone = document.getElementById("updatePhone").value;
	var uProdName = document.getElementById("updateProdName").value;
	var uSp = document.getElementById("updatePrice").value;
	var uDesc = document.getElementById("updateDesc").value;
	if (aId != "" && uName != "" && uPhone != "" && uProdName != "" && uSp != "" && uDesc != "") {
		alert("Advertisement Updated!");
	}
}

(function() {
	'use strict';
	window.addEventListener('load', function() {
		var forms = document.getElementsByClassName("needs-validation");
		var validation = Array.prototype.filter.call(forms, function(form) {
			form.addEventListener('submit', function(event) {
				if (form.checkValidity() === false) {
					event.preventDefault();
					event.stopPropagation();
				}
				form.classList.add('was-validated');
			}, false);
		});
	}, false);
})();