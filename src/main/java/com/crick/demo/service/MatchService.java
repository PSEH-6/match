package com.crick.demo.service;

import com.crick.demo.dto.MatchDetailDto;

public interface MatchService {

	MatchDetailDto getMatchDetails(Integer matchId);
}
