class AlphabeticCharacter {

  public static void main(String[] args) {
    char[] s;
    s = new char[26];
    for (int i = 0; i < s.length; i++) {
      s[i] = (char) ('A' + i);
    }
    for (int i = 0; i < s.length; i++) {
      System.out.print(s[i] + "\t");
    }
  }

}
