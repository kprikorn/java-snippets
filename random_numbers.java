int max = 50;
int min = 1;

// using Math.random()

double random = Math.random() * 49 + 1;
//or
int random = (int )(Math.random() * 50 + 1);

This will give you value from 1 to 50 in case of int or 1.0 (inclusive) to 50.0 (exclusive) in case of double
Why?
random() method returns a random number between 0.0 and 0.9..., you multiply it by 50, so upper limit becomes 0.0 to 49.999... when you add 1, it becomes 1.0 to 50.999..., now when you truncate to int, you get 1 to 50. (thanks to @rup in comments). leepoint's awesome write-up on both the approaches.

// using Random class in Java.

Random rand = new Random(); 
int value = rand.nextInt(50); 

This will give value from 0 to 49.

For 1 to 50: rand.nextInt((max - min) + 1) + min;

// using SecureRandom
private static final SecureRandom randomNumbers = new SecureRandom();

int randomNum = rand.nextInt((max - min) + 1) + min;
