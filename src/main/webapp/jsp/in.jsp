<h1> WELCOME <h1>

<style>
span
{
	color : red;
}

</style>

<form>

<br>Login<br><input type=text name="uname" value= "${user.uname}" style="width: 218px; "><br>

<input type=password name="upass" style="width: 209px; "> <span>${errorMessage}</span><br><input type=submit value=SUBMIT formaction="displayName" formmethod="post">

</form>

