Create table t_user( id number(6),username varchar2(20),password varchar2(20),age number(6) );
-- 创建序列
create sequence user_seq
increment by 1 start with 1 nomaxvalue nominvalue nocache

-- 创建触发器
create or replace trigger tr_user before insert on t_user for each row begin select user_seq.nextval into :new.id from dual; end;

