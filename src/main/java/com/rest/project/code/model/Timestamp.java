package com.rest.project.code.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Timestamp {

	private String timestamp;
	private long calls;
	
	public Timestamp() {
	}
	public Timestamp(String timestamp, long calls) {
		super();
		this.timestamp = timestamp;
		this.calls = calls;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public long getCalls() {
		return calls;
	}
	public void setCalls(long calls) {
		this.calls = calls;
	}
}
