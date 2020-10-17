package com.landon.chat.model;

import java.util.Date;

public class ChatOutMessage {

	private String content;
	private String groupName;
	private Date sentTimestamp;
	
	public ChatOutMessage() {
		
	}
	
	public ChatOutMessage(String content) {
        this.content = content;
    }
	 
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getSentTimestamp() {
		return sentTimestamp;
	}

	public void setSentTimestamp(Date sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}
	
}
