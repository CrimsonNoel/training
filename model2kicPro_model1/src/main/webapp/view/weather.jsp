<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>설문 페이지</title>
<style>
.boxbox {
	width: 85%;
	margin: 10px auto;
	background-color: #fff;
	border-radius: 20px;
	box-shadow: 8px 8px 2px 1px rgba(0, 0, 0, 0.3);
}

body {
	width: 100%;
	height: 100%;
}

.nav {
	text-align: center;
}

.nav a {
	text-decoration: none;
	color: black;
}

.nav a:hover {
	text-decoration: underline;
}
</style>
<script>
	
/*
function onGeoOk(position) {
   const latitude = position.coords.latitude;
   const longitude = position.coords.longitude;

     console.log("현재 위치는 : " + latitude + ", " + longitude)
	document.getElementById('name').innerHTML="현재 위치는 : " + latitude + ", " + longitude;

   fetch(
	 `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=${API_KEY}`;
   )
      .then(response => response.json())
      .then(data => console.log(`온도 : ${data.main.temp}, 날씨 : ${data.weather[0].main}`));
}
*/

navigator.geolocation.getCurrentPosition(onGeoOk, onGeoError);

function onGeoOk(position) {
	   const userlat = position.coords.latitude;
	   const userlon = position.coords.longitude;
	   const API_KEY = 'b822a392b037554745783b87040a79cf';

	   console.log("현재 위치는 : " + userlat + ", " + userlon);
	   
	   document.getElementById('name').innerHTML = "현재 위치는 : " + userlat + ", " + userlon;

	   const apiUrl = "https://api.openweathermap.org/data/2.5/weather?lat="+userlat+"&lon="+userlon+"&appid="+API_KEY
	   console.log(apiUrl); 
	   
	   fetch(apiUrl)
	      .then(response => response.json())
	      .then(data => {
	         console.log('장소 :'+ data.name +', 날씨 :'+ data.weather[0].main )
	         document.getElementById('name1').innerHTML = '장소 :'+ data.name +', 날씨 :'+ data.weather[0].main;
	      })
	      .catch(error => {
	         console.error("날씨 정보를 불러오는 중 오류가 발생했습니다.", error);
	      });
	}


function onGeoError() {
	switch(error.code) {
    case error.PERMISSION_DENIED:
    loc.innerHTML = "이 문장은 사용자가 Geolocation API의 사용 요청을 거부했을 때 나타납니다!"
    break;

    case error.POSITION_UNAVAILABLE:
    loc.innerHTML = "이 문장은 가져온 위치 정보를 사용할 수 없을 때 나타납니다!"
    break;

    case error.TIMEOUT:
    loc.innerHTML = "이 문장은 위치 정보를 가져오기 위한 요청이 허용 시간을 초과했을 때 나타납니다!"
    break;

    case error.UNKNOWN_ERROR:
    loc.innerHTML = "이 문장은 알 수 없는 오류가 발생했을 때 나타납니다!"
    break;
}
}


	
	
	function newtab() {
		window.open('${pageContext.request.contextPath}/view/weather.jsp',
				'_blank');
	}

	function tabclose() {
		window.close();
	}
</script>
</head>
<body style="background-color: rgba(220, 220, 220, 0.8);">
	<nav>
		<button onClick="requestCoords()" type="button"
			class="me-5 mt-3 btn btn-outline-dark  position-absolute top-0 start-0 translate-middle-x"
			style="margin-left: 50px; -bs-btn-padding-y: .25rem; - -bs-btn-padding-x: .5rem; - -bs-btn-font-size: 1 rem;">
			클릭</button>

		<button onClick="newtab()" type="button"
			class="me-5 mt-3 btn btn-outline-dark  position-absolute top-0 end-50 translate-middle-x"
			style="-bs-btn-padding-y: .25rem; - -bs-btn-padding-x: .5rem; - -bs-btn-font-size: 1 rem;">
			열기</button>

		<button onClick="tabclose()" type="button"
			class="me-5 mt-3 btn btn-outline-dark  position-absolute top-0 end-0 translate-middle-x"
			style="-bs-btn-padding-y: .25rem; - -bs-btn-padding-x: .5rem; - -bs-btn-font-size: 1 rem;">
			닫기</button>
	</nav>
	<div class="header row m-0 p-3">
		<!-- 설문 헤더 -->
		<div class="h1 m-0 p-5 fw-bold">나에게 맞는 향수 찾기</div>
		<div id="name"></div><div id="name1"></div>

	</div>

	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
		crossorigin="anonymous">

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>