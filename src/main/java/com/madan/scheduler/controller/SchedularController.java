package com.madan.scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madan.scheduler.dto.TestDTO;

@RestController
@RequestMapping("schedule")
public class SchedularController {

	@Autowired
	private TaskScheduler taskScheduler;

	@GetMapping("test")
	public TestDTO getTest() {
		System.out.println(taskScheduler.toString());
		return new TestDTO(1, "test");
	}

}
