package OOP8;

/*
터미널에서 이거 입력하면

rm -rf   >>컴퓨터 포맷

format c:\  >> c드라이브에 있는 파일 포맷


 */
public class CalculateAverageScore {
    public static void main(String[] args) {
        int firstArg;
        double sum = 0.0;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);

            } catch (NumberFormatException e) {
                System.out.println("Argument" + args[0] + "must be an integer.");
                System.exit(1);
            }
        } else if (args.length == 0) {
            System.exit(1);
        }
        for (String s : args) {
            sum += Integer.parseInt(s);
        }
        System.out.println("Average = " + (sum / args.length));

    }
}

