<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<style>   

Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: orange;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         } 
           
 form {   
        border: 3px solid #f1f1f1;   
        width: 50%; 
        margin-left: 25%;
    }   
    
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .loginform {   
        padding: 25px;   
        background-color: lightblue;  
        width: 88.4;   
    }   
    img {
     height: 80px;
    width: 200px;
       margin-left: 170px;
    }
</style>   
</head>    
<body>    
    <center> <h1> Student Login Form </h1> </center>   
    <form method="post" action="/student/studentLogin">  
        <div class="loginform"> 
        	<img src = "../image/Decodetech.jpg">  
        	<br>
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="studentUsername" required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="studentPassword" required>  
            <button type="submit">Login</button>   
            <a href="getStudentForm"> New User Register? </a>   
        </div>   
    </form>     
</body> 
</html>