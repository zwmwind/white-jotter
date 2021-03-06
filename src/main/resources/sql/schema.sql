-- 用户表
DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user (
    id SERIAL NOT NULL,
    username CHAR(255) DEFAULT NULL,
    password CHAR(255) DEFAULT NULL
);

-- 后端拦截器权限表
DROP TABLE IF EXISTS t_require_auth_page;
CREATE TABLE t_require_auth_page (
    id SERIAL NOT NULL,
    page TEXT NOT NULL
)
