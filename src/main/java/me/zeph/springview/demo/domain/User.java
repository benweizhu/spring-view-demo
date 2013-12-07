package me.zeph.springview.demo.domain;


import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty
	private String name;
	private String gender;
	private String password;
	private boolean agree;
	private String server;
	private String[] channels;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String[] getChannels() {
		return channels;
	}

	public void setChannels(String[] channels) {
		this.channels = channels;
	}

	public boolean isAgree() {
		return agree;
	}

	public void setAgree(boolean agree) {
		this.agree = agree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
