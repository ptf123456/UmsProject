drop database if exists ums_db;
create database ums_db charset=utf8mb4;
use ums_db

drop table if exists system_user;
create table system_user (
    id int(10) not null auto_increment comment'主键',
    name varchar(100) not null comment'用户姓名',
    cellphone varchar(100) not null comment'用户手机号',
    createTime timestamp not null default CURRENT_TIMESTAMP comment'创建时间',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment'修改时间'
    primary key(id)
)engine=innodb charset=utf8mb4 comment'用户信息表'