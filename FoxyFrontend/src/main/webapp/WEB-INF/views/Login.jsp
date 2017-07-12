<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Header.jsp"%>

<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body style="background-color:#cc00ff">
 <div class="form-control" id="frsDivTop">
            <hr id="top"/>
            
            <div id="frstDiv">
                <h2>

                  <div style="background-color : rgba(0,0,0,0.5); border-radius:5px;"> <marquee direction ="right"  behaviour = "alternate"><span style="color : #ff1493;" class = "glyphicon glyphicon-heart" ></span></marquee>
                    </div>
					
					<div align="center">
					
					<form action="perform_login" method="POST" autocomplete="off">
    					<h2 style="color : white; font-family:Calligrapher;">Login Here</h2><br>
    					
    		    <br/><br/>
<input type="text" name="username" placeholder="username" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    					<br/><br/>
						
						<input type="text" name="password" placeholder="password" autofocus="autofocus" style="border-radius : 10px; padding : 5px" >
    	                    <br/><br/>
    	                    
    	                    <input type="submit" name="sub" value="Login" class="btn btn-primary">
    				</form><br/><br/>
    		    