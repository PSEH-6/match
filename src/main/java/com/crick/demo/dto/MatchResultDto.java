package com.crick.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


public class MatchResultDto {


	@JsonProperty("stat")
	private String stat;
	@JsonProperty("score")
	private String score;
	@JsonProperty("description")
	private String description;
	@JsonProperty("matchStarted")
	private Boolean matchStarted;
	@JsonProperty("team-1")
	private String team1;
	@JsonProperty("team-2")
	private String team2;
	
	public MatchResultDto() {
		super();
	}

	public MatchResultDto(String stat, String score, String description, Boolean matchStarted, String team1,
			String team2) {
		super();
		this.stat = stat;
		this.score = score;
		this.description = description;
		this.matchStarted = matchStarted;
		this.team1 = team1;
		this.team2 = team2;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getMatchStarted() {
		return matchStarted;
	}

	public void setMatchStarted(Boolean matchStarted) {
		this.matchStarted = matchStarted;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	    
}
