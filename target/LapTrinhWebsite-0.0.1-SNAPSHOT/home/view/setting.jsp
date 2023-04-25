<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container bg-light pb-5">
	<div class="pt-5">
		<div class="row">
			<div class="col-lg-6 offset-lg-3">
				<h3 class="text-center secondary-title pb-3">CẤU HÌNH HỆ THỐNG</h3>
				<p class="text-primary text-center font-weight-bold">${message}</p>
				<form method="POST" action="setting" id="form">
					<input type="hidden" name="action" value="submit"">
					<div class="form-group">
						<label><span class="text-danger">*</span> Ngày áp dụng: </label> <input type="date" name="date"
							class="form-control">
					</div>
					<div class="form-group">
						<label><span class="text-danger">*</span> Chọn loại điện: </label> <select class="form-control"
							id="type" name="type">
							<option value="0" disabled selected>CHỌN LOẠI ĐIỆN</option>
							<option value="1">Khối sinh hoạt</option>
							<option value="2">Khối hành chính</option>
							<option value="3">Khối kinh doanh</option>
							<option value="4">Khối sản xuất</option>
						</select>
					</div>
					<div id="div1" style="display: none">
						<div class="form-group">
							<label><span class="text-danger">*</span> Bậc 01: </label> <input class="form-control" name="price1"
								placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Bậc 02: </label> <input class="form-control" name="price1"
								placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Bậc 03: </label> <input class="form-control" name="price1"
								placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Bậc 04: </label> <input class="form-control" name="price1"
								placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Bậc 05: </label> <input class="form-control" name="price1"
								placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Bậc 06: </label> <input class="form-control" name="price1"
								placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Trả trước: </label> <input class="form-control"
								name="price1" placeholder="Nhập số tiền bằng số">
						</div>
					</div>


					<div id="div2" style="display: none">
						<label class="text-primary">Bệnh viện, nhà trẻ, mẫu giáo, trường phổ thông: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Cấp điện áp từ 6 kV trở lên: </label> 
							<input class="form-control" name="price2"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Cấp điện áp dưới 6 kV: </label> 
							<input class="form-control" name="price2" placeholder="Nhập số tiền bằng số">
						</div>
						<label class="text-primary">Chiếu sáng công cộng; đơn vị hành chính sự nghiệp: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Cấp điện áp từ 6 kV trở lên: </label> 
							<input class="form-control" name="price2"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Cấp điện áp dưới 6 kV: </label> 
							<input class="form-control" name="price2" placeholder="Nhập số tiền bằng số">
						</div>
					</div>
					
					<div id="div3" style="display: none">
						<label class="text-primary">Cấp điện áp từ 22 kV trở lên: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ thấp điểm: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<label class="text-primary">Cấp điện áp từ 6 kV đến dưới 22 kV: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ thấp điểm: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<label class="text-primary">Cấp điện áp dưới 6 kV: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span>Giờ thấp điểm: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price3"placeholder="Nhập số tiền bằng số">
						</div>
					</div>

					<div id="div4" style="display: none">
						<label class="text-primary">Cấp điện áp từ 110 kV trở lên: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ thấp điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<label class="text-primary">Cấp điện áp từ 22 kV đến dưới 110 kV: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ thấp điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<label class="text-primary">Cấp điện áp từ 6 kV đến dưới 22 kV: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ thấp điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<label class="text-primary">Cấp điện áp dưới 6 kV: </label>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ bình thường: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ thấp điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Giờ cao điểm: </label> 
							<input class="form-control" name="price4"placeholder="Nhập số tiền bằng số">
						</div>
					</div>
					<button class="btn btn-sm primary form-control" type="submit">
						<span class="fas fa-key"></span> THỰC HIỆN
					</button>
				</form>
			</div>
		</div>
		<div class="row pt-5">
			<div class="col-lg-6 offset-lg-3">
				<table class="table table-sm text-center">
					<thead class="primary">
						<tr>
							<th>Ngày áp dụng</th>
							<th>Loại điện</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="item">
							<tr>
								<td>${item.time}</td>
								<c:if test="${item.type == 1}">
									<td><div class="badge badge-secondary p-2">Khối sinh hoạt</div></td>
								</c:if>
								<c:if test="${item.type == 2}">
									<td><div class="badge badge-warning text-white p-2">Khối hành chính</div></td>
								</c:if>
								<c:if test="${item.type == 3}">
									<td><div class="badge badge-success p-2">Khối kinh doanh</div></td>
								</c:if>
								<c:if test="${item.type == 4}">
									<td><div class="badge badge-primary p-2">Khối sản xuất</div></td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>


<script>
	$(document).ready(function () {
		$("#type").change( function(){
			var type = $("#type").val();
			for (var i = 1; i <= 4; i++){
				$("#div" + i).hide();
			}
			$("#div" + type).show();
		});
	

	});
</script>