<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container bg-light pb-5">
	<div class="pt-5">
		<div class="row">
			<div class="col-lg-6 offset-lg-3">
				<c:if test="${type == 'thu-tien-dien-theo-thang'}">
					<h3 class="text-center secondary-title pb-3">GỬI THÔNG BÁO THU
						TIỀN ĐIỆN</h3>
					<form method="POST" action="sendEmail?type=${type}">
						<p class="text-primary text-center font-weight-bold">${message}</p>
						<input type="hidden" name="action" value="${type}">
						<div class="form-group">
							<label><span class="text-danger">*</span> Tháng thu tiền điện: </label> <select class="form-control"
								name="month">
								<option value="0" selected disabled>CHỌN THÁNG CẦN THU</option>
								<option value="1">Tháng 1</option>
								<option value="2">Tháng 2</option>
								<option value="3">Tháng 3</option>
								<option value="4">Tháng 4</option>
								<option value="5">Tháng 5</option>
								<option value="6">Tháng 6</option>
								<option value="7">Tháng 7</option>
								<option value="8">Tháng 8</option>
								<option value="9">Tháng 9</option>
								<option value="10">Tháng 10</option>
								<option value="11">Tháng 11</option>
								<option value="12">Tháng 12</option>
							</select>
						</div>
						<div class="form-group">
							<div class="form-group">
								<label><span class="text-danger">*</span> Hạn phải nộp: </label> <input type="date" name="date"
									class="form-control">
							</div>
						</div>
						<button class="btn btn-sm primary form-control" type="submit">
							<span class="fas fa-key"></span> GỬI EMAIL
						</button>
					</form>
				</c:if>
				<c:if test="${type == 'tam-ngung-cung-cap-dien'}">
					<h3 class="text-center secondary-title pb-3">GỬI THÔNG BÁO TẠM
						NGƯNG CẤP ĐIỆN</h3>
					<form method="POST" action="sendEmail?type=${type}">
						<p class="text-primary text-center font-weight-bold">${message}</p>
						<input type="hidden" name="action" value="${type}">
						<div class="form-group">
							<label>Khu vực cắt điện: </label> <select
								class="form-control form-select form-select-sm mb-3" id="city"
								name="city" aria-label=".form-select-sm">
								<option value="" selected>Chọn tỉnh thành</option>
							</select> <select class="form-control form-select form-select-sm mb-3"
								id="district" name="district" aria-label=".form-select-sm">
								<option value="" selected>Chọn quận huyện</option>
							</select> <select class="form-control form-select form-select-sm"
								id="ward" name="ward" aria-label=".form-select-sm">
								<option value="" selected>Chọn phường xã</option>
							</select>
						</div>
						<div class="form-group">
							<div class="form-group">
								<label><span class="text-danger">*</span> Thời gian bắt đầu: </label> <input type="date"
									name="dateStart" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="form-group">
								<label><span class="text-danger">*</span> Thời gian kết thúc: </label> <input type="date"
									name="dateEnd" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Lý do cắt điện: </label>
							<textarea type="text" name="description" class="form-control"
								rows="5"></textarea>
						</div>
						<button class="btn btn-sm primary form-control" type="submit">
							<span class="fas fa-key"></span> GỬI EMAIL
						</button>
					</form>


					<script
						src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js"></script>
					<script>
						var citis = document.getElementById("city");
						var districts = document.getElementById("district");
						var wards = document.getElementById("ward");
						var Parameter = {
						  url: "https://raw.githubusercontent.com/kenzouno1/DiaGioiHanhChinhVN/master/data.json", 
						  method: "GET", 
						  responseType: "application/json", 
						};
						var promise = axios(Parameter);
						promise.then(function (result) {
						  renderCity(result.data);
						});
						
						function renderCity(data) {
						  for (const x of data) {
						    citis.options[citis.options.length] = new Option(x.Name, x.Id);
						  }
						  citis.onchange = function () {
						    district.length = 1;
						    ward.length = 1;
						    if(this.value != ""){
						      const result = data.filter(n => n.Id === this.value);
						
						      for (const k of result[0].Districts) {
						        district.options[district.options.length] = new Option(k.Name, k.Id);
						      }
						    }
						  };
						  district.onchange = function () {
						    ward.length = 1;
						    const dataCity = data.filter((n) => n.Id === citis.value);
						    if (this.value != "") {
						      const dataWards = dataCity[0].Districts.filter(n => n.Id === this.value)[0].Wards;
						
						      for (const w of dataWards) {
						        wards.options[wards.options.length] = new Option(w.Name, w.Id);
						      }
						    }
						  };
						}
				</script>
				</c:if>
				
				<c:if test="${type == 'thay-doi-gia-dien'}">
					<h3 class="text-center secondary-title pb-3">GỬI THÔNG BÁO ĐIỀU CHỈNH
						TIỀN ĐIỆN</h3>
					<form method="POST" action="sendEmail?type=${type}">
						<p class="text-primary text-center font-weight-bold">${message}</p>
						<input type="hidden" name="action" value="${type}">
						<div class="form-group">
							<label><span class="text-danger">*</span> Đợt chỉnh điện: </label> <select class="form-control"
								name="id">
								<option selected disabled>CHỌN ĐỢT CHỈNH ĐIỆN</option>
								<c:forEach var="item" items="${list}" varStatus="loop">
								<option value="${item.id}">${item.time} - ${item.name}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label><span class="text-danger">*</span> Lý do điều chỉnh giá điện: </label>
							<textarea type="text" name="description" class="form-control"
								rows="5"></textarea>
						</div>
						<button class="btn btn-sm primary form-control" type="submit">
							<span class="fas fa-key"></span> GỬI EMAIL
						</button>
					</form>
				</c:if>
				
				<c:if test="${type == 'nhac-no-tien-dien'}">
					<h3 class="text-center secondary-title pb-3">GỬI THÔNG BÁO NHẮC NỢ TIỀN ĐIỆN</h3>
					<form method="POST" action="sendEmail?type=${type}">
						<p class="text-primary text-center font-weight-bold">${message}</p>
						<input type="hidden" name="action" value="${type}">
						<div class="form-group">
							<label><span class="text-danger">*</span> Nội dung cảnh báo: </label> <select class="form-control" name="messageId">
								<option selected disabled>CHỌN NỘI DUNG CẢNH BÁO</option>
								<option value="0">Nộp tiền ngay không sẽ bị cắt điện</option>
								<option value="1">Nộp tiền đi các bạn</option>
								<option value="2">Yêu cầu khách hàng nộp khoản tiền nợ ngay</option>
							</select>
						</div>
						<button class="btn btn-sm primary form-control" type="submit">
							<span class="fas fa-key"></span> GỬI EMAIL
						</button>
					</form>
				</c:if>

			</div>
		</div>

	</div>
</div>



