// JavaRush lvl 12 lecture 3
// difference in Static and non-static Methods
public class StaticNonStaticMethods {

    /*
    ability.....................................| non-static | static |

    Connection with an instance of the class    |    yes     |   no   |
    Call nonstatic class methods                |    yes     |   no   |
           (non-static has hidden reference -> this.parameter)

    Call static methods of the class            |    yes     |   yes  |

    Access to nonstatic variables of the class  |    yes     |   no   |

    Access to static variables of the class     |    yes     |   yes  |
    Can be called on an Object                  |    yes     |   yes  |

    Can be called on the Class                  |    no      |   yes  |

     */
    // Connection with an instance of the class
    // Call nonstatic class methods
    int min(int a, int b) {
        return a < b ? a : b;
    }

    int min(int a, int b, int c) {
        int t = min(a, b); // Compiler see -> this.min(a, b);
        return min(t, c); // Compiler see -> this.min(t, c);
    }

    public static void main(String[] args) throws InterruptedException {

        // Can be called on an Object
        Thread thrd = Thread.currentThread();
        thrd.sleep(1000); // Compiler see -> Thread.sleep(1000);

        Integer intgr = 44;
        int x = intgr.parseInt("33"); // Compiler see -> Integer.parseInt("33");

        "".valueOf(12); // Compiler see -> String.valueOf(12);
    }
}
