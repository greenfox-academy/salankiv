package com.greenfox.todoembedded.controller;

import com.greenfox.todoembedded.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

	@Autowired
	TodoRepository todoRepository;

	@RequestMapping(value = {"/", "/list"})
	public String list(Model model) {
		model.addAttribute("todos", todoRepository.findAll());
		return "todoslist";
	}
}
