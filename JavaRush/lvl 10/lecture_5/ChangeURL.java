// let's change URL
// lvl 10 lecture 5
public class ChangeURL {
    public static void main(String[] args) {
        String url = "https://domen.com/index/file.html";
        System.out.println("old URL - > " + url);
        int index1 = url.indexOf("//");
        int index2 = url.indexOf("/", index1 + 2);

        String s1 = url.substring(0, index1 + 2);
        String s2 = url.substring(index2);

        String result = s1 + "newdomenname.io" + s2;
        System.out.println("new URL -> " + result);
    }
}
