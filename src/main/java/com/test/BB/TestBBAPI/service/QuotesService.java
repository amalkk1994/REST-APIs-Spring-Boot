package com.test.BB.TestBBAPI.service;

import com.test.BB.TestBBAPI.model.QuotesBB;
import com.test.BB.TestBBAPI.repository.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class QuotesService {

    private final QuotesRepository quotesRepository;

    @Autowired
    public QuotesService(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    public List<QuotesBB> getAllQuotes() {
        return StreamSupport.stream(quotesRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
