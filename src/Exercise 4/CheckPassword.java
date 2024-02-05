public class CheckPassword
{
    public static boolean longEnough(String password)
    {
        return password.length() >= 12;
    }

    public static boolean atLeastTwoDigits(String password)
    {
        int digitCount = 0;
        for (char letter : password.toCharArray())
        {
            if (Character.isDigit(letter))
            {
                digitCount++;
                if (digitCount == 2)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.err.println("Usage: java CheckPassword <password>");
            System.exit(1);
        }
        String input = args[0];
        boolean passwordIsValid = longEnough(input) && atLeastTwoDigits(input);
        if (passwordIsValid)
        {
            System.out.println("Password is valid");
        } else
        {
            System.out.println("Password is not valid");
        }
    }
}
