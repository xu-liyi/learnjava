public class StringBuilder_cla {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(table).append(" (");
        for(int i = 0; i < fields.length; i ++){
            sb.append(fields[i]);
            if(i < fields.length - 1){
                sb.append(", ");
            }
        }
        sb.append(") ").append("VALUES (?, ?, ?)");
        return sb.toString();
    }
}