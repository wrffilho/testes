package testes.xml.to.json;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Books {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Book> book;

    // Getters e setters (não mostrados para brevidade)
}

