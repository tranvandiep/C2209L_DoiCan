Nội dung:
B1) Thiết kế database
create table accounts (
	id int primary key auto_increment,
	account_num varchar(50),
	fullname varchar(150),
	amount float
);

INSERT INTO `accounts` (`id`, `account_num`, `fullname`, `amount`) 
VALUES 
(NULL, '0123456789', 'TRAN VAN A', '1000000'), 
(NULL, '0987654321', 'TRAN VAN B', '3000000');

B2) Tao project
B3) Hướng dẫn fix lỗi dự án
- Sửa file pom.xml -> Trong tất cả các dự án Enterprise Application
- Sửa folder dự án

B4) Bắt tay vào code
EJB:
	- Config thư viện kết nối CSDL
	- Tạo entities database
	- Tao controller 
	- SessionBean