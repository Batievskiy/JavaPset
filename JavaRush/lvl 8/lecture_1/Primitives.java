// what is primitive variables?
// let's find out
public class Primitives {
    /* int
     * Java stores it using 32 bits of memory.
     * In other words, it can represent values
     * from -2,147,483,648 to 2,147,483,647
     */
     int x = 424_242;
     int y;

    /* byte
     * it only takes up 8 bits of memory.
     * byte can only hold the values from -128 to 127.
     */
    byte b = 100;
    byte empty;

    /* short
     * 16 bits of memory
     * Its range of possible values is -32,768 to 32,767
     */
    short s = 22_202;
    short simple;

    /* long
     * It's stored in 64 bits of memory
     * The possible values of a long are
     * between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     */
    long l = 1_234_567_890;
    long big;

    /* float
     * basic fractional numbers - single-precision decimal number
     * is stored in 32 bits of memory
     * The smallest decimal is 1.40239846 x 10^(-45),
     * the largest value is 3.40282347 x 10^(38).
     */
    float f = 3.145f;
    float floaty;

    /* double
     * it's a double-precision decimal number.
     * It's stored in 64 bits of memory.
     * The range is 4.9406564584124654 x 10^(-324)
     * to 1.7976931348623157 x 10^(308).
     */
    double pi = 3.13457599923384753929348D;
    double d;

    /* boolean
     * The simplest primitive data type
     * It can contain only two values: true or false.
     * It stores its value in a single bit.
     * However, for convenience, Java pads the value and stores it in a single byte.
     */
    boolean bool = true;
    boolean bull;

    /* char
     * The final primitive data type to look at is char.
     * is a 16-bit integer representing a Unicode-encoded character.
     * Its range is from 0 to 65,535.
     * Which in Unicode represents ‘\u0000' to ‘\uffff'.
     */
    char c = 'a';
    char chacha = 65;
    char bobo;

    /* Overflow
     * if we try to store a value that's larger than the maximum value of primitives
     * we run into an overflow
     * when integer overflows, it rolls over to the minimum value and begins continuing up from there
     * floating point number overflow by returning Infinity
     * when they underflow they return 0.0
     */
    int ii = Integer.MAX_VALUE;
    int j = ii + 1;
    // j will roll over to -2_147_483_648

    double dd = Double.MAX_VALUE;
    double oo = d + 1;
    // o will be Infinity

    /* Autoboxing
     * each primitive data type also has a full Java class implementation that can wrap it
     * The Integer class can wrap an int
     */
    Character charT = 'c';
    Integer inT = 1;

    // that's all for now.)
}
