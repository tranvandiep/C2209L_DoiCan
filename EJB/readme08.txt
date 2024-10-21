B1. Tạo CSDL
create database student_manager

create table student (
	rollnumber varchar(20) primary key,
	name varchar(50) not null,
	email varchar(150),
	age int
)

INSERT INTO `student` (`rollnumber`, `name`, `email`, `age`)
VALUES
('R001', 'TRAN VAN A', 'A@GMAIL.COM', '20'),
('R002', 'TRAN VAN B', 'B@GMAIL.COM', '19');

B2. Tao du an
- Tai thu vien jdbc mysql driver.jar -> add du an (su dung generate entities dao)
- Them thu vien jdbc mysql ... -> pom.xml
- Config persistence.xml -> Sua sau
- Generate Entities (DAO)
- Generate Controller -> Entities -> CRUD (Danh sach, them, sua, xoa)
	- Problem: Generate controller -> Netbean (19 -> Ko cho Gen, 23 -> Gen Tomcat + Ko gen glassfish)
	