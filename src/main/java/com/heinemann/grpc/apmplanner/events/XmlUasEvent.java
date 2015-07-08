package com.heinemann.grpc.apmplanner.events;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlUasEvent {

	private String identifier;
	private String source;
	private String parameters;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

}
