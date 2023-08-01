package testes.xml.to.json;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Catalog {
    @SerializedName("carro")
    private String carro;

    @SerializedName("endereco")
    private String endereco;

    @SerializedName("books")
    private Books books;

    // Getters e setters (não mostrados para brevidade)
}
