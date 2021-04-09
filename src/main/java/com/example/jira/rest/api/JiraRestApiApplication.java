package com.example.jira.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JiraRestApiApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JiraRestApiApplication.class, args);
		
		/*
		 * JiraClient myJiraClient = new JiraClient("mail.abdare@gmail.com",
		 * "J3Nq0K43RdTSqd23q15g44EA", "https://abdare.atlassian.net");
		 * 
		 * JiraRestClient client = myJiraClient.getRestClient();
		 * 
		 * Promise<Issue> issuePromise = client.getIssueClient().getIssue("MB1-3");
		 * Optional<Issue> i = Optional.ofNullable((Issue) issuePromise.claim());
		 * 
		 * 
		 * System.out.println(i.get());
		 */
		
//		Iterable<BasicProject> project = client.getProjectClient().getAllProjects().claim();
		
		/*
		 * Promise<User> promise = client.getUserClient().getUser("admin"); User user =
		 * promise.claim(); System.out.println(user.getEmailAddress());
		 */
		
		/*
		 * if(client.getSessionClient().getCurrentSession()!=null) {
		 * System.out.println(client.getSessionClient().getCurrentSession());
		 * System.out.println("Session"); }
		 */
			
		
		/*
		 * for(BasicProject pr : project) { //BasicProject project = pr.getName();
		 * System.out.println(pr.getName() + " " + pr.getKey()); }
		 */
		
		
	}

}
