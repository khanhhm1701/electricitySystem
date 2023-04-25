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
				<h3 class="text-center secondary-title pb-3">Thông tin khách
					hàng</h3>
			</div>
		</div>
		<table class="table text-center">
			<tbody>
				<tr>
					<td>Mã khách hàng: </td>
					<td>#${user.id}</td>
				</tr>
				<tr>
					<td>Username: </td>
					<td>${user.username}</td>
				</tr>
				<tr>
					<td>Email: </td>
					<td>${user.email}</td>
				</tr>
				<tr>
					<td>Address: </td>
					<td>${user.txtXa}, ${user.txtHuyen }, ${user.txtTinh}</td>
				</tr>
			</tbody>
		</table>
		<table
			class="table table-hover table-sm table-bordered table-xs-responsive text-center"
			id="table" style="display: table; width: 100%; border: 0px">
			<thead class="bg primary text-white">
				<tr>
					<th>#</th>
					<th>Thời gian</th>
					<th>Số điện</th>
					<th>Số tiền</th>
					<th>Tình trạng</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${bills}" varStatus="loop">
					<tr>
						<td>${item.id}</td>
						<td>${item.month}/${item.year }</td>
						<td>${item.sodien}</td>
						<td>${item.tongtien}</td>
						<c:if test="${item.status == 0}">
							<td><div class="badge badge-primary p-2">Chưa thanh toán</div></td>
						</c:if>
						<c:if test="${item.status == 1}">
							<td><div class="badge success p-2">Đã thanh toán</div></td>
						</c:if>
						<c:if test="${item.status == 2}">
							<td><div class="badge badge-warning p2">Quá hạn</div></td>
						</c:if>
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
