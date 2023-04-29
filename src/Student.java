public class Student extends Person {
  int id;
  String universitet;
  String ixtisas;

    public Student(String name,String surname,int id, String universitet, String ixtisas) {
        super(name,surname);
        this.id = id;
        this.universitet = universitet;
        this.ixtisas = ixtisas;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setUniversitet(String universitet) {
        this.universitet = universitet;
    }

    public void setIxtisas(String ixtisas) {
        this.ixtisas = ixtisas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", universitet='" + universitet + '\'' +
                ", ixtisas='" + ixtisas + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUniversitet() {
        return universitet;
    }

    public String getIxtisas() {
        return ixtisas;
    }
}
