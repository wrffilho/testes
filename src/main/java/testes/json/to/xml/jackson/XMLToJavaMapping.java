package testes.json.to.xml.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class XMLToJavaMapping {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\wande\\Downloads\\xml\\web.xml"; // Coloque o caminho do arquivo XML aqui
		try {
			
			File xmlFile = new File(filePath);
			// Converter o XML para JSON usando Jackson XML
			ObjectMapper xmlMapper = new XmlMapper();
			JsonNode jsonNode = xmlMapper.readTree(xmlFile);
			String json = new ObjectMapper().writeValueAsString(jsonNode);

			// Mapear o JSON para o objeto Catalog usando Gson
			Gson gson = new GsonBuilder().create();
			Catalog catalog = gson.fromJson(json, Catalog.class);

			// Acessar os dados do POJO
			System.out.println("Carro: " + catalog.getCarro());
			System.out.println("Endereço: " + catalog.getEndereco());

			if (catalog.getBooks() != null && catalog.getBooks().getBooks() != null) {
				for (Book book : catalog.getBooks().getBooks()) {
					System.out.println("ID: " + book.getId());
					System.out.println("Title: " + book.getTitle());
					System.out.println("Author: " + book.getAuthor());
					System.out.println("Genre: " + book.getGenre());
					System.out.println("Price: " + book.getPrice());
					System.out.println("Currency: " + book.getCurrency());
					System.out.println("Publish Date: " + book.getPublishDate());
					System.out.println("Description: " + book.getDescription());
					System.out.println();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
