package tt;

public abstract class Estudiantes {

     String carne;
     String nombre;
     String correo;
     String telefono;
     String nickname;
     String studenttype;
     int pexam;
     int pquiz;
     int phw;
     int proyecto1;
     int proyecto2;
     int proyecto3;

     String promedioA;
     String promedioB;
     Integer notafinal;

     public String getCarne() {
          return carne;
     }

     public void setCarne(String carne) {
          this.carne = carne;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getCorreo() {
          return correo;
     }

     public void setCorreo(String correo) {
          this.correo = correo;
     }

     public String getTelefono() {
          return telefono;
     }

     public void setTelefono(String telefono) {
          this.telefono = telefono;
     }

     public String getNickname() {
          return nickname;
     }

     public void setNickname(String nickname) {
          this.nickname = nickname;
     }

     public String getStudenttype() {
          return studenttype;
     }

     public void setStudenttype(String studenttype) {
          this.studenttype = studenttype;
     }

     public int getPexam() {
          return pexam;
     }

     public void setPexam(int pexam) {
          this.pexam = pexam;
     }

     public int getPquiz() {
          return pquiz;
     }

     public void setPquiz(int pquiz) {
          this.pquiz = pquiz;
     }

     public int getPhw() {
          return phw;
     }

     public void setPhw(int phw) {
          this.phw = phw;
     }

     public int getProyecto1() {
          return proyecto1;
     }

     public void setProyecto1(int proyecto1) {
          this.proyecto1 = proyecto1;
     }

     public int getProyecto2() {
          return proyecto2;
     }

     public void setProyecto2(int proyecto2) {
          this.proyecto2 = proyecto2;
     }

     public int getProyecto3() {
          return proyecto3;
     }

     public void setProyecto3(int proyecto3) {
          this.proyecto3 = proyecto3;
     }

     public String getPromedioA() {
          return promedioA;
     }

     public void setPromedioA(String promedioA) {
          this.promedioA = promedioA;
     }

     public String getPromedioB() {
          return promedioB;
     }

     public void setPromedioB(String promedioB) {
          this.promedioB = promedioB;
     }

     public Integer getNotafinal() {
          return notafinal;
     }

     public void setNotafinal(Integer notafinal) {
          this.notafinal = notafinal;
     }

     public Estudiantes(String carne, String nombre, String correo, String telefono, String nickname, String studenttype, int pexam, int pquiz, int phw, int proyecto1, int proyecto2, int proyecto3, String promedioA, String promedioB, Integer notafinal) {
          this.carne = carne;
          this.nombre = nombre;
          this.correo = correo;
          this.telefono = telefono;
          this.nickname = nickname;
          this.studenttype = studenttype;
          this.pexam = pexam;
          this.pquiz = pquiz;
          this.phw = phw;
          this.proyecto1 = proyecto1;
          this.proyecto2 = proyecto2;
          this.proyecto3 = proyecto3;
          this.promedioA = promedioA;
          this.promedioB = promedioB;
          this.notafinal = notafinal;
     }

     public abstract String reqEs();

     public abstract String fin();

}
