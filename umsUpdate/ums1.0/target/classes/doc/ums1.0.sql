drop database if exists ums1.0
create database ums1.0 charset='utf8mb4'
use ums1.0;

drop table if exists sys_user;
create table sys_user(
    id int(10) not null auto_increment comment'主键',
    name varchar(255) not null comment'姓名',
    cellphone varchar(255) not null comment'手机号码',
    password varchar(255) not null comment'密码',
    avatar varchar(255) comment'用户头像',
    createTime timestamp default CURRENT_TIMESTAMP comment'创建时间',
    updateTime timestamp  default CURRENT_TIMESTAMP  on update CURRENT_TIMESTAMP comment'修改时间',
    primary key(id)
)engine=innodb charset=utf8mb4 comment='用户信息表';