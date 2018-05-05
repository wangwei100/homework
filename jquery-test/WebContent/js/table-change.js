function insert() {
	var name = $("#txtName").val();
	var chinese = $("#txtChinese").val();
	var math = $("#txtMath").val();
	var tr = "<tr>" 
		+"<td>"+ name +"</td>"
		+"<td>"+ chinese+"</td>"
		+"<td>"+ math+"</td>"
		+ "</tr>";
	$("#tb tbody").append(tr);
}