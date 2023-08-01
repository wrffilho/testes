package testes.xml.to.json;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    @JacksonXmlProperty(isAttribute = true)
    private String id;

    private Title title;

    @JacksonXmlProperty(localName = "author")
    private String author;

    @JacksonXmlProperty(localName = "genre")
    private String genre;

    private Price price;

    @JacksonXmlProperty(localName = "publish_date")
    private String publishDate;

    @JacksonXmlProperty(localName = "description")
    private String description;

    // Getters e setters (não mostrados para brevidade)
}

