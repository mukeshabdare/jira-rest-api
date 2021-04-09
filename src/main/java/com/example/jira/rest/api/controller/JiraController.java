/**
 * 
 */
package com.example.jira.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jira.rest.api.model.IssueDTO;
import com.example.jira.rest.api.service.JiraService;

/**
 * @author abdare
 *
 */

@RestController
@RequestMapping("/jira-api")
public class JiraController {
	
	@Autowired
	private JiraService jiraService;
	
	@GetMapping("/getIssue/{key}")
	public String getIssue(@PathVariable String key) {
		
		return jiraService.getIssue(key);
	
	}
	
	@PostMapping("/createIssue")
	public String createIssue(@RequestBody IssueDTO issue) {
		
		return jiraService.createIssue(issue);
		
	}
	
	
}
