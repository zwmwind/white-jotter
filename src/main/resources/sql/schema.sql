-- 用户表
DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user(
    id SERIAL NOT NULL,
    username CHAR(255) DEFAULT NULL,
    password CHAR(255) DEFAULT NULL
);
