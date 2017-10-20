package ggauthority.v1.user.service;

import ggauthority.v1.user.entity.User;
/**
 * 
 * @author yaomy
 *
 */
public interface UserService {
	/**
	 * 
	 * @Description:创建对象
	 * @author yaomy
	 * @date 2017年10月20日 上午10:50:49
	 */
	public void saveUser(User user);
	/**
	 * 
	 * @Description:根据用户名查询对象
	 * @author yaomy
	 * @date 2017年10月20日 上午10:51:10
	 */
	public User findUserByUserName(String userName);
	public void updateUser(User user);//更新对象
	public void deleteUserById(Long id);//删除对象
}
