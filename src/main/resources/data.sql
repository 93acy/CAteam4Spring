--Insert Role

INSERT INTO caps.role(id,name) VALUES (1,'STUDENT')
INSERT INTO caps.role(id,name) VALUES (2,'LECTURER')
INSERT INTO caps.role(id,name) VALUES (3,'ADMIN')





-- --Insert Courses

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (1,50,30,4,'CS1004S','Introduction to C#','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (2,50,30,4,'CS1105S','Fundamentals in JAVA','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (3,50,30,4,'CS1101S','Programming Methodology','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (4,45,40,4,'CS1231S','Discrete Structures','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (5,55,50,4,'CS2030S','Programming Methodology II','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (6,40,35,4,'CS2040S','Data Structures and Algorithms','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (7,30,25,4,'CS2100S','Computer Organisation','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (8,35,30,4,'CS2103T','Software Engineering2','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (9,50,32,4,'CS2106','Introduction to Operating Systems','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (10,40,35,4,'CS3230','Design and Analysis of Algorithms','2020-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (11,40,35,4,'CP3106','Independent Project','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (12,36,35,4,'CP3209','Undergraduate Research in Computing','2020-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (13,40,34,12,'CP4101','BComp Dissertation','2023-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (14,40,35,8,'CP4106','Computing Project','2023-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (15,35,30,4,'IS1103','Ethics in Computing','2023-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (16,50,49,4,'CS2101','Effective Communication for Computing Professionals 3','2022-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (17,55,52,4,'ES2660','Communicating in the Information Age','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (18,40,35,4,'MA1521','Calculus for Computing 4','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (19,30,20,4,'MA2001','Linear Algebra I','2021-06-01')

INSERT INTO caps.course (course_id,capacity,current_select_num,credit,description,name,start_date) VALUES (20,35,30,8,'ST2334','Probability and Statistics and one Science Module 5','2022-06-01')



-- --Insert into User for Student

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (1,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','joel')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (2,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','joel1')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (6,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','libbylaw')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (7,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','terrencelay')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (8,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','deshawnlos')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (9,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','mohamedhas')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (10,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','margewil')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (11,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','jesicaduc')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (12,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','kimberlyorl')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (13,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','jadwigamcc')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (14,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','dedrakkue')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (15,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','earlebak')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (16,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','alitanor')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (17,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','marciabe')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (18,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','katelyncas')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (19,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','jacquelynvis')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (20,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','deannepru')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (21,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','joeytri')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (22,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','rachelgre')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (23,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','yvettevar')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (24,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','mirellabar')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (25,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','keikopal')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (26,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','corinnahad')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (27,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','sherlyhar')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (28,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','shenafer')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (29,1,'$2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','andiragig')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (43,1,' $2a$10$iEZOLIvL31bPEo6Ldod6ZeiIjhpcSZfR9rkDwXx5HGZn2yUewQ5Bi','camiahon')





-- --Insert User for Lecturer

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (3,1,'$2a$10$X2yWa4zWqexd9/jgnQzpUOQ3UYVDjAZiLHpILg1I4BW7WYzFVwyei','tin')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (4,1,'$2a$10$X2yWa4zWqexd9/jgnQzpUOQ3UYVDjAZiLHpILg1I4BW7WYzFVwyei','suria')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (30,1,'$2a$10$X2yWa4zWqexd9/jgnQzpUOQ3UYVDjAZiLHpILg1I4BW7WYzFVwyei','cherwahtan')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (31,1, '$2a$10$X2yWa4zWqexd9/jgnQzpUOQ3UYVDjAZiLHpILg1I4BW7WYzFVwyei','estherwon')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (32,1, '$2a$10$X2yWa4zWqexd9/jgnQzpUOQ3UYVDjAZiLHpILg1I4BW7WYzFVwyei','fanliu')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (33,1, '$2a$10$X2yWa4zWqexd9/jgnQzpUOQ3UYVDjAZiLHpILg1I4BW7WYzFVwyei','felicitaslee')





-- --Insert User for Admin

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (5,1,'$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','admin')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (34,1,'$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','mitzipin')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (35,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','marcmuc')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (36,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','janenesle')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (37,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','celsamcf')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (38,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','daltonbre')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (39,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','temekaarm')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (40,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','ellashe')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (41,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','karmache')

INSERT INTO caps.user (user_id,enabled,password,username) VALUES (42,1, '$2a$10$pDwBGu9.3CT5RIpBpkqlFuVan8mjljxy0FS5qwZJiAoscsCuiHD5S','sumikoqui')





-- --Insert User role for Students

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(1,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(2,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(6,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(7,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(8,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(9,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(10,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(11,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(12,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(13,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(14,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(15,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(16,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(17,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(18,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(19,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(20,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(21,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(22,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(23,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(24,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(25,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(26,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(27,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(28,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(29,1)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(43,1)





-- --Insert User role for Lecturer

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(3,2)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(4,2)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(30,2)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(31,2)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(32,2)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(33,2)



-- --Insert User role for Admin

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(5,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(34,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(36,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(37,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(38,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(39,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(40,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(41,3)

INSERT INTO caps.user_roles(user_user_id,roles_id) VALUES(42,3)

--

-- --Student—

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Joel','Yeo',1)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Joel','Yao',2)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Libby','Lawrence',6)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Terrence','Layman',7)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Deshawn','Lossett',8)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Mohamed','Hassen',9)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Marge','Williams',10)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Jesica','Ducker',11)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Kimberly','Orlandi',12)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Jadwiga','Mccormick',13)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Dedra','Kuehn',14)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Earle','Baker',15)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Alita','Northcott',16)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Marci','Abernethy',17)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Katelyn','Caspers',18)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Jacquelyn','Visser',19)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Deanne','Pruden',20)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Joey','Tribbiani',21)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Rachel','Green',22)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Yvette','Varner',23)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Mirella','Bartee',24)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Keiko','Palencia',25)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Corinna','Haddon',26)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Camia','Hon',43)



INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Sherly','Harkins',27)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Shena','Ferraro',28)

INSERT INTO caps.student (first_name,last_name,user_id) VALUES ('Andira','Gigliotti',29)





-- --Lecturer

INSERT INTO caps.lecturer (first_name,last_name,user_id) VALUES ('Tin','Nguyen',3)

INSERT INTO caps.lecturer (first_name,last_name,user_id) VALUES ('Suria','Asai',4)

INSERT INTO caps.lecturer (first_name,last_name,user_id) VALUES ('Cher Wah','Tan',30)

INSERT INTO caps.lecturer (first_name,last_name,user_id) VALUES ('Esther','Wong',31)

INSERT INTO caps.lecturer (first_name,last_name,user_id) VALUES ('Fan','Liu',32)

INSERT INTO caps.lecturer (first_name,last_name,user_id) VALUES ('Felicitas','Lee',33)



-- --Admin

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Admin','Staff',5)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Mitzi','Pinson',34)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Marc','Mucci',35)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Janene','Slevin',36)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Celsa','Mcfall',37)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Dalton','Brezinski',38)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Temeka','Armond',39)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Ella','Sheets',40)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Karma','Chen',41)

INSERT INTO caps.admin (first_name,last_name,user_id) VALUES ('Sumiko','Quillin',42)



--Lecturer Courses Assignment

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (4,5)





INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (4,7)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (4,11)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (4,12)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (4,17)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (4,19)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,2)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,4)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,5)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,11)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,10)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,13)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (3,16)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,16)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,11)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,6)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,1)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,5)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,7)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (30,12)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,2)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,3)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,6)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,7)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,10)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,11)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,11)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,13)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,14)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,15)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,16)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,17)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (31,18)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,7)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,11)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,4)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,14)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,18)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,19)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (32,20)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,20)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,15)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,10)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,5)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,3)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,13)

