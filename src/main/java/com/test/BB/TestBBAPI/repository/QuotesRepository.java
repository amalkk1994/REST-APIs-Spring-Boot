package com.test.BB.TestBBAPI.repository;

import com.test.BB.TestBBAPI.model.QuotesBB;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuotesRepository extends MongoRepository<QuotesBB, String> {
}
