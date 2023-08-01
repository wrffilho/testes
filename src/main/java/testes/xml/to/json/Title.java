package testes.xml.to.json;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Title {
	@JacksonXmlProperty(isAttribute = true)
	private String lang;

	@JacksonXmlText
    private String content;

	// Getters e setters (não mostrados para brevidade)
}
