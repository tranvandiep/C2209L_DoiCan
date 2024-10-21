B1) Tao CSDL
create table company (
	id int primary key auto_increment,
	name varchar(50),
	company_key varchar(50),
	description varchar(200),
	address varchar(200),
	enabled int default 0
);

INSERT INTO `company` (`id`, `name`, `company_key`, `description`, `address`, `enabled`)
VALUES
(NULL, 'Aptech', 'aptech', 'Aptech Viet Nam', '285 Doi Can', '1'),
(NULL, 'Gozic', 'gz', 'Gozic .,JSC', 'Ha Noi', '1');

B2) Tao project
	- Sua config
	- Fix folder
	- Add libs & CSDL pom.xml -> ejb
	- Generate entities
	- EJB: DONE -> SessionBean

	- Web Application
		List
			
		Add
		Edit
		Delete