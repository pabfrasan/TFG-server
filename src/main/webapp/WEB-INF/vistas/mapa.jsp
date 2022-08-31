<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<html>
<script
	src='https://maps.googleapis.com/maps/api/js?key=AIzaSyDHi6RtPGnTNdhbc4OdtphERe3Nm9WR3M8&v=3.exp&libraries=visualization'></script>


<body>

	<div id="map" style="height: 1000px; width: 100%';"></div>
	<script>
    function initialize() {
         var image='logo.png';
         var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        icon:image

      });
    }

    google.maps.event.addDomListener(window, 'load', initialize);
    var heatMapData =[];

    /* Data points defined as a mixture of WeightedLocation and LatLng objects */
	    <c:forEach var="cobertura" items="${data}">
		<c:set var="arrayofmsg" value="${fn:split(cobertura,'@')}"/>
		heatMapData.push({location : new google.maps.LatLng(${arrayofmsg[0]}, ${arrayofmsg[1]}),weight : ${arrayofmsg[2]}});
	</c:forEach>

	var sanFrancisco = new google.maps.LatLng(37.277, -7.000);

	map = new google.maps.Map(document.getElementById('map'), {
		center : sanFrancisco,
		zoom : 13,
		mapTypeId : 'satellite'
	});

	var heatmap = new google.maps.visualization.HeatmapLayer({
		data : heatMapData
	});
	heatmap.set("radius",20);
	heatmap.setMap(map);
  </script>


</body>
</html>