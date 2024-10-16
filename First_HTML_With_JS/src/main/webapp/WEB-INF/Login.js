/**
 * 
 */

 function checkemail(){
	 var em = document.getElementById("mail").value
	 
	 var eml = /\s+\@+\s+\.+\s+/.test(em)
	 
	 if(eml){
		 document.getElementById("emsg").innerHTML = "Correct Email...."
	 }
	 else{
		 document.getElementById("emsg").innerHTML = "InCorrect Email..."
	 }
 }
 
 function checkpass(){
	 var ps = document.getElementById("pass").value
	 
	 var pss = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\W).{8,}/.test(ps)
	 
	 if(pss){
		 document.getElementById("passmsg").innerHTML = "Correct Pass"
	 }
	 else{
		 document.getElementById("passmsg").innerHTML = "InCorrect Pass"
	 }
 }