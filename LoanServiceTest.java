package com.p2p;

import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;
import com.p2p.service.LoanService;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

// LOG4J
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoanServiceTest {

    private static final Logger logger = LogManager.getLogger(LoanServiceTest.class);

    // =========================
    // TC-01
    // =========================
    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {

        logger.info("TC-01 START");

        Borrower borrower = new Borrower(false, 700);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount);
        });

        logger.info("TC-01 END");
    }

    // =========================
    // TC-02
    // =========================
    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {

        logger.info("TC-02 START");

        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.ZERO;

        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount);
        });

        logger.info("TC-02 END");
    }

    // =========================
    // TC-03
    // =========================
    @Test
    void shouldApproveLoanWhenCreditScoreHigh() {

        logger.info("TC-03 START");

        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);

        Loan loan = loanService.createLoan(borrower, amount);

        assertEquals(Loan.Status.APPROVED, loan.getStatus());

        logger.info("TC-03 END");
    }

    // =========================
    // TC-04
    // =========================
    @Test
    void shouldRejectLoanWhenCreditScoreLow() {

        logger.info("TC-04 START");

        Borrower borrower = new Borrower(true, 500);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);

        Loan loan = loanService.createLoan(borrower, amount);

        assertEquals(Loan.Status.REJECTED, loan.getStatus());

        logger.info("TC-04 END");
    }
}