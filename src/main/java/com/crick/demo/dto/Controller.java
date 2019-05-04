package com.crick.demo.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.crick.demo.dto.service.MatchService;

@RestController
public class Controller {
	

	
	@Autowired
	MatchService matchService;
	
	 @RequestMapping("/score")
	 public MatchDetailDto score(@RequestParam(value="matchId") Integer matchId) {
		 
		 return matchService.getMatchDetails(matchId); 
	 }

}
