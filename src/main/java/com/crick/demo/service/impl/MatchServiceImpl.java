package com.crick.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.crick.demo.dto.MatchDetailDto;
import com.crick.demo.dto.MatchResultDto;
import com.crick.demo.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService{

	@Value("${apikey}")
	private String apikey;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public MatchDetailDto getMatchDetails(Integer matchId) {
		
		 UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://cricapi.com/api/cricketScore")
		         .queryParam("apikey", apikey)
		         .queryParam("unique_id", matchId);
		        

		 MatchResultDto matchResultDto = restTemplate.getForObject(builder.toUriString(), MatchResultDto.class);
		 String winningTeam = getWiningTeam(matchResultDto);
		 MatchDetailDto matchDetailDto = new MatchDetailDto(matchResultDto.getScore(),matchResultDto.getTeam1(),matchResultDto.getTeam2(),winningTeam);
		 return matchDetailDto;
	}

	private String getWiningTeam(MatchResultDto matchResultDto) {
		String[] scores = matchResultDto.getScore().split("v");
		String team1Score =  scores[0].replace(matchResultDto.getTeam1(),"").split("/")[0].trim();
		String team2Score =  scores[1].replace(matchResultDto.getTeam2(),"").split("/")[0].trim();
		return Integer.valueOf(team1Score) > Integer.valueOf(team2Score) ? matchResultDto.getTeam1() :  matchResultDto.getTeam2();
	}

}
