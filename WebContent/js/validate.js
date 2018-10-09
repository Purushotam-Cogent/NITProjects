/**
 * 
 */
 
 function validate(){
	if(document.getElementById('name').value=="")
		{
		alert('User Name cant be blank' );
		document.getElementById('name').value="";
		document.getElementById('name').focus();
		return false;
		}
	if(document.getElementById('pass1').value=="")
		{
		alert('Enter Password to continue ');
		document.getElementById('pass1').value="";
		document.getElementById('pass1').focus();
		return false;
		}
	if(document.getElementById('pass2').value=="")
	{
	alert('Enter Password to continue ');
	document.getElementById('pass2').value="";
	document.getElementById('pass2').focus();
	return false;
	}
	
	if(document.getElementById('pass1').value!=
		document.getElementById('pass2').value)
	{
	alert('Password not matched pls enter re-password' );
	document.getElementById('pass2').value="";
	document.getElementById('pass2').focus();
	return false;
	}
	return true;	
}
 