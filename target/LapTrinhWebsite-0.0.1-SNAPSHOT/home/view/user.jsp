<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<link href="<c:url value='/home/assets/jquery.dataTables.min.css'/>"
	rel="stylesheet" type="text/css">
<script src="<c:url value='/home/assets/jquery.dataTables.min.js'/>"></script>

<div class="container bg-light pb-5">
	<div class="pt-5">
		<div class="row">
			<div class="col-lg-6 offset-lg-3">
				<h3 class="text-center secondary-title pb-3">Danh sách khách
					hàng</h3>
			</div>
		</div>
		<table
			class="table table-hover table-sm table-bordered table-xs-responsive text-center"
			id="table" style="display: table; width: 100%; border: 0px">
			<thead class="bg primary text-white">
				<tr>
					<th>#</th>
					<th>Username</th>
					<th>City</th>
					<th>Districts</th>
					<th>Wards</th>
					<th>Chi tiết</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${users}" varStatus="loop">
					<tr>
						<td>${item.id}</td>
						<td>${item.username}</td>
						<td>${item.txtTinh}</td>
						<td>${item.txtHuyen}</td>
						<td>${item.txtXa}</td>
						<td><a href="user-details?id=${item.id}">Chi tiết</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>




<script>
	$(document).ready(function() {
		$("#table").DataTable({
			"order" : [ [ 0, "desc" ] ]
		});
	});
</script>
