<%@ page language="java" contentType="text/html"%>
<%@include file="WEB-INF/views/Header.jsp" %>




<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

     <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="https://s1.thcdn.com/widgets/121-us/33/No7-4-carousel-homepage-1180x360-123233.jpg"alt="happy" style="width:100%;">
</div>
      <div class="item">
	  <img src="https://s1.thcdn.com/widgets/95-en/07/Lancer-The3StepMethod-carousel-homepage-1180x360-095207.jpg" alt="Hello" style="width:100%">
      </div>
    
      <div class="item">
        <img src="https://s1.thcdn.com/widgets/128-us/39/Mybody-4-carousel-homepage-1180x360-115939.jpg" alt="New york" style="width:100%;">
      </div>
    </div>
	
	
	
	

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<br>
<br>
<%@include file="WEB-INF/views/Footer.jsp" %>


</body>
</html>
