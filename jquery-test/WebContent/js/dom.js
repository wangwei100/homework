function changeColor() {
	$("#list001 li").attr("style", "color: #0000ff;");
	var btn2Value = $("#btn2").val();
	console.info(btn2Value);
	
	var txtValue = $("#txt").val();
	console.info(txtValue);

	var styleValue = $("#list001 li").attr("style");
	console.info(styleValue);
	
	$("#list002").append("<li>xxxx</li>");
}