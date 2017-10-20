package ggauthority.v1.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ggauthority.v1.user.entity.User;
import ggauthority.v1.user.service.UserService;
import ggauthority.v1.user.userDao.UserDao;
/**
 * 
 * @author yaomy
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void saveUser(User user) {
		this.userDao.saveUser(user);
	}

	@Override
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return this.userDao.findUserByUserName(userName);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		this.userDao.deleteUserById(id);
	}

}
