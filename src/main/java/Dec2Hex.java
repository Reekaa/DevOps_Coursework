class Dec2Hex {

    public static int Arg1;

    public static void main(String[] args) {

        // validation check
//        if (args.length <= 0) {
//            System.err.println("Please provide a number to convert.");
//        } else {
            // parsing int
            try {
                Arg1 = Integer.parseInt(args[0]);
                char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem, num;
                num = Arg1;
                String hexadecimal = "";
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                // convertion
                while (num != 0) {
                    rem = num % 16;
                    hexadecimal = ch[rem] + hexadecimal;
                    num = num / 16;
                }

                System.out.println("Hexadecimal representation is: " + hexadecimal);

            } catch (NumberFormatException e) {
                System.err.println("Please provide a valid number");
            }
//        }
    }
}

