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
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
           ;
        }
        button{
            height: fit-content;
            width: fit-content;
            margin: 10px;
            padding: 10px;
            border:1px solid black;
            border-radius: 3px;
            background-color: rgb(150, 227, 161);

        }
    </style>
</head>
<body>
    <a href="public/jspfiles/searchemp.jsp"><button>search Employee</button></a>
    <a href="public/jspfiles/addemp.jsp"><button>Add the Employee</button></a>
</body>
</html>