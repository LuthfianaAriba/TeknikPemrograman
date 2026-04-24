package com.p2p.domain;

public class Loan {

    // ENUM STATUS
    public enum Status {
        PENDING,
        APPROVED,
        REJECTED
    }

    private Status status;

    // Constructor → default PENDING
    public Loan() {
        this.status = Status.PENDING;
    }

    // Getter
    public Status getStatus() {
        return status;
    }

    // DOMAIN BEHAVIOR
    public void approve() {
        this.status = Status.APPROVED;
    }

    public void reject() {
        this.status = Status.REJECTED;
    }
}