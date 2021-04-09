package com.example.jira.rest.api.service;

import com.example.jira.rest.api.model.IssueDTO;

public interface JiraService {
	
	public String getIssue(String key);
	
	public String createIssue(IssueDTO issue);

}
