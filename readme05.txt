Nội dung buổi học:
	- Overview lại toàn bộ slides
	- Xây dựng 1 dự án A-Z
		-> https://gokisoft.com/On-tap-thi-springmvc.html

1) Tao du an
2) Phan tich database
create table users (
	id int primary key auto_increment,
	name varchar(50) not null,
	email varchar(150) not null,
	address varchar(200),
	password varchar(191),
	token varchar(191)
)

create table products (
	id int primary key auto_increment,
	title varchar(150) not null,
	content longtext,
	thumbnail varchar(500),
	created_at datetime,
	updated_at datetime
)

3) Config database