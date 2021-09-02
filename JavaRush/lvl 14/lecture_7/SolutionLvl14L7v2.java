// change the method getShapeNameByCountOfCorners() using switch

public class SolutionLvl14L7v2 {
    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

//    public static String getShapeNameByCountOfCorners(int countOfCorner) {
//        String shape;
//        if (countOfCorner == 3) {
//            shape = "Треугольник";
//        } else if (countOfCorner == 4) {
//            shape = "Четырехугольник";
//        } else if (countOfCorner == 5) {
//            shape = "Пятиугольник";
//        } else if (countOfCorner == 6) {
//            shape = "Шестиугольник";
//        } else if (countOfCorner == 7) {
//            shape = "Семиугольник";
//        } else if (countOfCorner == 8) {
//            shape = "Восьмиугольник";
//        } else {
//            shape = "Другая фигура";
//        }
//        return shape;
//    }

    public static String getShapeNameByCountOfCorners(int countOfCorners) {
        return switch(countOfCorners) {
            case 3 -> "Треугольник";
            case 4 -> "Четырехугольник";
            case 5 -> "Пятиугольник";
            case 6 -> "Шестиугольник";
            case 7 -> "Семиугольник";
            case 8 -> "Восьмиугольник";
            default -> "Другая фигура";
        };
    }
}
