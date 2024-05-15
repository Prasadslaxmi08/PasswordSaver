<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Saver</title>
<style>
  body {
    background-color: #e9ecef; 
    font-family: Arial, sans-serif; 
    display: flex; 
    justify-content: center; 
    align-items: center; 
    height: 100vh; 
    margin: 0;
  }
  h1 {
    color: #343a40;
    margin-bottom: 20px;
  }
  form {
    background-color: #ffffff; 
    padding: 30px; 
    border: 1px solid #ced4da; 
    border-radius: 10px; 
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); 
    max-width: 400px; 
    width: 100%; 
    box-sizing: border-box;
  }
  form div {
    margin-bottom: 20px; 
  }
  label {
    display: block; 
    margin-bottom: 5px; 
    font-weight: bold; 
    color: #495057;
  }
  input[type="text"],
  select {
    width: 100%; 
    padding: 10px; 
    border: 1px solid #ced4da; 
    border-radius: 5px; 
    box-sizing: border-box; 
    font-size: 16px; 
    color: #495057;
  }
  input[type="submit"] {
    width: 100%; 
    padding: 10px; 
    background-color: #007bff; 
    color: white; 
    border: none; 
    border-radius: 5px; 
    cursor: pointer; 
    font-size: 16px; 
    font-weight: bold; 
    transition: background-color 0.3s;
  }
  input[type="submit"]:hover {
    background-color: #0056b3; 
  }
</style>
</head>
<body>
  <form action="passForm" method="post">
    <h1>Password Saver</h1>
    <div>
      <label for="name">Name</label>
      <input type="text" name="name" id="name"/> 
    </div>
    <div>
      <label for="email">Email ID</label>
      <input type="text" name="email" id="email"/> 
    </div>
    <div>
      <label for="pass">Password</label>
      <input type="password" name="pass" id="pass"/> 
    </div>
    <div>
      <input type="submit" value="Submit">
    </div>
  </form> 
</body>
</html>
