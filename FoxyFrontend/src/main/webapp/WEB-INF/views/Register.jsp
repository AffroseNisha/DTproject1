<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Header.jsp"%>


<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color:#cc00ff">

 <div class="form-control" id="frsDivTop">
            <hr id="top"/>
            
            <div id="frstDiv">
                <h2>

                  <div style="background-color : rgba(0,0,0,0.5); border-radius:5px;"> <marquee direction ="right"  behaviour = "alternate"><span style="color : #ff1493;" class = "glyphicon glyphicon-heart" ></span></marquee>
                    </div>
					
					<div align="center">
    		    <br/><br/>
    		    <div id="form" style=" ">
    				<form action="xyz" method="POST" autocomplete="off">
    					<h2 style="color : white; font-family:Calligrapher;">Register Here</h2><br>
    					
    					
						
					<input type="text" name="username" placeholder="username" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    					<br/><br/>
						
						<input type="text" name="custname" placeholder="yourname" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    					<br/><br/>
						
						
						
						
	<input type="email" name="email" placeholder="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Eg:afra@abc.zzz" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    					<br/><br/>
    					
    					
<input type="text" name="mobile" placeholder="mobile" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    					<br/><br/>
    					
<input type="text" name="address" placeholder="address" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    	                    <br/><br/>
    	                    
<input type="text" name="password" placeholder="password" minlenght="6" maxlenght="15" title="5-15 character needed" required  style="border-radius : 10px;padding : 5px" ><br><br>
<br/><br/>

    					
    					
<input type="submit" name="sub" value="Register" class="btn btn-primary">
    				</form><br/><br/>
    				</div>
    				</div>
    				</h2>
    				</div>
    				</div>
    				</body>
    				</html>