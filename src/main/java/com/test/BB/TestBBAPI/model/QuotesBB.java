package com.test.BB.TestBBAPI.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class QuotesBB {

    @Id
    private String id;
    private String quote_id;
    private String author;
    private String quote;
    private String series;

    private String quoteId;

    @Override
    public String toString() {
        return (
                "<Quote::\r\n" + "quote_id:" + quote_id + "\r\n" +
                        "author:" + author + "\r\n" + "quote:" + quote + "\r\n" +
                        "\r\n" + "series" + series + "\r\n>"
        );
    }

}