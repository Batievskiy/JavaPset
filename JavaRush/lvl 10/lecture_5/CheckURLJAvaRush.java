// JavaRush problem lvl 10 lecture 5
// check URL address:
// <protocol>://<resource>.<domain>
public class CheckURLJAvaRush {

    // checkProtocol(String):
    // checks what protocol (http or https) from URL address
    // returns String name of protocol

    // checkDomain(String):
    // checks what domain (.com, .net, .org, .ru) from URL address
    // returns String name of domain

    // if URL address does not begin from http or https
    // return "UNKNOWN"

    // if URL address does not end with .com, .net, .org, .ru
    // return "UNKNOWN"

    public static void main(String[] args) {
        String[] urls = {
                        "https://javarush.ru",
                        "https://google.com",
                        "http://wikipedia.org",
                        "facebook.com",
                        "https://instagram",
                        "codegym.cc"
        };
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-address - " + url + ", net protocol - " + protocol + ", domain - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https")) {
            return "https";
        } else if (url.startsWith("http")) {
            return "http";
        } else {
            return "UNKNOWN";
        }
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ru")) {
            return "ru";
        } else {
            return "UNKNOWN";
        }
    }
}
