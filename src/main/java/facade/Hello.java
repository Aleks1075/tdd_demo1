package facade;

public class Hello {

    public static String sayHello(String name) {
        if (name == null) {
            return "Hello, my friend.";
        }
        if (name.equals(name.toUpperCase())) {
            return "HELLO, " + name + "!";
        }
        return "Hello, " + name;
    }

    public static String sayHelloArray(String[] names)
    {
        String result = "Hello, ";
            if(names.length == 2)
            {
                result += names[0] + " and " + names[1];
            }
            if(names.length == 3)
            {
                result += names[0] + ", " + names[1] + " and " + names[2];
            }
            return result;
    }

    public static String sayHelloMixedArray(String[] names) {
        String result = "Hello, ";
        String shoutResult = " AND HELLO ";
        if(names.length == 3)
        {
            result += names[0] + " and " + names[2] + "." + shoutResult + names[1].toUpperCase() + "!";
        }
        return result;
    }

    public static String sayHelloStringCommas(String[] names) {
        String result = "Hello, ";
        if (names.length == 3) {
            result += names[0] + ", " + names[1] + ", and " + names[2] + ".";
        }
        return result;
    }

    public static String sayHelloEscapedArray(String[] names)
    {
        String result = "Hello, ";
        if (names.length == 2) {
            result += names[0] + " and " + names[1].replace("\"", "") + ".";
        }
        return result;
    }
}
