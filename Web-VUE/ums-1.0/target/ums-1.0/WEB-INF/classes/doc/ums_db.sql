drop database nullif exists ums1.0_db;
create database ums1.0_db character set 'utf8mb4';
use ums1.0_db

drop table if exists sys_user;
create table  sys_user(
    id int(10) not null auto_increment comment'主键',
    name varcahr(100) not null comment'用户姓名',
    cellphone varchar(100) not null comment'手机号码',
    password varchar(500) not null cooment'密码',
    avatar varchar(500) comment'用户头像',
    createTime timestamp not null default CURRENT_TIMESTAMP comment'创建时间',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment'修改时间',
    primary key(id)

)engine=innodb charaset=utf8mb4 comment='用户信息表';