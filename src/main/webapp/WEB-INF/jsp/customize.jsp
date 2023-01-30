<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose</title>
</head>
<body>
<form action="/hero" method="post">
    <select name="movement" id="movement">
        <option value="Horse">Horse</option>
        <option value="Feet">Feet</option>
    </select><br>
    <select name="weapon" id="weapon">
        <option value="Sword">Sword</option>
        <option value="Bow">Bow</option>
        <option value="Wand">Wand</option>
    </select><br>
    <button type="submit">Lets go</button>
</form>
</body>
</html>
