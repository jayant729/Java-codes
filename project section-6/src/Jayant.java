public class Jayant {
    private String name;
    private String lastname;
    private int rollno;

    public Jayant(){
        name="Jay";
        lastname="M";
        rollno=3;
    }

    public Jayant(String name,String lastname,int rollno) {
        this.name = name;
        this.lastname = lastname;
        this.rollno = rollno;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public String getlastname(){
        return lastname;
    }
    public void setlastname(String lastname){
        this.lastname=lastname;
    }

    public int getrollno(){
        return rollno;
    }
    public void setrollno(int rollno){
        this.rollno=rollno;
    }

}
