/**
 * @author MaoYang
 * @create 2021-06-28  18:09
 */
public class GenericPatternFigure2_Q5 {
    public static void main(String[] args) {
        //there should be three arguments
        //first one is the pattern of left and right
        //second is the pattern of the top and bottom
        //last is the length of the middle line
        if (args.length < 3){
            System.out.println("usage: java GenericPatternFigure2_Q3 "
                    + "<first-pattern><second-pattern><max-length>");
            return;
        }
        //to represent all three situation in figure2,just change the arguments as
        //* " " 20
        //" " * 20
        //| * 20
        char pattern1 = args[0].charAt(0);
        char pattern2 = args[1].charAt(0);
        int maxLength = Integer.parseInt(args[2]);
        for (int i = 1;i <=maxLength/2;++i){
            for(int j = 1;j <= i;++j){
                System.out.print(pattern1);
            }
            for (int j = i+1;j <=maxLength/2;++j){
                System.out.print(pattern2);
                System.out.print(pattern2);
            }
            for(int j = 1;j <= i;++j){
                System.out.print(pattern1);
            }
            System.out.println();
        }
        for (int i = maxLength/2;i >=1;--i){
            for(int j = 1;j <= i;++j){
                System.out.print(pattern1);
            }
            for (int j = i+1;j <=maxLength/2;++j){
                System.out.print(pattern2);
                System.out.print(pattern2);
            }
            for(int j = 1;j <= i;++j){
                System.out.print(pattern1);
            }
            System.out.println();
        }

    }
}
