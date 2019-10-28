insert into sys_tables(tab_id,tab_name,tab_comments) values(1, 'sys_user', '系统用户');
insert into sys_tables(tab_id,tab_name,tab_comments) values(2, 'sys_data', '数据主键');

-- 系统用户信息
insert into sys_fields(FIELD_ID,FIELD_NAME,FIELD_COMMENTS,FIELD_LENGTH,FIELD_VERIFY,TAB_ID)
values (1, 'user_name', '用户名', 20, '', 1);
insert into sys_fields(FIELD_ID,FIELD_NAME,FIELD_COMMENTS,FIELD_LENGTH,FIELD_VERIFY,TAB_ID)
values (2, 'user_tel', '用户电话', 20, '', 1);
insert into sys_fields(FIELD_ID,FIELD_NAME,FIELD_COMMENTS,FIELD_LENGTH,FIELD_VERIFY,TAB_ID)
values (3, 'user_address', '用户地址', 50, '', 1);


insert into sys_vals1(val_id, field_id, val_values, data_id)
values (null, 1, '杨银科', 1);
insert into sys_vals1(val_id, field_id, val_values, data_id)
values (null, 2, '15191457863', 1);
insert into sys_vals2(val_id, field_id, val_values, data_id)
values (null, 3, '陕西省西安市雁塔区鱼化寨陕西省西安市雁塔区鱼化寨', 1);

insert into sys_vals1(val_id, field_id, val_values, data_id)
values (null, 1, '杨银科2', 2);
insert into sys_vals1(val_id, field_id, val_values, data_id)
values (null, 2, '15191457864', 2);
insert into sys_vals2(val_id, field_id, val_values, data_id)
values (null, 3, '陕西省西安市雁塔区鱼化寨陕西省西安市雁塔区鱼化寨2', 2);


-- 系统日志信息
insert into sys_fields(FIELD_ID,FIELD_NAME,FIELD_COMMENTS,FIELD_LENGTH,FIELD_VERIFY,TAB_ID)
values (5, 'data_id', '数据id', 10, '', 2);

insert into sys_vals1(val_id, field_id, val_values, data_id)
values (null, 5, '1', 1);
insert into sys_vals1(val_id, field_id, val_values, data_id)
values (null, 5, '2', 2);


create view if not exists sys_val_v as
    select val_id, field_id, val_values, data_id from sys_vals1
        union
    select val_id, field_id, val_values, data_id from sys_vals2;



