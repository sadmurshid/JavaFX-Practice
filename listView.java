import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Created by Murshid on 7/12/2017.
 */
public class listView  {

    Stage window;
    TableView<product> productTable;
    TextField nameIn, priceIn, quantityIn;

    public listView()throws Exception
    {
        run();
    }

    public void run ()throws Exception
    {
        window=new Stage();
        window.setTitle("Table View Screen");

        //Name Column
        TableColumn<product, String> pName=new TableColumn<>("PRODUCT NAME");
        pName.setMaxWidth(220);
        pName.setCellValueFactory(new PropertyValueFactory<product,String>("name"));

        //PRICE Column
        TableColumn<product, Double> pPrice=new TableColumn<>("PRODUCT PRICE");
        pPrice.setMaxWidth(220);
        pPrice.setCellValueFactory(new PropertyValueFactory<product,Double>("price"));

        //Quantity Column
        TableColumn<product, Integer> pQuantity=new TableColumn<>("PRODUCT Quantity");
        pQuantity.setMaxWidth(220);
        pQuantity.setCellValueFactory(new PropertyValueFactory<product,Integer>("quantity"));

        //Name input
        nameIn= new TextField();
        nameIn.setPromptText("NAME");
        nameIn.setMinWidth(100);

        //Price input
        priceIn= new TextField();
        priceIn.setPromptText("PRICE");
        priceIn.setMinWidth(100);

        //Quantity input
        quantityIn= new TextField();
        quantityIn.setPromptText("QUANTITY");
        quantityIn.setMinWidth(100);

        //Buttons
        Button addButton=new Button("ADD");
        addButton.setOnAction(e-> addButtonClicked());
        Button deleteButton=new Button("DELETE");
        deleteButton.setOnAction(e-> deleteButtonClicked());

        HBox bot=new HBox();
        bot.setPadding(new Insets(10,10,10,10));
        bot.setSpacing(10);
        bot.getChildren().addAll(nameIn, priceIn, quantityIn, addButton, deleteButton);

        productTable=new TableView<>(getProduct());

        productTable.getColumns().addAll(pName, pPrice, pQuantity);

        VBox vbox=new VBox();
        vbox.getChildren().addAll(productTable, bot);

        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(vbox);

        Scene scene=new Scene(borderPane, 700, 600);
        window.setScene(scene);
        window.show();
    }


    private ObservableList<product> getProduct()
    {
        ObservableList<product> products= FXCollections.observableArrayList();
        products.add(new product("Laptop", 40000, 24));
        products.add(new product("Monitor", 7000, 30));
        products.add(new product("Mouse", 500, 55));
        products.add(new product("Processor", 15500, 21));
        products.add(new product("Mother Board", 12500, 22));

        return products;
    }

    //If ADD button is clicked (No parameter; No return)
    private void addButtonClicked()
    {
        product pro=new product();
        pro.setName(nameIn.getText());
        pro.setPrice(Double.parseDouble(priceIn.getText()));
        pro.setQuantity(Integer.parseInt(quantityIn.getText()));
        productTable.getItems().add(pro);
        nameIn.clear();
        priceIn.clear();
        quantityIn.clear();
        nameIn.setPromptText("NAME");
        priceIn.setPromptText("PRICE");
        quantityIn.setPromptText("QUANTITY");


    }

    //If DELETE button is clicked
    private void deleteButtonClicked()
    {
         ObservableList<product> proSelected, products;
         products=productTable.getItems();
         proSelected=productTable.getSelectionModel().getSelectedItems();

         proSelected.forEach(products::remove);
    }

}
