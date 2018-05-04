<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>jquery test</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>


</head>

<body>

<input id="txt" type="text" />
<input id="btnOK" type="button" value="OK" onclick="clickBtn();"/>

</body>

<script type="text/javascript">
function clickBtn(){
	alert("ok");
	$("#txt").val("123");
	var value = $("#txt").val();
	console.info(value);
	//alert(value);
}
//clickBtn();
</script>

</html>