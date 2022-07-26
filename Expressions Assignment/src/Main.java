public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */
        //Expression 1
        System.out.println("Expression 1");
        System.out.println((9 - 4)+ 10/2 - (double)(4 - 8)/3);
        System.out.println(5+10/2- (double)(4-8)/3);
        System.out.println(5+5-(double)(4-8)/3);
        System.out.println(5+5-(double)-4/3);
        System.out.println(10-(double)-4/3);
        System.out.println(10+(double)4/3);
        System.out.println((double)34/3);
        System.out.println();

        //Expression 2
        System.out.println("Expression 2");
        System.out.println(23%4 + (18 - (double)3 / 2));
        System.out.println(3+(18-(double)3/2));
        System.out.println(3+(double)33/2);
        System.out.println((double)39/2);
        System.out.println();

        //Expression 3
        System.out.println("Expression 3");
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println((3+Math.pow(3,4)/5));
        System.out.println(3+(double)81/5);
        System.out.println((double)96/5);
        System.out.println();

        //Expression 4
        System.out.println("Expression 4");
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(1-8+ Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(1-8+ Math.pow(2,3) / 8 + (9 / 3));
        System.out.println(1-8+ 8 / 8 + (9 / 3));
        System.out.println(1-8+ 1 + (9 / 3));
        System.out.println(1-8+ 1 + 3);
        System.out.println(-7 + 1 + 3);
        System.out.println(-6 + 3);
        System.out.println(-3);
        System.out.println();

        //Expression 5
        System.out.println("Expression 5");
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((7 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * Math.sin(45) + 2) - Math.pow(5, 3));
        System.out.println((10 * Math.sin(45) + 2) - 125);
        System.out.println((10 * 0.8509035245341184 + 2) - 125);
        System.out.println((8.509035245341185 + 2) - 125);
        System.out.println(10.509035245341185 - 125);
        System.out.println(-114.49096475465882);
    }
}
