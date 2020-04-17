var attempts = 3;
function check_form() {
	var email = document.getElementById("email").value;
	var pass = document.getElementById("pass").value;
	if (email == "akshaykumar625@yahoo.in" && pass == 12345) {
		alert("SuccessFully Logged In");
		document.getElementById("email").value = "";
		document.getElementById("pass").value = "";
		document.writeln("<br><h1>Welcome To Your Profile Akshay</h1>");
		document
				.writeln("<br><a href='User.html'><h3>View Your Profile</h3></a>");

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
