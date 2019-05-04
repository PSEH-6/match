package com.crick.demo.dto;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MatchDetailDto {
		public String score;
	 	@SerializedName("Team-1")
	    public String teamOne;
	    @SerializedName("Team-2")
	    public String teamTwo;
	    public String winningTeam;
	    
	    
	    
		public MatchDetailDto() {
			super();
		}

		public MatchDetailDto(String score, String teamOne, String teamTwo, String winningTeam) {
			super();
			this.score = score;
			this.teamOne = teamOne;
			this.teamTwo = teamTwo;
			this.winningTeam = winningTeam;
		}
		
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
		public String getTeamOne() {
			return teamOne;
		}
		public void setTeamOne(String teamOne) {
			this.teamOne = teamOne;
		}
		public String getTeamTwo() {
			return teamTwo;
		}
		public void setTeamTwo(String teamTwo) {
			this.teamTwo = teamTwo;
		}

		public String getWinningTeam() {
			return winningTeam;
		}

		public void setWinningTeam(String winningTeam) {
			this.winningTeam = winningTeam;
		}
	    
	    
}
