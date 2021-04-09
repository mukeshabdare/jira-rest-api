/**
 * 
 */
package com.example.jira.rest.api.model;

import java.net.URI;
import java.util.Base64;

import com.atlassian.httpclient.api.Request.Builder;
import com.atlassian.jira.rest.client.api.AuthenticationHandler;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

/**
 * @author abdare
 *
 */
public class JiraClient {
	
	private String username;
	private String password; 
	private String jiraUrl;
	private JiraRestClient restClient;
	
	public JiraClient(String username, String password, String jiraUrl) {
		this.username = username;
		this.password = password;
		this.jiraUrl = jiraUrl;
		this.restClient = getJiraRestClient();
	}
	
	public JiraRestClient getRestClient() {
		return restClient;
	}
	
	private URI getJiraUri() {
		
		return URI.create(this.jiraUrl);

	}
	
	private JiraRestClient getJiraRestClient() {

		return new AsynchronousJiraRestClientFactory()
	    	.createWithAuthenticationHandler(getJiraUri(), new AuthenticationHandler() {
				
				@Override
				public void configure(Builder builder) {
						
					builder.setHeader("Authorization", "Basic " +base64EncodedCredentials());
			
				}

				private String base64EncodedCredentials() {
					String encodedString = Base64.getEncoder().encodeToString(
							(username+":"+password).getBytes());
					return encodedString;
				}
			})	;
	}
	

}
