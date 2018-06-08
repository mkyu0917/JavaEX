package com.javaex.api.objectclass.ex04;

import java.util.Arrays;

public class ScoreBoard implements Cloneable {
	private int scores[];
	
	// ������
	public ScoreBoard(int[] scores){
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
		output += ")";
		return output;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ������ �õ�
		ScoreBoard clone = (ScoreBoard)super.clone();
		// ���� ���� ��ü ���� �õ�
		clone.scores = Arrays.copyOf(scores, scores.length);
		return super.clone();
	}
	

}

