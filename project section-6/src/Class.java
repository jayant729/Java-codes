public class Class {
    private String name;
    private String subject;
    private int rollno;

    public Class(String name,String subject,int rollno){
        this.name=name;
        this.subject=subject;
        this.rollno=rollno;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public String getsubject(){
        return subject;
    }
    public void setsubject(String subject){
        this.subject=subject;
    }

    public int getrollno(){
        return rollno;
    }
    public void setrollno(int rollno){
        this.rollno=rollno;
    }
}
