import java.util.function.Function;
class Student{
    private String name;
    private int num;
    int hi = 1;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}

class Whatgua{
    private String StdName;
    private String GuaName;

    public String getStdName() {
        return StdName;
    }

    public String getGuaName() {
        return GuaName;
    }
}

class Solution {
    public int writeTo(Function<? extends Student,? extends Whatgua> mapper ) {

        return 1;

    }

    public static void main(String[] args) {

    }
}

























