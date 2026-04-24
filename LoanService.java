package com.p2p.service;

import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;

import java.math.BigDecimal;

// LOG4J
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoanService {

    private static final Logger logger = LogManager.getLogger(LoanService.class);

    public Loan createLoan(Borrower borrower, BigDecimal amount) {

        logger.info("Start createLoan process");

        // VALIDASI
        validateBorrower(borrower);
        validateAmount(amount);

        // BUAT LOAN
        Loan loan = new Loan();

        // CREDIT SCORING
        if (borrower.getCreditScore() >= 600) {
            loan.approve();
            logger.info("Loan APPROVED");
        } else {
            loan.reject();
            logger.info("Loan REJECTED");
        }

        logger.info("End createLoan process");
        return loan;
    }

    // =========================
    // VALIDASI BORROWER
    // =========================
    private void validateBorrower(Borrower borrower) {
        if (!borrower.canApplyLoan()) {
            logger.error("Borrower not verified");
            throw new IllegalArgumentException("Borrower not verified");
        }
    }

    // =========================
    // VALIDASI AMOUNT (TC-02)
    // =========================
    private void validateAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            logger.error("Invalid loan amount");
            throw new IllegalArgumentException("Amount must be > 0");
        }
    }
}