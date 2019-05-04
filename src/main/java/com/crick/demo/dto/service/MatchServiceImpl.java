package com.crick.demo.dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.crick.demo.dto.MatchDetailDto;
import com.crick.demo.dto.MatchResultDto;

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
		 MatchDetailDto matchDetailDto = new MatchDetailDto(matchResultDto.getScore(),matchResultDto.getTeam1(),matchResultDto.getTeam2());
		 return matchDetailDto;
	}

}
