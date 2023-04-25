<%@ page contentType="text/html; charset=UTF-8"%>
<div class="container" style="margin-top: 50px">
  <div class="row">
    <div class="col-6 offset-3">
      <h2 class="text-center mb-4">ĐĂNG NHẬP</h2>
      <form id="form">
        <div class="input-group form-group">
          <span class="input-group-prepend">
            <div class="input-group-text bg-light border-right-0"><i class="far fa-envelope"></i>
            </div>
          </span>
          <input class="form-control py-2 border-left-0 border" id="email" name="email"
            placeholder="Email">
        </div>

        <div class="input-group form-group">
          <span class="input-group-prepend">
            <div class="input-group-text bg-light border-right-0"><i class="fas fa-lock"></i>
            </div>
          </span>
          <input class="form-control py-2 border-left-0 border" id="pass" name="pass"
            placeholder="Mật khẩu" type="password">
        </div>
        <div class="form-group">
          <button class="btn btn-primary btn-sm font-weight-bold form-control" type="button" id="btn" onclick="fSubmit()"><span class="fas fa-key"></span> ĐĂNG NHẬP</button>
        </div>
      </form>
      <p class="text-center">Bạn chưa có tài khoản? <a href="dang-ky">Đăng ký</a></p>
    </div>
  </div>
</div>


<script>	
	function fSubmit(){
		$.ajax({
			url: "dang-nhap",
			type: "post",
			data: $("#form").serialize(),
			success: function(res){
				if (res == "OK"){
					window.location.replace("trang-chu");
				} else {
					$.notify($("#btn"), res, {
		                className: "info",
		                position: "top-center"
		              });
				}
			}
		})
	}
</script>