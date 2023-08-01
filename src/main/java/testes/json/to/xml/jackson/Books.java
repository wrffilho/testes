package testes.json.to.xml.jackson;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Books {
    @SerializedName("book")
    private List<Book> books;

    // Getters e setters (não mostrados para brevidade)
}
