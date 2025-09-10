public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Jayant More");

        sb.append(" is intelligent");
        System.out.println(sb);

        sb.insert(6," Sachin");
        System.out.println(sb);

        sb.replace(22,32,"Studious");
        System.out.println(sb);

        sb.delete(6,13);
        System.out.println(sb);

        sb.insert(0,"Dr.");
        System.out.println(sb);

    }
}
