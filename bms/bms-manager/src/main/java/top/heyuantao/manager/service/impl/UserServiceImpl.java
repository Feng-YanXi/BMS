package top.heyuantao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.heyuantao.manager.mapper.UserMapper;
import top.heyuantao.manager.pojo.User;
import top.heyuantao.manager.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
   private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	
}
