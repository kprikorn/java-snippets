//with the new style, one's code would typically change from something like the following:

for (int i=0; i < array.length; i++) {
    System.out.println("Element: " + array[i]);
}

//to the newer form

for (String element : array) {
    System.out.println("Element: " + element);
}

Assuming "array" is defined to be an array of String objects.
