/**
 * 
 */
package com.example.jira.rest.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.jira.rest.api.model.JiraClient;

/**
 * @author abdare
 *
 */
@Configuration
public class JiraClientConfig {
	
	@Bean
	public JiraClient jiraClient() {
		return new JiraClient("mail.abdare@gmail.com", "J3Nq0K43RdTSqd23q15g44EA", "https://abdare.atlassian.net");
	}
	
}
