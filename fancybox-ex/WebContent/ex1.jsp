<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fancybox 예제</title>
<link rel="stylesheet" type="text/css" href="css/jquery.fancybox.min.css">
<link rel="stylesheet" type="text/css" href="css/core.css">
<script src="js/jquery-3.5.1.min.js"></script>
<script src="js/jquery.fancybox.min.js"></script>
<script src="js/core.js"></script>
</head>
<body>
<button id="img-btn">이미지 오픈</button>
</body>
<script type="text/javascript">
	$("#img-btn").on("click", function(){
		
		var img_array = ["img/1.jpg", "img/2.jfif", "img/3.jpg", "img/4.jpg"];
		
		var instance = $.fancybox.open(
			{
				src: img_array[0],
				opts : {
					thumb   : img_array[0]
				}
			},
			{
				loop : false
			}
		);
		
		for(var i = 1 ; i < img_array.length ; i++){
			instance.addContent({
				src: img_array[i],
				opts : {
					thumb   : img_array[0]
				}
			});
		}
		
	});
</script>
</html>