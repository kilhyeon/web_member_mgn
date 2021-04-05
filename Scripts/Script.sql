select * from member;

insert into member values(1, password('1111'), '홍길동', 40, '남자', 'test@test.co.kr');

insert into member values('admin', password('rootroot'), '이종윤', 41, '남자', 'admin@test.co.kr');

select id, name, age, gender, email
from member
where id = 1 and passwd = password('1111');