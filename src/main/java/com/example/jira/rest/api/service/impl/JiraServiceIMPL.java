/**
 * 
 */
package com.example.jira.rest.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.example.jira.rest.api.model.IssueDTO;
import com.example.jira.rest.api.model.JiraClient;
import com.example.jira.rest.api.service.JiraService;

import io.atlassian.util.concurrent.Promise;

/**
 * @author abdare
 *
 */
@Service
public class JiraServiceIMPL implements JiraService{
	
	@Autowired
	private JiraClient myJiraClient;

	@Override
	public String getIssue(String key) {
		Promise<Issue> issuePromise = myJiraClient.getRestClient().getIssueClient().getIssue(key);
        Optional<Issue> issue = Optional.ofNullable((Issue) issuePromise.claim());
		return issue.get().getDescription();
	}

	@Override
	public String createIssue(IssueDTO issue) {
		IssueRestClient issueClient = myJiraClient.getRestClient().getIssueClient();
		IssueInput newIssue = new IssueInputBuilder(issue.getProjectKey(), issue.getIssueType(), issue.getIssueSummary()).build();
		return issueClient.createIssue(newIssue).claim().getKey();
		
	}

}
