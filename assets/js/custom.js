document.addEventListener('DOMContentLoaded', function () {
	const form = document.getElementById('contact-form');
  
	form.addEventListener('submit', function (e) {
	  e.preventDefault();
  
	  // Client-side validation
	  const name = document.getElementById('name').value.trim();
	  const email = document.getElementById('email').value.trim();
	  const message = document.getElementById('message').value.trim();
  
	  if (name.length < 2) {
		alert('Họ tên phải có ít nhất 2 ký tự.');
		return;
	  }
  
	  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	  if (!emailRegex.test(email)) {
		alert('Vui lòng nhập email hợp lệ.');
		return;
	  }
  
	  if (message.length < 10) {
		alert('Tin nhắn phải có ít nhất 10 ký tự.');
		return;
	  }
  
	  // Simulate form submission
	  alert('Tin nhắn của bạn đã được gửi! Chúng tôi sẽ phản hồi sớm.');
	  form.reset();
	});
  });