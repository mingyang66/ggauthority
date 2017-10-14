package ggauthority.v1.user.UserDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import ggauthority.v1.user.entity.User;
import ggauthority.v1.user.userDao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
    private MongoTemplate mongoTemplate;
	
	@Override
	public void saveUser(User user) {
		this.mongoTemplate.save(user);
		
	}

	@Override
	public User findUserByUserName(String userName) {
		Query query=new Query(Criteria.where("userName").is(userName));
        User user =  this.mongoTemplate.findOne(query , User.class);
        return user;
	}

	@Override
	public void updateUser(User user) {
		Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("userName", user.getUserName()).set("password", user.getPassword());
        //更新查询返回结果集的第一条
        this.mongoTemplate.updateFirst(query,update,User.class);
		
	}

	@Override
	public void deleteUserById(Long id) {
		Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,User.class);
		
	}

}
