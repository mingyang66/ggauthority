package ggauthority.v1.user.service;

import ggauthority.v1.user.entity.User;

public interface UserService {
	public void saveUser(User user);//创建对象
	public User findUserByUserName(String userName);//根据用户名查询对象
	public void updateUser(User user);//更新对象
	public void deleteUserById(Long id);//删除对象
}
