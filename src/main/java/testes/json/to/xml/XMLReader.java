package testes.json.to.xml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLReader {
    public static void main(String[] args) {
        try {
            // Caminho para o arquivo XML
            String caminhoArquivoXML = "C:\\Users\\wande\\Downloads\\xml\\web.xml";

            // Criação do JAXBContext e Unmarshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Faz a leitura e mapeamento do XML para a classe Catalog
            File arquivoXML = new File(caminhoArquivoXML);
            Catalog catalog = (Catalog) unmarshaller.unmarshal(arquivoXML);

            // Imprimir os dados do catalog
            System.out.println(catalog);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
