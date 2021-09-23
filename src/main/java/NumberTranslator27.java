class NumberTranslator27 {
    public int translate(String romanNumber) {
        String upperCasedRomanNumber = romanNumber.toUpperCase();
        String upperCasedRomanNumberWithoutSpaces = upperCasedRomanNumber.replaceAll(" ", "");
        switch (upperCasedRomanNumberWithoutSpaces) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 12;
            default:
                return -1;
        }
    }
    public static void main(String[] args)
    {
        NumberTranslator27 dispute = new NumberTranslator27();
        System.out.println(dispute.translate("iX"));

    }
}