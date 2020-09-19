class StringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="The quick brown fox jumps over the lazy dog";
      System.out.println(str.charAt(12));
      System.out.println(str.indexOf("is"));
      str+="and killed it";
      System.out.println(str.endsWith("dogs"));
      System.out.println(str.contentEquals("The quick brown Fox jumps over the lazy Dog"));
      System.out.println(str.compareToIgnoreCase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
      System.out.println(str.indexOf('a'));
      System.out.println(str.lastIndexOf('e'));
      System.out.println(str.length());
      System.out.println(str.matches("The quick brown Fox jumps over the lazy Dog"));
      str=str.replace("The", "a");
      String[] temp=str.split(" jumps ");
      System.out.println(temp[0].subSequence(14, 16));
      System.out.println(temp[1].substring(14, 16));
      System.out.println(str.toLowerCase());
      System.out.println(str.toUpperCase());
	}

}
