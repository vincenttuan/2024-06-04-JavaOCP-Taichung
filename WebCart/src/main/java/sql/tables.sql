-- 刪除資料表
drop table if exists product;
drop table if exists users;
drop table if exists orders;
drop table if exists order_items;

/*
-- 商品 product
+------------+--------------+--------+-----+
| product_id | product_name | price  | qty |
+------------+--------------+--------+-----+
| 101        | Black Tea    | 10     | 20  |
| 102        | Green Tea    | 15     | 30  |
| 103        | Milk  Tea    | 25     | 40  |
| 104        | Latte        | 60     | 50  |
| 105        | Black Coffee | 40     | 60  |
+------------+--------------+--------+-----+
*/
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

/*
-- 使用者 users
+---------+----------+----------+----------+
| user_id | username | password | priority |
+---------+----------+----------+----------+
| 1       | admin    | 1234     | 2        |
| 2       | john     | 5678     | 1        |
| 3       | mary     | 1111     | 1        |
| 4       | helen    | 2222     | 1        |
| 5       | eva      | 3333     | 1        |
+----------+---------+----------+----------+
*/
-- 建立 users 資料表，設定 user_id 為自動遞增
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'User ID', 
    username VARCHAR(50) NOT NULL COMMENT 'Username',
    password VARCHAR(50) NOT NULL COMMENT 'Password',
    priority INT NOT NULL COMMENT 'Priority Level'
);

-- 插入資料，不需指定 user_id
INSERT INTO users (username, password, priority) VALUES 
('admin', '1234', 2),
('john', '5678', 1),
('mary', '1111', 1),
('helen', '2222', 1),
('eva', '3333', 1);

/*
-- 訂單 orders
+----------+---------+------------+--------------+--------------+
| order_id | user_id | order_date | total_amount | order_status |
+----------+---------+------------+--------------+--------------+
| 1        | 1       | 2024-09-19 | 33000.00     | Finished     |
| 2        | 2       | 2024-09-20 | 15000.00     | Pending      |
| 3        | 3       | 2024-09-21 | 23000.00     | Finished     |
| 4        | 4       | 2024-09-22 | 8000.00      | Pending      |
| 5        | 5       | 2024-09-23 | 18000.00     | Cancel       |
+----------+---------+------------+--------------+--------------+
*/
-- 建立訂單表 (orders)，order_id 自動遞增
CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '訂單ID',
    user_id INT NOT NULL COMMENT '使用者ID',
    order_date DATE NOT NULL COMMENT '訂單日期',
    total_amount DECIMAL(10, 2) NOT NULL COMMENT '總金額',
    order_status VARCHAR(20) NOT NULL COMMENT '訂單狀態',
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE -- 聯集刪除(確保資料的一致性，避免孤立或無效的外鍵關聯。)
);

-- 插入訂單資料
INSERT INTO orders (user_id, order_date, total_amount, order_status) VALUES 
(1, '2024-09-19', 33000.00, 'Finished'),
(2, '2024-09-20', 15000.00, 'Pending'),
(3, '2024-09-21', 23000.00, 'Finished'),
(4, '2024-09-22', 8000.00, 'Pending'),
(5, '2024-09-23', 18000.00, 'Cancel');


/*
-- 訂單項目 order_items
+---------+----------+------------+----------+------------+
| item_id | order_id | product_id | quantity | unit_price |
+---------+----------+------------+----------+------------+
| 1       | 1        | 1          | 1        | 30000.00   |
| 2       | 1        | 3          | 1        | 3000.00    |
| 3       | 2        | 2          | 1        | 15000.00   |
| 4       | 3        | 4          | 1        | 20000.00   |
| 5       | 3        | 3          | 1        | 3000.00    |
| 6       | 4        | 5          | 1        | 8000.00    |
| 7       | 5        | 2          | 1        | 15000.00   |
| 8       | 5        | 3          | 1        | 3000.00    |
+---------+----------+------------+----------+------------+

*/

-- 建立訂單項目表 (order_items)，item_id 自動遞增
CREATE TABLE order_items (
    item_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '項目ID',
    order_id INT NOT NULL COMMENT '訂單ID',
    product_id INT NOT NULL COMMENT '商品ID',
    quantity INT NOT NULL COMMENT '數量',
    unit_price DECIMAL(10, 2) NOT NULL COMMENT '單價',
    FOREIGN KEY (order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES product(product_id) ON DELETE CASCADE
);

-- 插入訂單項目資料
INSERT INTO order_items (order_id, product_id, quantity, unit_price) VALUES 
(1, 1, 1, 30000.00),
(1, 3, 1, 3000.00),
(2, 2, 1, 15000.00),
(3, 4, 1, 20000.00),
(3, 3, 1, 3000.00),
(4, 5, 1, 8000.00),
(5, 2, 1, 15000.00),
(5, 3, 1, 3000.00);
