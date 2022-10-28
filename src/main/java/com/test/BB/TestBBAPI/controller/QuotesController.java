package com.test.BB.TestBBAPI.controller;

import com.test.BB.TestBBAPI.model.QuotesListResponse;
import com.test.BB.TestBBAPI.service.QuotesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesController {

    private final QuotesService quotesService;

    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("/quotes")
    public QuotesListResponse getAllQuotes() {
        QuotesListResponse quotesListResponse = new QuotesListResponse();
        quotesListResponse.setData(quotesService.getAllQuotes());
        return quotesListResponse;
    }
}
