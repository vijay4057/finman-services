package com.finman.sequence;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SequenceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SequenceService.class);

    @Resource
    SequenceRepository sequenceRepository;

    public Integer getCustomerSequence() {
        try {
            return sequenceRepository.getCustomerSequence();
        } catch (Exception e) {
            LOGGER.error("Error in getting customer sequence ", e);
        }
        return null;
    }

    public Integer getLoanSequence() {
        try {
            return sequenceRepository.getLoanSequence();
        } catch (Exception e) {
            LOGGER.error("Error in getting Loan sequence ", e);
        }
        return null;
    }
}
