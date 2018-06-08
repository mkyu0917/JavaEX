package com.javaex.api.objectclass.ex05;

public class ScoreBoard implements Cloneable {
	private int scores[];
	
	// »ý¼ºÀÚ
	public ScoreBoard(int[] is, int[] scores){
		this.scores=scores;
	}

	public ScoreBoard getClone(){
		ScoreBoard clone = null;
		
		try{
			clone = (ScoreBoard)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	public String toString() {
		String output = "ScoreBoard(";
		
		for(int i=0; i<scores.length; i++){
			output += scores[i];
			if (i < scores.length -1){
				output +=",";
			}
		}
		output +=")";
		return output;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	

}

