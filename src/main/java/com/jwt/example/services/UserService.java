package com.jwt.example.services;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

import java.util.*;

@Service
public class UserService 
{
	private List<User> store = new ArrayList<>();
	
	public UserService() 
	{
		store.add(new User(UUID.randomUUID().toString(),"Rohit Ranjan","rohitranjansindri@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Sachin Pilot","Sachin24@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Prakash Raj","praj17@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Nitin Gadkari","roadmanindia@gmail.com"));
	}
	
	public List <User> getUsers()
	{
		return this.store;
	}
}
