module com.br.dio.projetodiopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.br.dio.projetodiopoo to javafx.fxml;
    exports com.br.dio.projetodiopoo;
}