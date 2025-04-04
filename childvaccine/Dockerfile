# Sử dụng image Nginx chính thức từ Docker Hub
FROM nginx:alpine

# Sao chép toàn bộ nội dung thư mục childvaccine vào thư mục mặc định của Nginx
COPY . /usr/share/nginx/html

# Mở cổng 80 để truy cập ứng dụng
EXPOSE 80

# Khởi động Nginx
CMD ["nginx", "-g", "daemon off;"]