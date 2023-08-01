package testes.json.to.xml.jackson;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    @SerializedName("@id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("author")
    private String author;

    @SerializedName("genre")
    private String genre;

    @SerializedName("price")
    private String price;

    @SerializedName("@currency")
    private String currency;

    @SerializedName("publish_date")
    private String publishDate;

    @SerializedName("description")
    private String description;

    // Getters e setters (não mostrados para brevidade)
}

