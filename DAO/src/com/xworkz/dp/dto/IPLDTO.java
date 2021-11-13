package com.xworkz.dp.dto;

public class IPLDTO {
	private String teamname;
	private Integer teamsize;
	private String ownername;
	private String sponsorname;
	private String homeground;

	public IPLDTO() {
		System.out.println("Invoked ano argument constructor");
	}

	public IPLDTO(String teamname, Integer teamsize, String ownername, String sponsorname, String homeground) {
		super();
		this.teamname = teamname;
		this.teamsize = teamsize;
		this.ownername = ownername;
		this.sponsorname = sponsorname;
		this.homeground = homeground;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Integer getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(Integer teamsize) {
		this.teamsize = teamsize;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getSponsorname() {
		return sponsorname;
	}

	public void setSponsorname(String sponsorname) {
		this.sponsorname = sponsorname;
	}

	public String getHomeground() {
		return homeground;
	}

	public void setHomeground(String homeground) {
		this.homeground = homeground;
	}




}
