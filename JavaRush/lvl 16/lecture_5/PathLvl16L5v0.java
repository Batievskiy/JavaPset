
import java.io.File;
import java.net.URI;
import java.nio.file.Path;

public class PathLvl16L5v0 {
    public static void main(String[] args) {
        String str = "c:\\windows\\projects\\note.txt";
        Path path = Path.of(str);
        System.out.println("path -> " + path);
        System.out.println();

        // .getParent() returns parent directory
        System.out.println(".getParent -> " + path.getParent());
        System.out.println();

        // .getFileName() - returns file name from path
        System.out.println(".getFileName() -> " + path.getFileName());
        System.out.println();

        // .getRoot() - returns root directory
        System.out.println(".getRoot() -> " + path.getRoot());
        System.out.println();

        // boolean isAbsolute() - returns whether the pathname is absolute or not.
        System.out.println("isAbsolute() ? -> " + path.isAbsolute());
        System.out.println();

        // .toAbsolutePath() - return a Path object
        // representing the absolute path of this path object
        Path pathNA = Path.of("games\\witcher\\witcher.exe");
        System.out.println("pathNA -> " + pathNA);
        System.out.println("isAbsolute() - > " + pathNA.isAbsolute());
        pathNA = pathNA.toAbsolutePath();
        System.out.println("toAbsolutePath -> " + pathNA);
        System.out.println();

        // .normalize() - return a path from current path
        // in which all redundant name elements are eliminated.
        Path pathUN = Path.of("c:\\\\..\\\\..\\\\.\\\\project\\\\core.txt");
        System.out.println("pathUN - > " + pathUN);
        pathUN = pathUN.normalize();
        System.out.println(".normalize() -> " + pathUN);
        System.out.println();

        // .resolve() - resolve the given path against this path.
        Path pathUR = Path.of("drive\\temp\\source");
        System.out.println("pathUR -> " + pathUR);
        String passedPath = "newFolder\\fileName";
        pathUR = pathUR.resolve(passedPath);
        System.out.println(".resolve()  -> " + pathUR);
        System.out.println();

        // .relativize() - create a relative path between this path and a given path as a parameter.
        Path pathRL1 = Path.of("c:\\users\\IdeaProjects\\JavaPset");
        Path pathRL2 = Path.of("c:\\IdeaProjects\\JavaPset\\src\\folderTwo");
        System.out.println("pathRL1 - > " + pathRL1);
        System.out.println("pathRL2 - > " + pathRL2);
        Path pathRelativize = pathRL1.relativize(pathRL2);
        System.out.println("pathRL1.relativize(pathRL2) -> " + pathRelativize);
        System.out.println();

        // boolean .startsWith() -  check if this path object
        // starts with the given path or string which we passed as parameter.
        Path path2 = Path.of("start\\folder\\folder");
        System.out.println("path2 -> " + path2);
        String stringStart = "start";
        boolean check = path2.startsWith(stringStart);
        System.out.println("path2.startsWith(start) ? -> " + check);
        System.out.println();

        // boolean .endsWith() - check if this path object
        // ends with the given path or string which we passed as parameter.
        System.out.println("path2 -> " + path2);
        String endsWith = "file";
        check = path2.endsWith(endsWith);
        System.out.println("path2.endsWith(file) ? -> " + check);
        System.out.println();

        // .getNaeCount() - return the number of name elements in the path.
        System.out.println("pathNA -> " + pathNA);
        System.out.println(".getNameCount(pathNA) -> " + pathNA.getNameCount());
        System.out.println("pathRL2 - > " + pathRL2);
        System.out.println(".getNameCount(pathRL2) -> " + pathRL2.getNameCount());
        System.out.println();

        // .getName(index) - return a name element of this path as a Path object.
        System.out.println("pathRL1 -> " + pathRL1);
        System.out.println("pathGetName(1) -> " + pathRL1.getName(1));
        System.out.println();

        // .subpath(beginIndex, endIndex) - return a relative Path
        // that is a subsequence of the name elements of this path.
        System.out.println("pathRL2 -> " + pathRL2);
        System.out.println("pathRL2.subpath(1, 3) -> " + pathRL2.subpath(0, 3));
        System.out.println();

        // toFile() - converts Path to File object
        System.out.println("path -> " + path);
        File file = path.toFile();
        System.out.println("path.toFile() -> " + file);
        System.out.println();

        // toUri() - converts Path to URI
        System.out.println("path2 -> " + path2);
        URI uri = path2.toUri();
        System.out.println("path2.toUri() -> " + uri);
        System.out.println();
    }
}
