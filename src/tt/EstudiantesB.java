package tt;

public class EstudiantesB extends Estudiantes {

    public EstudiantesB(String carne, String nombre, String correo, String telefono, String nickname, String studenttype, int pexam, int pquiz, int phw, int proyecto1, int proyecto2, int proyecto3, String promedioA, String promedioB, Integer notafinal) {
        super(carne, nombre, correo, telefono, nickname, studenttype, pexam, pquiz, phw, proyecto1, proyecto2, proyecto3, promedioA, promedioB, notafinal);
    }

    @Override
    public String reqEs() {
        int reds = (getProyecto1() + getProyecto2() + getProyecto3()) / 3;
        setPromedioB(Integer.toString(reds));
        return Integer.toString(reds);
    }

    @Override
    public String fin() {
        int reds2 = (getPexam() + getPquiz() + getPhw() + ((getProyecto1() + getProyecto2() + getProyecto3()) / 3)) / 4;
        setNotafinal(reds2);
        return Integer.toString(reds2);
    }
}
