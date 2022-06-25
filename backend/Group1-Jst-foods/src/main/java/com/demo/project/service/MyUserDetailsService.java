package com.demo.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.project.entities.MyUser;
import com.demo.project.repository.MyUserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	private MyUserRepository mur;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> temp = mur.findById(username);
		MyUser myUser=null;
		if(temp.isPresent())
		{
			myUser=temp.get();
		}
		return myUser;
	}
	
	public MyUser registerMyUser(MyUser myUser)
	{
		return mur.save(myUser);
	}

}

