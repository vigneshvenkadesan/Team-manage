package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.entity.Player;
import com.spring.service.PlayerService;


@RequestMapping("/team")
@Controller
public class AppController {
	
	
	@Autowired
	private PlayerService playerService;

	@GetMapping("/list")
	public String showPlayers(Model theModel)
	{
		

		List<Player> listPlayers = playerService.getPlayers();
		
		theModel.addAttribute("listPlayers", listPlayers);
		
		return "list-player";
	}
	
	
	@GetMapping("/showForAdd")
	public String AddForm(Model theModel)
	{
		
		Player player = new Player();
		theModel.addAttribute("thePlayer",player);
		
		return "add-player";
	}
	
	@PostMapping("/savePlayer")
	public String addPlayer(@Valid @ModelAttribute("thePlayer") Player thePlayer, BindingResult theBindingResult)
	{		
		
		
		if(theBindingResult.hasErrors())
			{return "add-player";}
		else {
			playerService.savePlayer(thePlayer);
		 return "redirect:/team/list";}
	}
	

	@GetMapping("/showSort")
	public String sortByFirstname(Model theModel)
	{		
	
		
		List<Player> listPlayers = playerService.getSortedPlayers();
		
		theModel.addAttribute("listPlayers", listPlayers);
		
		return "list-player";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String UpdateForm(@RequestParam("PlayerID") int theId,Model theModel)
	{
		Player player = playerService.getPlayer(theId);
		
		theModel.addAttribute("thePlayer",player);
		
		return "add-player";
	}
	
	@GetMapping("/showFormForDelete")
	public String DeleteForm(@RequestParam("PlayerID") int theId,Model theModel)
	{
		playerService.deletePlayer(theId);
		
		return "redirect:/team/list";
	}
}
