package testes.xml.to.json;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public Catalog iniciar(File xmlFile) {
		Catalog catalog = null;
		try {
			ObjectMapper xmlMapper = new XmlMapper();
			catalog = xmlMapper.readValue(xmlFile, Catalog.class);

			// Acessar os dados do POJO
			// System.out.println("Carro: " + catalog.getCarro());
			// System.out.println("Endereço: " + catalog.getEndereco());

			/*
			 * if (catalog.getBooks() != null && catalog.getBooks().getBook() != null) { for
			 * (Book book : catalog.getBooks().getBook()) { System.out.println("ID: " +
			 * book.getId()); System.out.println("Title (Language): " +
			 * book.getTitle().getLang()); System.out.println("Title (Content): " +
			 * book.getTitle().getContent()); System.out.println("Author: " +
			 * book.getAuthor()); System.out.println("Genre: " + book.getGenre());
			 * System.out.println("Price: " + book.getPrice().getContent() + " " +
			 * book.getPrice().getCurrency()); System.out.println("Publish Date: " +
			 * book.getPublishDate()); System.out.println("Description: " +
			 * book.getDescription()); System.out.println(); } }
			 */

			JsonNode jsonNode = xmlMapper.readTree(xmlFile);
			System.out.println(jsonNode.get("carro"));

			String jsonString = getJsonString(jsonNode);
			
			System.out.println(jsonString);

			return catalog;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return catalog;

	}

	public static void main(String[] args) {
		File xmlFile = new File("C:\\Users\\wande\\Downloads\\xml\\web.xml");

		Main m = new Main();
		Catalog c = m.iniciar(xmlFile);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(c);

		System.out.println(json);
		
      


	}

	private static String getJsonString(JsonNode node) {
		if (node.isObject()) {
			StringBuilder sb = new StringBuilder();
			Iterator<String> fieldNames = node.fieldNames();
			while (fieldNames.hasNext()) {
				String fieldName = fieldNames.next();
				JsonNode fieldValue = node.get(fieldName);
				if (fieldValue.isTextual()) {
					sb.append(fieldValue.asText());
				} else {
					sb.append(getJsonString(fieldValue));
				}
				if (fieldNames.hasNext()) {
					sb.append("\n");
				}
			}
			return sb.toString();
		} else if (node.isArray()) {
			StringBuilder sb = new StringBuilder();
			for (JsonNode element : node) {
				sb.append(getJsonString(element)).append(" ");
			}
			return sb.toString();
		} else if (node.isTextual()) {
			return node.asText();
		} else {
			return "";
		}
	}
}
