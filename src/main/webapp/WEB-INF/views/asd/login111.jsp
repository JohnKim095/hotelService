<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login Page</title>
<style>
	.containerOUT{
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
		font-family: arial;
		font-size: 15px;
		width: 500px;
		height: 440px;
		outline: dashed 1px black;
		background-color: #F0F8FF;
		text-align:center;
	}
	.headerfont{
		margin-left:20px;
		font-weight:bold;
		margin-top: 25px;
		font-size:30px;
		padding-top:10px;
	}
	.inputform{
		width: 250px;
		height: 45px;
	}
	.button{
		margin-left:20px;
		background-color:#87CEFA;
		margin-top:30px;
		width:80px;
		height:25px;
		font-weight:bold;
		font-size:15px;
	}
	.button-container {
		display: inline-block;
	}
</style>
</head>
<body>
<div>
	<form name="login" method="post" style="float:right; margin-right:20px;" action="login">
		<div class="containerOUT">
		    <br><br><br>
		    <b style="font-size: 55px;">Login</b>

		    <div class="headerfont" style="margin-left:36.5px;">ID:
		    <input type="text" name="username" class="inputform" placeholder="USERNAME"></input>
		    </div>

		    <div class="headerfont">PW:
		    <input type="text" name="password" class="inputform" placeholder="PASSWORD"/>
		    </div>

		    <div class="button-container">
			    <input type="submit" value="Login" class="button">
			    <input type="submit" value="Register" class="button" formaction="register">
			    <input type="submit" value="Admin" class="button" formaction="menu">
		    </div>
		</div>
	</form>
</div>
</body>
</html>