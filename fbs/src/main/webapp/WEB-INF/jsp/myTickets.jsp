<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="icon" type="image/x-icon" href="../image/icooon.PNG">
<script src="https://kit.fontawesome.com/1f3c3cb2ad.js"
	crossorigin="anonymous"></script>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Tickets History</title>
<style>
* {
	padding: 0%;
	margin: 0%;
	box-sizing: border-box;
}

#screen {
	width: 100%;
	/* height: 700px; */
	/* border: 1px solid red; */
	font-family: Arial, Helvetica, sans-serif;
	display: flex;
	flex-wrap: wrap;
	justify-content: space-around;
}

#top-info {
	border: 1px solid #afa9a9;
	width: 90%;
	background-color: #f2f2f2;
	margin-top: 3%;
}

#top-info>div:nth-child(1) {
	float: left;
	margin-left: 2%;
	padding: 1%;
}

#top-info>div:nth-child(1)>h3 {
	padding: 5px;
	font-size: 2vw;
}

#body {
	width: 90%;
	/* border: 5px solid red; */
	overflow-y: auto;
	height: 450px;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 1.5%;
	text-align: center;
	border: 1px solid #afa9a9;
}

th {
	background-color: #f2f2f2;
	font-size: 1.5vw;
}

th:nth-child(2) {
	text-align: center;
}

td:nth-child(2) {
	text-align: left;
}

td:nth-child(3) {
	text-align: left;
}

th:nth-child(1), th:nth-child(4) {
	width: 150px;
}

th:nth-child(2), th:nth-child(3) {
	width: 35%;
}

td:last-child {
	text-align: center;
}

#action {
	width: 100%;
}

#action>span:nth-child(1) {
	border: 2px solid blue;
	padding: 8%;
	border-radius: 4px;
	color: blue;
}

#action>span:nth-child(2) {
	border: 2px solid purple;
	padding: 8%;
	border-radius: 4px;
	color: red;
}
</style>
</head>
<%@ include file="homepageNavbar.jsp"%>
<body>
	<div id="screen">
		<div id="top-info">
			<div>
				<h3>My Ticket History</h3>
			</div>
		</div>
		<div id="body">
			<table>
				<thead>
					<tr>
						<th>Sr. No.</th>
						<th>Information</th>
						<th>Flights info</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="f" items="${f[1]}">
						<tr>
							<td>
								<div>${f.getTicketId()}</div>
							</td>
							<td>
								<div>
									<b>Name: </b>${f.getName()}
								</div>
								<div>
									<b>Contact: </b>${f.getContact()}
								</div>
								<div>
									<b>Gender: </b>${f.getGender()}
								</div>
								<div>
									<b>Seats: </b>${f.getSeatsBooked()}
								</div>
								<div>
									<b>Total price: </b>${f.getSeatsCost()}
								</div>
							</td>
							<td>
								<div>
									<b>Plane No:</b> ${f.flight.getPlaneNo()}
								</div>
								<div>
									<b>Airline:</b> ${f.flight.airline.getAirlineName()}
								</div>
								<div>
									<b> Departure-Location:</b>
									${f.flight.departureAirport.getAirportName()}
									${f.flight.departureAirport.getAirportLocation()}
									<div>
										<b>Arrival-Location:</b>
										${f.flight.arrivalAirport.getAirportName()}
										${f.flight.arrivalAirport.getAirportLocation()}
									</div>
									<div>
										<b>Departure:</b> ${f.flight.getDepartureDate()}
									</div>
									<div>
										<b>Arrival:</b>${f.flight.getArrivalDate()}</div>
							</td>

							<td>
								<div id="action">
									<!-- <span id="formedit"><i class="fa-regular fa-pen-to-square"></i></span>  -->
									<span><i class="fa-solid fa-trash-can"></i></span> <span><a class="href3"
										href="genPdfById?TicketId=${f.getTicketId()}"><i
											class="fa-solid fa fa-print"></i></a></span>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
