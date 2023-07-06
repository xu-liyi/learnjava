import java.lang.reflect.Field;

public class Field_cla {

    public static void main(String[] args) throws Exception {
        Object p = new Personn("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        Object value = f.get(p);
        System.out.println(value); // "Xiao Ming"
    }


}
class Personn {
    public String name;

    public Personn(String name) {
        this.name = name;
    }
}
