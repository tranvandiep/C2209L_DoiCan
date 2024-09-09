Nội dung kiến thức:
	- validate dữ liệu trong Spring boot -> Server
		- validate
		- handle error -> show page.
	- RestController
		- Lay danh sach book
			api: api/book/list
			method: get -> data
		- Them du lieu:
			api: api/book/add
			method: post
			param: @body, @form
			res: Message (status, message)
		- Sua du lieu:
			api: api/book/update
			method: post
			param: @body, @form
			res: Message (status, message)
		- Xoa du lieu
			api: api/book/delete
			method: post
			param: @body, @form
			res: Message (status, message)
	- jwt
		- Tạo tài khoản user (login/register)
		- Quản lý login
		- security

		create table users (
			id int primary key auto_increment,
			name varchar(100),
			email varchar(150),
			password varchar(120),
			roles varchar(50)
		)

Sử dụng lại kiến thức (bài tập hôm trước)
