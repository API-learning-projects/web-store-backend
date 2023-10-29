package org.example.controllers;

import lombok.Setter;
import org.example.dtos.OutgoingLogin;
import org.example.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@Setter( onMethod_ = { @Autowired } )
public class AccountController {
	
	private AccountService accountService;
	
	@ResponseStatus( HttpStatus.OK )
	@PostMapping( value = "/login", produces = "application/json" )
	public OutgoingLogin login() {
		return accountService.login();
	}
	
	@ResponseStatus( HttpStatus.OK )
	@PostMapping( value = "/register", produces = "application/json" )
	public void register() {
		accountService.register();
	}
}
