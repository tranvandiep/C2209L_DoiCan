Các bước để triển khai 1 dự án:
B1) Tạo CSDL
create table student (
	rollnumber varchar(50) primary key,
	name varchar(150) not null,
	email varchar(200),
	age int
)

INSERT INTO `student` (`rollnumber`, `name`, `email`, `age`) 
VALUES 
('R001', 'TRAN VAN A', 'A@GMAIL.COM', '20'), 
('R002', 'TRAN VAN B', 'B@GMAIL.COM', '19');

B2) Tạo dự án
	- Tao du an
	- Tai thu vien jdbc mysql driver.jar
	- Add vao du an ejb
	- Tao entities
	- Tao controller