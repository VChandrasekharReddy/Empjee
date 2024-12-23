<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            height: 100vh;
            width: 100vw;
            display:flex;
            flex-direction: column;
            align-items: center;
            justify-content:center;
        }
        form{

            height: fit-content;
            padding: 10px;
            border: 1px solid gray;
        }
        input{
            height: 3vh;
            width: 10vw;
        }
        
    </style>
</head>
<body>
    <form action="../../AddEmp" method="POST">
        <label for="id">Id : </label>
        <input type="number" name="id" id="id"><br>
        <label for="name">Name : </label>
        <input type="text" name="name" id="name"><br>
        <label for="dipartment">dipartment</label>
        <input type="text" name="dipartment" id="dipartment"><br>
    <label for="salary">Salary:</label>
    <input type="text" id="salary" name="salary" required><br>
        <button type="submit">Search</button>
    </form>
</body>
</html>