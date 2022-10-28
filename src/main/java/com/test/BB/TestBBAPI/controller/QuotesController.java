package com.test.BB.TestBBAPI.controller;

import com.test.BB.TestBBAPI.model.QuotesBB;
import com.test.BB.TestBBAPI.model.QuotesListResponse;
import com.test.BB.TestBBAPI.service.QuotesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotesController {

    private final QuotesService quotesService;

    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("/quotes")
    public List<QuotesBB> getAllQuotes() {
      //  QuotesListResponse quotesListResponse = new QuotesListResponse();
       // quotesListResponse.setData(quotesService.getAllQuotes());
        return quotesService.getAllQuotes();
    }

    @GetMapping("quotes/{id}")
    public List<QuotesBB> getQuoteById(@PathVariable String id) {
        List<QuotesBB> quotesBBList = new ArrayList<QuotesBB>();
        quotesBBList.add(quotesService.getQuoteById(id));
        return quotesBBList;
    }
}
