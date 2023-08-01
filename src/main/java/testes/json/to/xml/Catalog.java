package testes.json.to.xml;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Catalog {
	private String carro;
	private String endereco;
	@XmlElementWrapper(name = "books")
	@XmlElement(name = "book")
	private List<Book> books;

	// Getters e Setters (não mostrados aqui para manter o exemplo conciso)

	@Override
	public String toString() {
		return "Catalog [carro=" + carro + ", endereco=" + endereco + ", books=" + books + "]";
	}

}
