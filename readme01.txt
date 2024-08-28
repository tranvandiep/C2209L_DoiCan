Nội dung kiến thức:
	- Cài đặt môi trường -> Như môn trước
	- Tạo dự án
	- Thymleaf
	- Route -> trong sping boot
	- Form
		- Get
		- Post
Tạo dự án:
	Tạo dự án quản lý sách (Tên sách, giá, tác giả, ngày xuất bản)
	+) Trang index
		Route:
			/book/index
		Controller:
			BookController
		View:
			book/index
		Model:
			Book
				bookName
				price
				authorName
				publishedDate
	+) Thêm sách

B1) Tạo dự án
	- https://start.spring.io/
B2) MVC
B3) Thymleaf
	- Hiển thị biến lên view -> OK
	- if/else/switch
	- Sử dụng object trong Thymleaf -> ???
	- for/foreach trong thymleaf