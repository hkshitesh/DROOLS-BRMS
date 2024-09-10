package com.example;

public class Assessment {
	private String claimId;
    private double assessedAmount;
	public Assessment(String claimId, double assessedAmount) {
		super();
		this.claimId = claimId;
		this.assessedAmount = assessedAmount;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public double getAssessedAmount() {
		return assessedAmount;
	}
	public void setAssessedAmount(double assessedAmount) {
		this.assessedAmount = assessedAmount;
	}

    

}
