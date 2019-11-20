package com.javakc.ssm.user.service;

import com.javakc.ssm.user.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 添加用户
     * @param user 用户实现类
     * @return 状态
     */
    public int insert(User user);

    /**
     * 删除用户
     * @param id 主键
     * @return 状态
     */
    public int delete(String id);

    /**
     * 修改用户
     * @param user 用户实现类
     * @return 状态
     */
    public int update(User user);

    /**
     * 查询 总条数
     * @param user 动态参数
     * @return 符合条件结果
     */

    public long queryCount(User user);

    /**
     * 根据条件分页查询
     * @param user 动态参数
     * @return 符合条件的结果集
     */
    public List<User> queryByPage(User user,int start,int end);

    /**
     * 根据主键查询唯一结果
     * @param id 主键
     * @return 对象
     */
    public User queryById(String id);
}
