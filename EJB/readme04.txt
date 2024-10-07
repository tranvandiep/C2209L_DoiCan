B1) Tao CSDL
create table students (
	rollnumber varchar(50) PRIMARY KEY,
    name varchar(150),
    email varchar(150),
    age int
)

INSERT INTO `students` (`rollnumber`, `name`, `email`, `age`)
VALUES
('R001', 'TRAN VAN A', 'a@gmail.com', '20'),
('R002', 'TRAN VAN B', 'b@gmail.com', '21');

B2) Thêm thư viên jdbc mysql driver
B3) Generate Entities
B4) Generate Controllers
B5) Session Bean (EJB)