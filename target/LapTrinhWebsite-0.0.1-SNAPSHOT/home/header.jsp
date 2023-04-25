<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>${PageInfo.title}</title>
<link
	href="<c:url value='/home/vendor/bootstrap/css/bootstrap.min.css'/>"
	rel="stylesheet" type="text/css">
<link
	href="<c:url value='/home/vendor/fontawesome-free/css/all.min.css'/>"
	rel="stylesheet" type="text/css">
<link
	href="<c:url value='/home/assets/main.css'/>"
	rel="stylesheet" type="text/css">
<script src="<c:url value='/home/vendor/jquery/jquery.min.js'/>"></script>
<script src="<c:url value='/home/vendor/notify/notify.js'/>"></script>
</head>

<body>
  <div class="container bg-light rounded-top">
    <div class="text-center pt-4 pb-4">
      <a href="trang-chu"> <img src="home/image/logo.svg" style="width: 50%"></a>
    </div>
  </div>
  <div class="container bg-light">
    <div class="text-center pt-5">
      <a class="btn btn-sm text-white" style="background-color: #ea9a17" href="setting">
        <i class="fas fa-tools"></i> Cấu hình
      </a>
      <a class="btn btn-sm text-white success"  href="user">
        <i class="fas fa-users"></i> Khách hàng
      </a>
      <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
        <div class="btn-group" role="group">
          <button id="btnGroupDrop1" type="button" class="btn btn-secondar btn-sm  primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-history"></i> Xuất báo cáo
          </button>
          <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
            <a class="dropdown-item" href="report?type=bao-cao-hoa-don">Báo cáo hóa đơn</a>
          </div>
        </div>
      </div>
      <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
        <div class="btn-group" role="group">
          <button id="btnGroupDrop1" type="button" class="btn btn-secondar btn-sm  primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-history"></i> Gửi Email
          </button>
          <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
            <a class="dropdown-item" href="sendEmail?type=thu-tien-dien-theo-thang">Thu tiền điện theo tháng</a>
            <a class="dropdown-item" href="sendEmail?type=tam-ngung-cung-cap-dien">Tạm ngừng cung cấp điện</a>
            <a class="dropdown-item" href="sendEmail?type=thay-doi-gia-dien">Thay đổi giá điện</a>
            <a class="dropdown-item" href="sendEmail?type=nhac-no-tien-dien">Nhắc nợ tiền điện</a>
          </div>
        </div>
      </div>
    </div>
  </div>