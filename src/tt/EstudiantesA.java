package tt;

public class EstudiantesA extends Estudiantes {

    public EstudiantesA(String carne, String nombre, String correo, String telefono, String nickname, String studenttype, int pexam, int pquiz, int phw, int proyecto1, int proyecto2, int proyecto3, String promedioA, String promedioB, Integer notafinal) {
        super(carne, nombre, correo, telefono, nickname, studenttype, pexam, pquiz, phw, proyecto1, proyecto2, proyecto3, promedioA, promedioB, notafinal);
    }

    @Override
    public String reqEs() {
        int reds = (getPexam() + getPhw() + getPquiz()) / 3;
        setPromedioA(Integer.toString(reds));
        return Integer.toString(reds);

    }

    @Override
    public String fin() {
        int reds2 = getPexam() + getPhw() + getPquiz() + 7777;
        setNotafinal(reds2);
        return Integer.toString(reds2);
    }
}
