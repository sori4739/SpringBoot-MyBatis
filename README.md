#### Springboot - MyBatis - CRUD 간단한 게시판만들기

- git주소 : <https://github.com/sori4739/SpringBoot-MyBatis>


#### 1. 사용자 생성 및 권한 주기 및 DB 생성
- create user 'cos'@'localhost' identified by 'bitc5600';
- GRANT ALL PRIVILEGES ON *.* TO cos@localhost;
- create database cos;
- use cos;

#### 2. 테이블
```sql
create table post(
	id int auto_increment primary key,
    title varchar(100) not null,
    content longtext,
    userId int,
    createDate timestamp
) engine=InnoDB default charset=utf8;
```
