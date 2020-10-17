package com.landon.chat.model;

import java.util.Date;

public class ChatInMessage {

    private String senderId;
    private String senderName;
    private String message;
    private Date sentTimestamp;

    public ChatInMessage() {
    }

    public ChatInMessage(String message) {
        this.message = message;
    }

    public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

	public Date getSentTimestamp() {
		return sentTimestamp;
	}

	public void setSentTimestamp(Date sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}
}
