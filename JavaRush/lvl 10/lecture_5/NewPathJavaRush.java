// JavaRush lvl 10 lecture 5
// change jdk to jdk-13 passed as a parameter in method
public class NewPathJavaRush {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);
        return path.replace(oldJdk, jdk);
    }
}
