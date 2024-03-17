<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <style>
    button {
      top: 50%;
      left: 50%;
    }
  </style>
  <head>
    <title>Review Page</title>
  </head>
  <body>
    <div style="margin-top: 50%;">    
        <button
      style="margin-top: 25%; width: ${x}px ; height: ${y}px ; background-color: ${color}; color: white;"
    >
      This is the Button color
    </button>
</div>

    <div>
      <h1>Cloned Button Details:</h1>
      <p>X: ${x}</p>
      <p>Y: ${y}</p>
      <p>Color: ${color}</p>
    </div>
   

  </body>
</html>
