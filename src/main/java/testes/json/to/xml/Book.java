package testes.json.to.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	@XmlAttribute
	private String id;
	private String title;
	private String author;
	private String genre;
	private double price;
	@XmlElement(name = "publish_date")
	private String publishDate;
	private String description;

	// Getters e Setters (não mostrados aqui para manter o exemplo conciso)

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", price=" + price
				+ ", publishDate=" + publishDate + ", description=" + description + "]";
	}
}