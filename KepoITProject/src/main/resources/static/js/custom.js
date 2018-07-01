var myVar;
		
		function myFunction() {
		    myVar = setTimeout(showPage, 3000);
		}
		
		function showPage() {
		  document.getElementById("loader").style.display = "none";
		  document.getElementById("myDiv").style.display = "block";
		}


//$(document).ready(function(e){
//			$("#err_fullname").hide();
//			$("#err_username").hide();
//			$("#err_pass").hide();
//			$("#err_re_pass").hide();
//
//
//			$("#submit").click(function(e){
//
//				if ($("#fullname").val()=="") {
//					$("#err_fullname").show();
//					$("#err_span_fullname").text("Wajib Diisi!!");
//				}else{
//					$("#err_fullname").hide();
//				}
//
//				if ($("#username1").val()=="") {
//					$("#err_username").show();
//					$("#err_span_username").text("Wajib Diisi!!");
//				}else if($("#username1").val().length < 5){
//					$("#err_username").show();
//					$("#err_span_username").text("Min. 5 Karakter");
//				}
//				else if($("#username1").val().length > 12){
//					$("#err_username").show();
//					$("#err_span_username").text("Min. 12 Karakter");
//				}else{
//					$("#err_username").hide();
//				}
//
//				if ($("#pass").val()=="") {
//					$("#err_pass").show();
//					$("#err_span_pass").text("Wajib Diisi!!");
//				}else if($("#pass").val().length < 5){
//					$("#err_pass").show();
//					$("#err_span_pass").text("Min. 5 Karakter");
//				}
//				else if($("#pass").val().length > 12){
//					$("#err_pass").show();
//					$("#err_span_pass").text("Min. 12 Karakter");
//				}else{
//					$("#err_pass").hide();
//				}
//
//				if ($("#re_pass").val()=="") {
//					$("#err_re_pass").show();
//					$("#err_span_re_pass").text(" Wajib Diisi!!");
//				}else if($("#re_pass").val()== $("#pass").val()){
//					$("#err_re_pass").hide();
//					
//				}else{
//					$("#err_re_pass").show();
//					$("#err_span_re_pass").text("tidak cocok dengan password");
//				}
//
//
//				return false;
//			});
//		});

//function checkPasswordMatch(){
//	var password =$("#txtPassword").val();
//	var confirmPassword = $("$txtConfirmPassword").val();
//	
//	if (password!= confirmPassword )
//		$("#divCheckPasswordMatch").html("Password tidak Sama!");
//	else
//		$("#divCheckPasswordMatch").html("Password Sama");
//	}
//$(document).ready(function(){
//	$("#txtPassword, #txtConfirmPassword").keyup(checkPasswordMatch);
//});

		var password = document.getElementById("password")
	    , confirm_password = document.getElementById("repassword");

	    function validatePassword(){
	    if(password.value != confirm_password.value) {
	    confirm_password.setCustomValidity("Passwords Don't Match");
	    } else {
	    confirm_password.setCustomValidity('');
	    }
	    }
	    password.onchange = validatePassword;
	    confirm_password.onkeyup = validatePassword;
