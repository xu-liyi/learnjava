import java.util.StringJoiner;

public class StringJoiner_cla {
    public static void main(String[] args){
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }
    static String buildSelectSql(String table, String[] fields) {
        StringJoiner sj = new StringJoiner(", ", "SELECT ", " FROM ");
        for (String s : fields) {
            sj.add(s);
        }
        return sj.toString() + table;
    }
}
