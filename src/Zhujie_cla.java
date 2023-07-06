import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Zhujie_cla {
    public static void main(String[] args) throws Exception{
        PPerson p1 = new PPerson("xxly","jinan");
        PPerson p2 = new PPerson("yylx", "1234567891012345");
        for(PPerson p : new PPerson[]{p1, p2}){
            try {
                check(p);
                System.out.println("Person " + p + " checked ok.");
            } catch (IllegalArgumentException e) {
                System.out.println("Person " + p + " checked failed: " + e);
            }
        }
    }
    static void check(PPerson p) throws IllegalArgumentException, ReflectiveOperationException{
        for(Field field : p.getClass().getFields()){
            Range range = field.getAnnotation(Range.class);
            if(range != null){
                Object value = field.get(p);
                String t = (String)value;
                int min = range.min();
                int max = range.max();
                if(t.length() < min || t.length() > max) {
                    System.out.println("min=" + min +" max=" + max + " t.length = " + t.length());
                    throw new IllegalArgumentException();
                }
            }
        }
    }

}
class PPerson{
    @Range(min=1, max=9)
    public String name;
    @Range(max=10)
    public String city;
    PPerson(String name, String city){
        this.name = name;
        this.city = city;
    }

}

