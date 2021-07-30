public class ExceptionsLvl15L4 {
    /*
    All exceptions:


                                           Object
                                              ^
                                          Throwable
                      ________________________^_________________________
                      ^                                                ^
                    Error                                          Exception
           ___________^__________                          ____________^__________
           |          |           |                         |                      |
    OutOfMemoryError  |  StackOverFlowError         RuntimeException         IOException
          ____________^         ___________________________^              _________^
          |                     |            |             |              |        |
    LinkageError    IllegalArgumentException |  IndexOutOfBoundsException |  FileNotFoundException
             _________________^      ________|                 ^          |________________
             |                       |                         |                          |
    NumberFormatException   ArithmeticException   ArrayIndexOutOfBoundsException   SocketException
    */
    public static void main(String[] args) {

        createCrowdedWorld(10);
        createCrowdedWorld(1);
        createCrowdedWorld(0);
    }

    public static void createCrowdedWorld(int n) {
        try {
            createWorld(n);
        } catch (EmptyWorldException | LonelyWorldException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception) {
                Exception exp = (Exception) cause;
                System.out.println("this is RuntimeException has been wrapped -> " + exp);
            }
            e.printStackTrace();
        }
    }

    public static void createWorld(int n) throws EmptyWorldException, LonelyWorldException {
        if (n == 0) {
            throw new EmptyWorldException("There is no people");
        }
        if (n == 1) {
            throw new LonelyWorldException("There is not enough people");
        }
        System.out.println("A new World has been created!");
    }

}

class EmptyWorldException extends RuntimeException {

    public EmptyWorldException(String s) {

    }
}

class LonelyWorldException extends RuntimeException {

    public LonelyWorldException(String s) {

    }

}
