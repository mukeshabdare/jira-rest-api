/**
 * 
 */
package com.example.jira.rest.api.model;

/**
 * @author abdare
 *
 */
public class IssueDTO {
	
	private String projectKey;
	private Long issueType; 
	private String issueSummary;
	
	public IssueDTO(String projectKey, Long issueType, String issueSummary) {
		super();
		this.projectKey = projectKey;
		this.issueType = issueType;
		this.issueSummary = issueSummary;
	}

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	public Long getIssueType() {
		return issueType;
	}

	public void setIssueType(Long issueType) {
		this.issueType = issueType;
	}

	public String getIssueSummary() {
		return issueSummary;
	}

	public void setIssueSummary(String issueSummary) {
		this.issueSummary = issueSummary;
	}
	

}
