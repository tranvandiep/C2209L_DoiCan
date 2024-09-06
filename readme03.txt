Nội dung kiến thức:
	- Kết nối CSDL
		- Danh sách book
		- Thêm/sửa/xoá
		-> CRUD
Ví dụ:
	Xây dựng 1 website quản lý sách

B1) Thiết kế CSDL
	create table books (
		id int primary key auto_increment,
		book_name varchar(150),
		price float,
		author_name varchar(100),
		published_date date
	)
B2) Tạo dự án & cấu hình
	- Add thư viện
	- Add config
	- Module: book
		- model (ORM) table <-> class object (entity)
		- danh sach book
			- route: book2/index
			- controller: Book2Controller@index
			- method: get
			- view: book2/index
		- them sach
			-> view
				- route: book2/input
				- controller: Book2Controller@input
				- method: get
				- view: book2/input
			-> post
				- route: book2/input
				- controller: Book2Controller@post
				- method: post
		- Sua
			-> view
				- route: book2/edit
				- controller: Book2Controller@edit
				- method: get
				- view: book2/edit
			-> post
				- route: book2/edit
				- controller: Book2Controller@update
				- method: post
		- Xoa
			-> view
				- route: book2/delete
				- controller: Book2Controller@delete
				- method: get
				- view: book2/delete
			-> post
				- route: book2/delete
				- controller: Book2Controller@confirmDelete
				- method: post

