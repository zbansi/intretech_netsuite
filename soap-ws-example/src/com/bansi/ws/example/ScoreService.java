package com.bansi.ws.example;

import javax.ejb.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class ScoreService {
	private static Score score = new Score();

	public Score getScore() {
		return score;
	}

	public int increaseWins() {
		return ++score.wins;
	}

	public int increaseTies() {
		return ++score.ties;
	}

	public int increaseLoss() {
		return ++score.loss;
	}

	public int getWins() {
		return score.wins;
	}

	public int getTies() {
		return score.ties;

	}

	public int getLoss() {
		return score.loss;

	}

	public Score updateScore(int wins, int ties, int loss) {
		score.wins = wins;
		score.ties = ties;
		score.loss = loss;
		return score;

	}

	@WebMethod(operationName = "resetScore")
	public void reset() {
		score.wins = score.ties = score.loss = 0;

	}
}