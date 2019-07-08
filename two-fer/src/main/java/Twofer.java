class Twofer {
    String twofer(String name) {
      String user = name==null? "you":name;
      
      return String.format("One for %s, one for me.",user);
    }
}
