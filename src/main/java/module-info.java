module com.cs210.team_project_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.cs210.team_project_2 to javafx.fxml;
    exports com.cs210.team_project_2;
}