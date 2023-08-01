package testes.xml.to.json;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {
	@JacksonXmlProperty(isAttribute = true)
	private String currency;

	@JacksonXmlText
    private String content;

	// Getters e setters (não mostrados para brevidade)
}
