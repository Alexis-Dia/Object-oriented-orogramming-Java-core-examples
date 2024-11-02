In Java9 added:
    1. For Optional was added flatMap-method.
    2. InputStream is;
       byte[] array = is.readAllBytes();
    3. Instead of creation list like this with elements:
           List<String> list = new ArrayList<>(); Collections.addAll(l, "Alex");
       or like this:
           List<String> list = Arrays.asList("Alex");  // list will be unmodifiable
       was introduce a new way - List.of():
            ArrayList<String> friends =  new ArrayList<>(List.of("Peter", "Paul"));