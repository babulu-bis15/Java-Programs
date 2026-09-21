 class A2q5 {
    public static void main(String[] args) {
        int min=1000000;
	int days=min/(60*24);
        int years=min/(60*24*365);
        int remdays=(min%(60*24*365))/(60*24);
        System.out.println("Days="+days);
	System.out.println("Years="+years);
	System.out.println("Remaining Days="+remdays);

    }
}
