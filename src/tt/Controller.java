package tt;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import java.io.File;
import java.net.URL;
import java.util.*;
import javafx.stage.Stage;

public class Controller implements Initializable {

    @FXML
    private TableView<Estudiantes> tablita;
    @FXML
    private TableColumn<Estudiantes, String> carnecita;
    @FXML
    private TableColumn<Estudiantes, String> nombrecito;
    @FXML
    private TableColumn<Estudiantes, String> correoito;
    @FXML
    private TableColumn<Estudiantes, Integer> tel;
    @FXML
    private TableColumn<Estudiantes, String> nicknombre;
    @FXML
    private TableColumn<Estudiantes, String> tipoe;
    @FXML
    private TableColumn<Estudiantes, Integer> pexamencito;
    @FXML
    private TableColumn<Estudiantes, Integer> pquizxes;
    @FXML
    private TableColumn<Estudiantes, Integer> phww;
    @FXML
    private TableColumn<Estudiantes, Integer> p1;
    @FXML
    private TableColumn<Estudiantes, Integer> p2;
    @FXML
    private TableColumn<Estudiantes, Integer> p3;
    @FXML
    private TableColumn<Estudiantes, Integer> estA;
    @FXML
    private TableColumn<Estudiantes, Integer> estB;
    @FXML
    private TableColumn<Estudiantes, Integer> finali;


    private ObservableList<Estudiantes> manguitos;

    private ArrayList<Estudiantes> eA = new ArrayList<>();

    private ArrayList<Estudiantes> eB = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBUndle) {
        manguitos = FXCollections.observableArrayList();
        this.carnecita.setCellValueFactory(new PropertyValueFactory<>("carne"));
        this.nombrecito.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.correoito.setCellValueFactory(new PropertyValueFactory<>("correo"));
        this.tel.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.nicknombre.setCellValueFactory(new PropertyValueFactory<>("nickname"));
        this.tipoe.setCellValueFactory(new PropertyValueFactory<>("studenttype"));
        this.pexamencito.setCellValueFactory(new PropertyValueFactory<>("pexam"));
        this.pquizxes.setCellValueFactory(new PropertyValueFactory<>("pquiz"));
        this.phww.setCellValueFactory(new PropertyValueFactory<>("phw"));
        this.p1.setCellValueFactory(new PropertyValueFactory<>("proyecto1"));
        this.p2.setCellValueFactory(new PropertyValueFactory<>("proyecto2"));
        this.p3.setCellValueFactory(new PropertyValueFactory<>("proyecto3"));
        this.estA.setCellValueFactory(new PropertyValueFactory<>("promedioA"));
        this.estB.setCellValueFactory(new PropertyValueFactory<>("promedioB"));
        this.finali.setCellValueFactory(new PropertyValueFactory<>("notafinal"));


    }

    @FXML
    private void cpemfuncion() throws Exception{
        int ga = 1;
        int pin = 0;
        int tor = 0;
        int nado = 0;

        List<String> listaMagica = new ArrayList<>();
        Scanner vivi = new Scanner(new File("/Users/FabianaZamora/Documents/extraclase.csv"));
        vivi.useDelimiter("[,:\r\n]+");
        while (vivi.hasNext()){
            if (ga <= 1) {
                vivi.nextLine();
                ga++;
            }
            if(pin == 12) {
                if (Objects.equals(listaMagica.get(5),"A")){
                    eA.add(new EstudiantesA(listaMagica.get(0), listaMagica.get(1), listaMagica.get(2), listaMagica.get(3),
                            listaMagica.get(4), listaMagica.get(5), Integer.parseInt(listaMagica.get(6)),
                            Integer.parseInt(listaMagica.get(7)), Integer.parseInt(listaMagica.get(8)),
                            Integer.parseInt(listaMagica.get(9)), Integer.parseInt(listaMagica.get(10)),
                            Integer.parseInt(listaMagica.get(11)), " ", " ", 0));

                }
                else{
                    eB.add(new EstudiantesA(listaMagica.get(0), listaMagica.get(1), listaMagica.get(2), listaMagica.get(3),
                            listaMagica.get(4), listaMagica.get(5), Integer.parseInt(listaMagica.get(6)),
                            Integer.parseInt(listaMagica.get(7)), Integer.parseInt(listaMagica.get(8)),
                            Integer.parseInt(listaMagica.get(9)), Integer.parseInt(listaMagica.get(10)),
                            Integer.parseInt(listaMagica.get(11)), " ", " ", 0));
                }
                listaMagica.clear();
                pin = 0;
                vivi.nextLine();
            } else {
                listaMagica.add(vivi.next());
                pin++;
            }
        }
        if (Objects.equals(listaMagica.get(5), "A")){
            eA.add(new EstudiantesA(listaMagica.get(0), listaMagica.get(1), listaMagica.get(2), listaMagica.get(3),
                    listaMagica.get(4), listaMagica.get(5), Integer.parseInt(listaMagica.get(6)),
                    Integer.parseInt(listaMagica.get(7)), Integer.parseInt(listaMagica.get(8)),
                    Integer.parseInt(listaMagica.get(9)), Integer.parseInt(listaMagica.get(10)),
                    Integer.parseInt(listaMagica.get(11)), " ", " ", 0));
        }
        else{
            eB.add(new EstudiantesA(listaMagica.get(0), listaMagica.get(1), listaMagica.get(2), listaMagica.get(3),
                    listaMagica.get(4), listaMagica.get(5), Integer.parseInt(listaMagica.get(6)),
                    Integer.parseInt(listaMagica.get(7)), Integer.parseInt(listaMagica.get(8)),
                    Integer.parseInt(listaMagica.get(9)), Integer.parseInt(listaMagica.get(10)),
                    Integer.parseInt(listaMagica.get(11)), " ", " ", 0));
        }
        while(tor < eA.size()){
            eA.get(tor).reqEs();
            eA.get(tor).fin();
            tor++;
        }
        while(nado < eB.size()){
            eB.get(nado).reqEs();
            eB.get(nado).fin();
            nado++;
        }
        manguitos.addAll(eA);
        manguitos.addAll(eB);
        this.tablita.setItems(manguitos);
        vivi.close();
    }
}
