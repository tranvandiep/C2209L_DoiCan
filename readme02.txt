Nội dung kiến thức trong buổi học hôm này:
	- Route/Controller/View
	- Form (GET/POST)
	- Layout
	- Cookie / Session
====================================================
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
		Route
			/book/input
	+) Đăng ký -> Học cookie/session
	+) Đăng nhập -> Học cookie/session