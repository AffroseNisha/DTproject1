<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Header.jsp"%>


<title>ContactUs</title>
<h2 align="center">Contact Us</h2>


	<div class="jumbotron jumbotron-sm">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-lg-12">
					<h1 class="h1">
						Contact us <small> Just Feel free to contact us</small>
					</h1>
				</div>
			</div>
		</div>
	</div><br><br>
	<div class="container">

		<div class="row text-center">
			<div class="col-sm-3 col-xs-6 first-box">
				<h1>
					<span class="glyphicon glyphicon-earphone"></span>
				</h1>
				<h3>Phone</h3>
				<p>+918608148003</p>
				<br>
			</div>
			<div class="col-sm-3 col-xs-6 second-box">
				<h1>
					<span class="glyphicon glyphicon-home"></span>
				</h1>
				<h3>Location</h3>
				<p> Chennai</p>
				<br>
			</div>
			<div class="col-sm-3 col-xs-6 third-box">
				<h1>
					<span class="glyphicon glyphicon-send"></span>
				</h1>
				<h3>E-mail</h3>
				<p>afranishuma@gmail.com</p>
				<br>
			</div>
			<div class="col-sm-3 col-xs-6 fourth-box">
				<h1>
					<span class="glyphicon glyphicon-leaf"></span>
				</h1>
				<h3>Web</h3>
				<p>www.Foxy.com</p>
				<br>
			</div>
		</div>
	</div>
	<br>
	<br><br><br>
	<!-- <div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="well well-sm">
					<form>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="name"> Name</label> <input type="text"
										class="form-control" id="name" placeholder="Enter name"
										required="required" />
								</div>
								<div class="form-group">
									<label for="email"> Email Address</label>
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-envelope"></span> </span> <input
											type="email" class="form-control" id="email"
											placeholder="Enter email" required="required" />
									</div>
								</div>
								<div class="form-group">
									<label for="subject"> Subject</label> <select id="subject"
										name="subject" class="form-control" required="required">
										<option value="na" selected="">Choose One:</option>
										<option value="service">General Customer Service</option>
										<option value="suggestions">Suggestions</option>
										<option value="product">Product Support</option>
									</select>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="name"> Message</label>
									<textarea name="message" id="message" class="form-control"
										rows="9" cols="25" required="required" placeholder="Message"></textarea>
								</div>
							</div>
							<div class="col-md-12">
								<button type="submit" class="btn btn-primary pull-right"
									id="btnContactUs">Send Message</button>
							</div>
						</div>
					</form>
				</div>
			</div> -->
			<div class="col-md-4">
				<form>
            <span class="glyphicon glyphicon-globe"></span> Our office
            <address>
                <strong>Foxy</strong><br>
                18/20 Madurai veeran koit street<br>
                T.Nagar,Chennai-600017<br>
                <abbr title="Phone">
                    PH:</abbr>
                +918608148003
            </address>
            <address>
                <strong>Affrose</strong><br>
                <a href="mailto:#">afranishuma@gmail.com</a>
            </address>
            </form>
			</div>
		</div>
	</div>
</body>
</html>

</body>
</html>