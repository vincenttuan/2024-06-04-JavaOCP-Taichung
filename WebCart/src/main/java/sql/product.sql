-- 建立商品表
create table if not exists product (
	product_id int primary key comment '商品ID',
    product_name varchar(50) not null unique comment '商品名稱',
    price int not null comment '商品價格',
    qty int default 0 comment '商品庫存'
);

-- 建立商品數據資料
insert into product (product_id, product_name, price, qty) values (101, "紅茶", 10, 20);
insert into product (product_id, product_name, price, qty) values (102, "綠茶", 15, 30);
insert into product (product_id, product_name, price, qty) values (103, "奶茶", 25, 40);
insert into product (product_id, product_name, price, qty) values (201, "拿鐵", 60, 50);
insert into product (product_id, product_name, price, qty) values (202, "美式", 40, 60);
