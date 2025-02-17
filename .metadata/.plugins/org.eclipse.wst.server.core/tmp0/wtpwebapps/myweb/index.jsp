<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Fun Web</title>
<link href="/css/default.css" rel="stylesheet" type="text/css" media="all">
<link href="/css/front.css" rel="stylesheet" type="text/css" media="all">
<link href="/css/print.css" rel="stylesheet" type="text/css" media="print">
<link href="/css/iphone.css" rel="stylesheet" type="text/css" media="screen">
<script type="text/javascript" src="/script/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="/script/s3Slider.js"></script>
<script type="text/javascript">
$(document).ready(function() { 
   $('#s3slider').s3Slider({ 
      timeOut: 4000 
   });
 });
</script>
</head>

<body>
<div id="wrap">
	<%-- header 영역  include top.jsp --%>
	<jsp:include page="/include/top.jsp" />
	
    <div class="clear"></div>
    <div id="main_img">
		<!--  s3Slider -->
		<div id="s3slider">
			<ul id="s3sliderContent">
				<li class="s3sliderImage">
					<img src="/images/main_img.jpg" width="971" height="282">
					<span>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam semper erat est. <br>
						Aliquam metus elit, blandit eu luctus vitae, dictum sit amet mauris. Integer ut facilisis eros. <br>
						Donec consectetur, velit id aliquam sagittis,</span>
				</li>
				<li class="s3sliderImage">
					<img src="/images/main_img1.jpg" width="971" height="282">
					<span>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam semper erat est. <br>
						Aliquam metus elit, blandit eu luctus vitae, dictum sit amet mauris. Integer ut facilisis eros. <br>
						Donec consectetur, velit id aliquam sagittis,</span>
				</li>
				<li class="s3sliderImage">
					<img src="/images/main_img2.jpg" width="971" height="282">
					<span>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam semper erat est. <br>
						Aliquam metus elit, blandit eu luctus vitae, dictum sit amet mauris. Integer ut facilisis eros. <br>
						Donec consectetur, velit id aliquam sagittis,</span>
				</li>
				<div class="clear s3sliderImage"></div>
			</ul>
		</div>
		<!--  s3Slider -->
	</div>
	
	<div class="clear"></div>
	<article id="front">
	
	<div id="solution">	
        <div id="hosting">
            <h3>Web Hosting Solution</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur nunc urna, 
				fringilla non fringilla ut, lacinia eu urna. Aliquam nec urna at nisi pulvinar eleifend. 
				Duis commodo luctus leo vitae feugiat. Curabitur ac sodales ante. Ut vel est </p>
        </div>
       
        <div id="security">
			<h3>Web Security Solution</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur nunc urna, 
				fringilla non fringilla ut, lacinia eu urna. Aliquam nec urna at nisi pulvinar eleifend. 
				Duis commodo luctus leo vitae feugiat. Curabitur ac sodales ante. Ut vel est </p>
        </div>
       
        <div id="payment">
			<h3>Web payment Solution</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur nunc urna, 
				fringilla non fringilla ut, lacinia eu urna. Aliquam nec urna at nisi pulvinar eleifend. 
				Duis commodo luctus leo vitae feugiat. Curabitur ac sodales ante. Ut vel est </p>
		</div>
	</div>
	
	<div class="clear"></div>
	<div id="sec_news">
		<h3><span class="orange">Security</span> News</h3>
		<dl>
			<dt><a href="#">Vivamus id ligula velit, quis euismod nisi</a></dt>
			<dd><a href="#">Proin quis ante eget arcu tempus tempus porta vel ipsum. 
					Quisque vitae nulla vel lorem cursus dignissim. Sed sit amet metus tortor. 
					In hac habitasse platea dictumst. Aliquam erat volutpat. Aliquam massa risus, </a></dd>
			<dt><a href="#">Vivamus id ligula velit, quis euismod nisi</a></dt>
			<dd><a href="#">Proin quis ante eget arcu tempus tempus porta vel ipsum. 
					Quisque vitae nulla vel lorem cursus dignissim. Sed sit amet metus tortor. 
					In hac habitasse platea dictumst. Aliquam erat volutpat. Aliquam massa risus, </a></dd>
		</dl>
	</div>
	
	<div id="news_notice">
		<h3 class="brown">News &amp; Notice</h3>
        <table>
			<tr>
				<td class="contxt"><a href="#">Vivamus id ligula velit, quis euismod nisi </a></td>
				<td><a href="#">2011.07.31</a></th>
			</tr>
			<tr>
				<td class="contxt">Fusce eros augue, tempus nec interdum eu</td>
				<td>2011.06.11</td>
			</tr>
			<tr>
				<td class="contxt">Donec eget tincidunt purus</td>
				<td>2011.05.12</td>
			</tr>
			<tr>
				<td class="contxt">Nam facilisis mauris in dui suscipit volutpat </td>
				<td>2011.05.08</td>
			</tr>
			<tr>
				<td class="contxt">Aenean in dui mollis leo ullamcorper fringilla </td>
				<td>2011.04.25</td>
			</tr>
        </table>
	</div>
	
    </article>
	
	<div class="clear"></div>
	<%-- footer 영역  include bottom.jsp --%>
	<jsp:include page="/include/bottom.jsp"/>
</div>

</body>
</html>
