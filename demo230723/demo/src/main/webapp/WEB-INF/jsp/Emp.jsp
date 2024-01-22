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
            var app = angular.module("EmpManagement", []);
 
            //Controller Part
            app.controller("EmpController", function($scope, $http) {
 
                $scope.button = "add";
                $scope.empForm = {
                    empName : "",
                    empAge : "",
                    dept : ""
                };
 
                //Now load the data from server
                viewEmpData();
                
                loadDeptData();
                
                loadMgrData();
 
                //HTTP POST/PUT methods for add/edit customer 
                // with the help of id, we are going to find out whether it is put or post operation
 
                $scope.submitEmp = function() {
                    var method = "";
                    var url = "";
                    $http({
                        method : "POST",
                        url : '/emp/add',
                        data : angular.toJson($scope.empForm),
                        headers : {
                            'Content-Type' : 'application/json'
                        }
                    }).then( empSuccess, empError );
                };
 
                function _refreshCustomerData() {
                
                $scope.button = "add";
                    $http({
                        method : 'GET',
                        url : 'http://localhost:8080/student/views'
                    }).then(function successCallback(response) {
                        $scope.students = response.data;
                    }, function errorCallback(response) {
                        console.log(response.statusText);
                    });
                }
                
                function viewEmpData () {
                	var method = "";
                    var url = "";
                    $http({
                        method : "POST",
                        url : '/emp/viewAll'
                    }).then(function successCallback(response) {
                    	$scope.emps = response.data;
                    })
                }
                
                function loadDeptData () {
                	var method = "";
                    var url = "";
                    $http({
                        method : "POST",
                        url : '/dept/viewAll'
                    }).then(function successCallback(response) {
                    	$scope.deptData = response.data;
                    })
                }
                
                 function loadMgrData () {
                	var method = "";
                    var url = "";
                    $http({
                        method : "POST",
                        url : '/mgr/viewAll'
                    }).then(function successCallback(response) {
                    	$scope.mgrData = response.data;
                    })
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
                
                function empSuccess(response) {
                	viewEmpData();
                }
                
                function empError(response) {
                	alert("Emp not Added Successfully");
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
<body ng-app="EmpManagement" ng-controller="EmpController">
	<h1>Employee Registration Page</h1>
	<form ng-submit="submitEmp()">
		<table>
			<tr>
				<th>Emp Name :</th>
				<td><input type="text" ng-model="empForm.empName" /></td>
			</tr>
			<tr>
				<th>Emp Age :</th>
				<td><input type="text" ng-model="empForm.empAge" /></td>
			</tr>
			<tr>
				<th>Emp Dept :</th>
				<td><select data-ng-options="dept.deptName for dept in deptData" ng-model="empForm.dept">
				<option value="">--Select Dept--</option></select></td>
			</tr>
			<tr>
				<th>Emp Mgr:</th>
				<td><select data-ng-options="mgr.mgrName for mgr in mgrData" ng-model="empForm.mgr">
				<option value="">--Select Mgr--</option></select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value={{button}}
					class="blue-button" /></td>
			</tr>

		</table>
	</form>
	<table>
		<tr>

			<th>Emp Id</th>
			<th>Emp Name</th>
			<th>Emp Age</th>
			<th>Emp Dept</th>
			<th>Emp Mgr</th>
			<!-- <th>Operations</th> -->

		</tr>

		<tr ng-repeat="emp in emps">

			<td>{{emp.empId}}</td>
			<td>{{emp.empName}}</td>
			<td>{{emp.empAge}}</td>
			<td>{{emp.dept.deptName}}</td>
			<td>{{emp.mgr.mgrName}}</td>
			<!-- <td><a ng-click="editStudent(stud)" class="blue-button">Edit</a>
				| <a ng-click="deleteStudent(stud)" class="red-button">Delete</a></td> -->
		</tr>

	</table>
</body>
</html>
