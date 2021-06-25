// let's create image extension checker
public class IsImageChecker {
    public static void main(String[] args) {
        System.out.println("---< What Image is this? >---\n");

        String extension = "file.png";
        whatImage(extension);
    }

    private static void whatImage(String extension) {
        String ext = extension;
        if (ext.endsWith(".jpg") || ext.endsWith(".jpeg")) {
            System.out.println(ext + " -> standard image file");
        } else if (ext.endsWith(".png")) {
            System.out.println(ext + " -> image file with transparent background");
        } else if (ext.endsWith(".gif")) {
            System.out.println(ext + " -> animated image file");
        } else {
            System.out.println(ext + " -> some file?!?!\nI'm lazy to check all \"if else\" statements ;)");
        }
    }
}