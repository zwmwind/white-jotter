-- 用户表数据
INSERT INTO t_user (username, password) VALUES ('admin', '123456');

-- 后端拦截器权限表数据
INSERT INTO t_require_auth_page (page) VALUES ('index');
