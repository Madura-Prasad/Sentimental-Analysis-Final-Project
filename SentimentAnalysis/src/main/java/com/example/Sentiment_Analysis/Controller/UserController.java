package com.example.Sentiment_Analysis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Sentiment_Analysis.Repository.UserRepo;

@Controller
@CrossOrigin("*")
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;

}
