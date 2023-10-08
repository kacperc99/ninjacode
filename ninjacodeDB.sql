create database SC
GO
use SC
GO
drop table [CourseStudents]
drop table [Courses]
drop table [Students]
GO
create table [Students]
(
	Id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
	[name] NVARCHAR(30) NOT NULL,
	[surname] NVARCHAR(30) NOT NULL,
	[email] NVARCHAR(40) UNIQUE NOT NULL
)
GO
create table [Courses]
(
	Id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
	[Course_Name] NVARCHAR(20) NOT NULL
)
GO
create table [CourseStudents]
(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Id_Student INT NOT NULL FOREIGN KEY REFERENCES [Students](Id),
	Id_Courses INT NOT NULL FOREIGN KEY REFERENCES [Courses](Id)
)
Insert into [Students] values ('jan','kowalski','p@gmail.com')
Insert into [Students] values ('john','blacksmith','b@gmail.com')
Insert into [Students] values ('johann','schmied','d@gmail.com')
Insert into [Students] values ('jean','forgeur','q@gmail.com')
GO
Insert into [Courses] values ('english')
Insert into [Courses] values ('german')
GO
Insert into [CourseStudents] values (NEWID(), 1,1)
Insert into [CourseStudents] values (NEWID(), 2,1)
Insert into [CourseStudents] values (NEWID(), 3,2)
Insert into [CourseStudents] values (NEWID(), 4,2)
Insert into [CourseStudents] values (NEWID(), 4,1)

select C.Course_name from [Courses] C join [CourseStudents] CS on C.Id=CS.Id_Courses join [Students] S on S.Id=CS.Id_Student  where S.name = 'jean' and S.surname = 'forgeur' 
select S.[name], S.[surname] from [Students] S join [CourseStudents] CS on S.Id=CS.Id_Student join [Courses] C on C.Id=CS.Id_Courses  where C.Course_name = 'english'
select * from [Students] S where S.Id in (Select Id_Student from CourseStudents Group By Id_Student Having Count(*) >= 2)