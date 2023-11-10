package com.demo.package.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.package.model.LeadAutomationFlow;
import com.demo.package.service.LeadAutomationFlowService;

@RestController
@RequestMapping("/lead-automation-flows")
public class LeadAutomationFlowController {

	private final LeadAutomationFlowService leadAutomationFlowService;

	public LeadAutomationFlowController(LeadAutomationFlowService leadAutomationFlowService) {
		this.leadAutomationFlowService = leadAutomationFlowService;
	}

	@GetMapping
	public List<LeadAutomationFlow> getAllLeadAutomationFlow() {
		return leadAutomationFlowService.getAllLeadAutomationFlow();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createLeadAutomationFlow(@RequestBody LeadAutomationFlow leadAutomationFlow) {
		leadAutomationFlowService.createLeadAutomationFlow(leadAutomationFlow);
	}

	@PutMapping
	public void updateLeadAutomationFlow(@RequestBody LeadAutomationFlow leadAutomationFlow) {
		leadAutomationFlowService.updateLeadAutomationFlow(leadAutomationFlow);
	}

	@DeleteMapping
	public void deleteLeadAutomationFlow(long id) {
		leadAutomationFlowService.deleteLeadAutomationFlow(id);
	}

	@PostMapping("/test")
	public void testLeadAutomationFlow(@RequestBody LeadAutomationFlow leadAutomationFlow) {
		leadAutomationFlowService.testLeadAutomationFlow(leadAutomationFlow);
	}

	@PostMapping("/deploy")
	public void deployLeadAutomationFlow(@RequestBody LeadAutomationFlow leadAutomationFlow) {
		leadAutomationFlowService.deployLeadAutomationFlow(leadAutomationFlow);
	}

	@PostMapping("/monitor")
	public void monitorLeadAutomationFlow(@RequestBody LeadAutomationFlow leadAutomationFlow) {
		leadAutomationFlowService.monitorLeadAutomationFlow(leadAutomationFlow);
	}

	@PostMapping("/track")
	public void trackLeadAutomationFlow(@RequestBody LeadAutomationFlow leadAutomationFlow) {
		leadAutomationFlowService.trackLeadAutomationFlow(leadAutomationFlow);
	}

}