package com.finman.sequence;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SequenceRepositoryImpl implements SequenceRepository {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Override
    public Integer getCustomerSequence() {
        Integer customerSeq = jdbcTemplate.queryForObject("select customer from settings", Integer.class);
        Integer newCustomerSeq = customerSeq + 1;
        jdbcTemplate.update("update settings set customer=?", new Object[] {newCustomerSeq});
        return customerSeq;
    }

    @Override
    public Integer getLoanSequence() {
        Integer loanSeq = jdbcTemplate.queryForObject("select loan from settings", Integer.class);
        Integer newLoanSeq = loanSeq + 1;
        jdbcTemplate.update("update settings set loan=?", new Object[] {newLoanSeq});
        return loanSeq;
    }

}