INSERT INTO caps.course_allocation (lecturer_id,course_id) VALUES (33,17)



-- -- Attended Courses for Students



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (15,1,63,2)

INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (5,1,66,2)

INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (1,1,83,4)

INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (7,1,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (15,2,60,2)

INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (10,2,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (9,2,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (17,2,60,2)











INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (5,7,65,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (4,7,77,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (3,7,70,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (15,7,63,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (15,8,55,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (14,8,90,5)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (6,8,71,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (6,8,61,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (16,9,78,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (5,9,40,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (13,9,90,5)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (12,9,76,3)







INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (12,10,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (6,10,40,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (13,10,67,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (12,10,70,3)







INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (12,11,67,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (6,11,76,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (13,11,73,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (12,11,50,1)











INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (11,12,78,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (10,12,64,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (9,12,89,4)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (8,12,79,3)





INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (11,13,69,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (7,13,46,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (19,13,55,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (18,13,66,2)







INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (2,14,70,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (16,14,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (3,14,65,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (1,14,78,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (16,15,89,4)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (5,15,90,5)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (7,15,69,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (9,15,59,1)





INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (8,16,77,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (17,16,80,4)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (9,16,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (2,16,76,3)





INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (11,17,54,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (15,17,82,4)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (7,17,67,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (12,17,48,1)





INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (20,18,62,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (6,18,70,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (13,18,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (11,19,56,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (20,19,60,2)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (6,19,70,3)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (13,19,50,1)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (11,19,80,4)



INSERT INTO caps.enrolment (course_course_id,student_user_id,grade,point) VALUES (11,43,40,1)



