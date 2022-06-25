package com.demo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entities.AuthRequest;
import com.demo.project.entities.MyUser;
import com.demo.project.service.MyUserDetailsService;
import com.demo.project.util.JwtUtil;



@RestController
public class MyUserController {
	@Autowired
	private MyUserDetailsService us;
	
	@Autowired
	private JwtUtil jwtUtil;
	
    @Autowired
    private AuthenticationManager authenticationManager;

	@PostMapping("/signup")
	public MyUser signup(@RequestBody MyUser user)
	{
		return us.registerMyUser(user);
	}
	
    @PostMapping("/login")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }


    @GetMapping("/home")
    public String welcome() {
        return "Welcome to our ecome website!!";
    }
}

