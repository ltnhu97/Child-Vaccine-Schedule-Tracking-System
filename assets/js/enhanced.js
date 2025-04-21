document.addEventListener('DOMContentLoaded', () => {
    // Xác thực biểu mẫu chung
    const validateForm = (formId, fields) => {
      const form = document.getElementById(formId);
      if (!form) return;
  
      form.addEventListener('submit', (e) => {
        e.preventDefault();
        let isValid = true;
        const errors = {};
  
        fields.forEach(field => {
          const input = form.querySelector(`#${field.id}`);
          const error = form.querySelector(`#${field.id}-error`);
          if (!input || !error) return;
  
          error.style.display = 'none';
          input.classList.remove('error');
  
          if (field.required && !input.value.trim()) {
            isValid = false;
            errors[field.id] = field.errorMsg;
          } else if (field.type === 'email' && !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(input.value)) {
            isValid = false;
            errors[field.id] = 'Vui lòng nhập email hợp lệ';
          } else if (field.type === 'password' && input.value.length < 6) {
            isValid = false;
            errors[field.id] = 'Mật khẩu phải có ít nhất 6 ký tự';
          } else if (field.type === 'date' && new Date(input.value) > new Date()) {
            isValid = false;
            errors[field.id] = 'Ngày không được trong tương lai';
          }
        });
  
        if (!isValid) {
          Object.keys(errors).forEach(id => {
            const error = form.querySelector(`#${id}-error`);
            error.textContent = errors[id];
            error.style.display = 'block';
            form.querySelector(`#${id}`).classList.add('error');
          });
        } else {
          alert(`Form ${formId} submitted successfully!`);
          form.reset();
        }
      });
    };
  
    // index.html: Đăng ký/Đăng nhập
    validateForm('signup-form', [
      { id: 'signup-name', required: true, errorMsg: 'Vui lòng nhập họ tên' },
      { id: 'signup-email', type: 'email', required: true, errorMsg: 'Vui lòng nhập email' },
      { id: 'signup-password', type: 'password', required: true, errorMsg: 'Vui lòng nhập mật khẩu' },
      { id: 'signup-gender', required: true, errorMsg: 'Vui lòng chọn giới tính' }
    ]);
    validateForm('login-form', [
      { id: 'login-email', type: 'email', required: true, errorMsg: 'Vui lòng nhập email' },
      { id: 'login-password', type: 'password', required: true, errorMsg: 'Vui lòng nhập mật khẩu' }
    ]);
  
    // child-profile.html: Thêm/Sửa/Ghi nhận
    validateForm('add-child-form', [
      { id: 'child-name', required: true, errorMsg: 'Vui lòng nhập tên bé' },
      { id: 'birth-date', type: 'date', required: true, errorMsg: 'Vui lòng chọn ngày sinh' },
      { id: 'gender', required: true, errorMsg: 'Vui lòng chọn giới tính' }
    ]);
    validateForm('edit-child-form', [
      { id: 'edit-child-select', required: true, errorMsg: 'Vui lòng chọn bé' },
      { id: 'edit-child-name', required: true, errorMsg: 'Vui lòng nhập tên bé' },
      { id: 'edit-birth-date', type: 'date', required: true, errorMsg: 'Vui lòng chọn ngày sinh' }
    ]);
    validateForm('vaccination-result-form', [
      { id: 'result-child-select', required: true, errorMsg: 'Vui lòng chọn bé' },
      { id: 'vaccine', required: true, errorMsg: 'Vui lòng chọn vaccine' },
      { id: 'vaccination-date', type: 'date', required: true, errorMsg: 'Vui lòng chọn ngày tiêm' },
      { id: 'doctor', required: true, errorMsg: 'Vui lòng nhập tên bác sĩ' }
    ]);
    validateForm('reaction-form', [
      { id: 'child-select', required: true, errorMsg: 'Vui lòng chọn bé' },
      { id: 'reaction', required: true, errorMsg: 'Vui lòng mô tả phản ứng' }
    ]);
  
    const deleteButton = document.getElementById('delete-submit');
    if (deleteButton) {
      deleteButton.addEventListener('click', () => {
        if (confirm('Bạn có chắc chắn muốn xóa hồ sơ này?')) {
          alert('Hồ sơ trẻ đã được xóa!');
        }
      });
    }
  
    // our-services.html: Đặt lịch/Đánh giá
    validateForm('appointment-form', [
      { id: 'appt-child-select', required: true, errorMsg: 'Vui lòng chọn bé' },
      { id: 'appt-date', type: 'date', required: true, errorMsg: 'Vui lòng chọn ngày hẹn' }
    ]);
    validateForm('feedback-form', [
      { id: 'feedback-service', required: true, errorMsg: 'Vui lòng chọn dịch vụ' },
      { id: 'feedback-rating', required: true, errorMsg: 'Vui lòng chọn đánh giá' },
      { id: 'feedback-comment', required: true, errorMsg: 'Vui lòng nhập nhận xét' }
    ]);
  
    const vaccineSelect = document.getElementById('appt-vaccine');
    const packageSelect = document.getElementById('appt-package');
    if (vaccineSelect && packageSelect) {
      packageSelect.addEventListener('change', () => {
        if (packageSelect.value) {
          vaccineSelect.disabled = true;
          vaccineSelect.value = '';
        } else {
          vaccineSelect.disabled = false;
        }
      });
      vaccineSelect.addEventListener('change', () => {
        if (vaccineSelect.value) {
          packageSelect.disabled = true;
          packageSelect.value = '';
        } else {
          packageSelect.disabled = false;
        }
      });
    }
  
    // dashboard.html: Cập nhật thông tin
    validateForm('profile-update-form', [
      { id: 'profile-name', required: true, errorMsg: 'Vui lòng nhập họ tên' },
      { id: 'profile-email', type: 'email', required: true, errorMsg: 'Vui lòng nhập email' },
      { id: 'profile-gender', required: true, errorMsg: 'Vui lòng chọn giới tính' }
    ]);
  
    // Lọc bảng trong dashboard
    const tables = ['child-list', 'payment-history', 'notifications', 'detailed-report'];
    tables.forEach(section => {
      const table = document.querySelector(`section.${section} table`);
      if (!table) return;
  
      const input = document.createElement('input');
      input.type = 'text';
      input.placeholder = 'Tìm kiếm...';
      input.className = 'search-input';
      table.parentElement.insertBefore(input, table);
  
      input.addEventListener('input', () => {
        const filter = input.value.toLowerCase();
        const rows = table.querySelectorAll('tbody tr');
        rows.forEach(row => {
          const text = row.textContent.toLowerCase();
          row.style.display = text.includes(filter) ? '' : 'none';
        });
      });
    });
  
    // news.html: Hiển thị chi tiết bài viết
    const newsItems = document.querySelectorAll('.news-item');
    newsItems.forEach(item => {
      item.addEventListener('click', () => {
        const content = item.querySelector('p').textContent;
        alert(`Chi tiết bài viết: ${content}`);
      });
    });
  });