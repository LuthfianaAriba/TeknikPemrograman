package com.p2p.domain;

public class Borrower {

    private boolean verified;
    private int creditScore;

    // Constructor
    public Borrower(boolean verified, int creditScore) {
        this.verified = verified;
        this.creditScore = creditScore;
    }

    // Getter
    public boolean isVerified() {
        return verified;
    }

    public int getCreditScore() {
        return creditScore;
    }

    // DOMAIN BEHAVIOR (hasil refactor)
    public boolean canApplyLoan() {
        return verified;
    }
}