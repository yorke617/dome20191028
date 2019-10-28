create table if not exists sys_tables (
    tab_id int(10) primary key AUTO_INCREMENT ,
    tab_name varchar(20) NOT NULL DEFAULT '',
    tab_comments varchar(50) NOT NULL DEFAULT ''
)
COMMENT = '表信息';

create table if not exists sys_fields (
    field_id int(10) primary key AUTO_INCREMENT,
    field_name varchar(20) NOT NULL DEFAULT '',
    field_COMMENTs varchar(50) NOT NULL DEFAULT '',
    field_length int(5) NOT NULL DEFAULT '',
    field_verify varchar(50) NOT NULL DEFAULT '',
    tab_id int(20) NOT NULL DEFAULT ''
)
COMMENT = '表字段';

create table if not exists sys_vals1 (
    val_id int(10) primary key AUTO_INCREMENT,
    val_values varchar(20) NOT NULL DEFAULT '',
    field_id int(10) NOT NULL DEFAULT '',
    log_id int(10) not null DEFAULT 0
)
COMMENT = '表值1';

create table if not exists sys_vals2 (
    val_id int(10) primary key AUTO_INCREMENT,
    field_id int(10) NOT NULL DEFAULT '',
    val_values varchar(50) NOT NULL DEFAULT '',
    log_id int(10) not null DEFAULT 0
)
COMMENT = '表值2';



/*
create table if not exists sys_fields (
    field_id int(10) primary key AUTO_INCREMENT COMMENT '字段Id',
    field_name varchar(20) NOT NULL DEFAULT '' COMMENT '字段名',
    field_COMMENTs varchar(50) NOT NULL DEFAULT '' COMMENT '字段描述',
    field_length int(5) NOT NULL DEFAULT '' COMMENT '字段长度',
    field_verify varchar(50) NOT NULL DEFAULT '' COMMENT '字段规则',
    tab_id int(20) NOT NULL DEFAULT '' COMMENT '表Id'
)
COMMENT = '表字段';

create table if not exists sys_vals1 (
    val_id int(10) primary key AUTO_INCREMENT COMMENT '表值Id',
    val_values varchar(20) NOT NULL DEFAULT '' COMMENT '表值',
    field_id int(10) NOT NULL DEFAULT '' COMMENT '字段Id',
    log_id int(10) not null DEFAULT 0 COMMENT '日志id'
)
COMMENT = '表值1';

create table if not exists sys_vals2 (
    val_id int(10) primary key AUTO_INCREMENT COMMENT '表值Id',
    val_values varchar(50) NOT NULL DEFAULT '' COMMENT '表值',
    field_id int(10) NOT NULL DEFAULT '' COMMENT '字段Id',
    log_id int(10) not null DEFAULT 0 COMMENT '日志id'
)
COMMENT = '表值2';
*/
