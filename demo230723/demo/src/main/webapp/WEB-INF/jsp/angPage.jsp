<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Spring Boot AngularJS example</title>
<script type="text/javascript">
            var app = angular.module("StudentManagement", []);
 
            //Controller Part
            app.controller("StudentController", function($scope, $http) {
 
                $scope.customers = [];
                $scope.button = "add";
                $scope.studentForm = {
                    studentFname : "",
                    studentLname : "",
                    studentAge : "",
                    studentGender : "",
                    studentAddress : "",
                    studentUsername : "",
                    studentPassword : "",
                    studentEmailId : ""
                };
 
                //Now load the data from server
                _refreshCustomerData();
 
                //HTTP POST/PUT methods for add/edit customer 
                // with the help of id, we are going to find out whether it is put or post operation
 
                $scope.submitCustomer = function() {
 
                    var method = "";
                    var url = "";
 				if($scope.button == "add") {
                    $http({
                        method : "POST",
                        url : '/student/add',
                        data : angular.toJson($scope.studentForm),
                        headers : {
                            'Content-Type' : 'application/json'
                        }
                    }).then( _success, _error );
                 } else {   
                     $http({
                        method : "POST",
                        url : '/student/update',
                        data : angular.toJson($scope.studentForm),
                        headers : {
                            'Content-Type' : 'application/json'
                        }
                    }).then( _success, _error );
                    }
                };
 
                function _refreshCustomerData() {
                
                $scope.button = "add";
                    $http({
                        method : 'GET',
                        url : 'http://localhost:8080/student/views'
                    }).then(function successCallback(response) {
                    console.log('response --> ', response);
                        $scope.students = response.data;
                        console.log('students --> ', $scope.students);
                    }, function errorCallback(response) {
                        console.log(response.statusText);
                    });
                }
                
                $scope.editStudent = function (student){
                $scope.button = "update";
                $scope.studentForm.studentId = student.studentId;
                $scope.studentForm.studentFname = student.studentFname;
                $scope.studentForm.studentLname = student.studentLname;
                $scope.studentForm.studentAge = student.studentAge;
                $scope.studentForm.studentGender = student.studentGender;
                $scope.studentForm.studentAddress = student.studentAddress;
                $scope.studentForm.studentUsername = student.studentUsername;
                $scope.studentForm.studentPassword = student.studentPassword;
                $scope.studentForm.studentEmailId = student.studentEmailId;
                
                }
                
                $scope.deleteStudent = function (student){
                 $http({
                        method : "GET",
                        url : '/student/deleteStudent/' + student.studentId
                    }).then( _success, _error );
                
                }
 
                function _success(response) {
                    _refreshCustomerData();
                    _clearFormData();
                }
 
                function _error(response) {
                    console.log(response.statusText);
                }
                
                 function _clearFormData() {
 					$scope.studentForm.studentId = '';
                $scope.studentForm.studentFname = '';
                $scope.studentForm.studentLname = '';
                $scope.studentForm.studentAge = '';
                $scope.studentForm.studentGender = '';
                $scope.studentForm.studentAddress = '';
                $scope.studentForm.studentUsername = '';
                $scope.studentForm.studentPassword = '';
                $scope.studentForm.studentEmailId = '';
                };
 
            });
        </script>
<style>
.blue-button {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}

.red-button {
	background: #CD5C5C;
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #CD5C5C
}

table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}

caption {
	text-align: left;
	color: silver;
	font-weight: bold;
	text-transform: uppercase;
	padding: 5px;
}

th {
	background: SteelBlue;
	color: white;
}

tbody tr:nth-child(even) {
	background: WhiteSmoke;
}

tbody tr td:nth-child(2) {
	text-align: center;
}

tbody tr td:nth-child(3), tbody tr td:nth-child(4) {
	text-align: center;
	font-family: monospace;
}

tfoot {
	background: SeaGreen;
	color: white;
	text-align: right;
}

tfoot tr th:last-child {
	font-family: monospace;
}

td, th {
	border: 1px solid gray;
	width: 25%;
	text-align: left;
	padding: 5px 10px;
}
</style>
<head>
<body ng-app="StudentManagement" ng-controller="StudentController">
	<h1>Student Registration Page</h1>
	<form ng-submit="submitCustomer()">
		<table>
			<tr>
				<th>Enter Student First Name :</th>
				<td><input type="text" ng-model="studentForm.studentFname" /></td>
			</tr>
			<tr>
				<th>Enter Student Last Name :</th>
				<td><input type="text" ng-model="studentForm.studentLname" /></td>
			</tr>
			<tr>
				<th>Enter Student Age :</th>
				<td><input type="text" ng-model="studentForm.studentAge" /></td>
			</tr>
			<tr>
				<th>Select Student Gender:</th>
				<td><select ng-model="studentForm.studentGender">
						<option value="male">Male</option>
						<option value="female">Female</option>
						<option value="others">Others</option>
				</select></td>
			</tr>
			<tr>
				<th>Enter Student Address :</th>
				<td><textarea ng-model="studentForm.studentAddress"></textarea></td>
			</tr>
			<tr>
				<th>Enter Student Email Id :</th>
				<td><input type="text" ng-model="studentForm.studentEmailId" />
					</textarea></td>
			</tr>
			<!--  <tr><th>Select Student Profile :</th> <td><input type="file" name="studentForm.profilePic"/></td></tr> -->
			<tr>
				<th>Enter Student Username :</th>
				<td><input type="text" ng-model="studentForm.studentUsername" /></td>
			</tr>
			<tr>
				<th>Enter Student Password :</th>
				<td><input type="password"
					ng-model="studentForm.studentPassword" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value={{button}}
					class="blue-button" /></td>
			</tr>

		</table>
	</form>
	<table>
		<tr>

			<th>Student Id</th>
			<th>Student Pic</th>
			<th>Student First Name</th>
			<th>Student Last Name</th>
			<th>Student Age</th>
			<th>Student Gender</th>
			<th>Student Address</th>
			<th>Student Username</th>
			<th>Student Password</th>
			<th>Operations</th>

		</tr>

		<tr ng-repeat="stud in students">

			<td>{{stud.studentId}}</td>
			<td><img src=${student.getStudProfilePic()}></td>
			<td>{{stud.studentFname}}</td>
			<td>{{stud.studentLname}}</td>
			<td>{{stud.studentAge}}</td>
			<td>{{stud.studentGender}}</td>
			<td>{{stud.studentAddress}}</td>
			<td>{{stud.studentUsername}}</td>
			<td>{{stud.studentPassword}}</td>
			<td><a ng-click="editStudent(stud)" class="blue-button">Edit</a>
				| <a ng-click="deleteStudent(stud)" class="red-button">Delete</a></td>
		</tr>

	</table>
</body>
</html>
