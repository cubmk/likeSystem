public class likeSystem {
    public static void main(String[] args) {

        String names1[] = {};
        String names2[] = {"Hasan"};
        String names3[] = {"Hasan", "Ali"};
        String names4[] = {"Hasan" , "Ali" , "Ahmet"};
        String names5[] = {"Hasan" , "Ali" , "Ahmet", "Tayyip"};

        likedName(names1);
        likedName(names2);
        likedName(names3);
        likedName(names4);
        likedName(names5);

    }

    public static void likedName(String[] names) {

        if (names.length == 0 ) {
            System.out.println("No one like this.");
        } else if (names.length == 1) {
            System.out.println(names[0] + " likes this.");
        } else if (names.length == 2) {
            System.out.println(names[0] + " and " + names[1] + " likes this.");
        } else if (names.length == 3) {
            System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " likes this.");
        } else {
            System.out.println(names[0] + ", " + names[1] + " and " + (names.length-2) + " others likes this.");
        }
    }
}
