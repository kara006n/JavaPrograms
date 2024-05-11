package com.java.program;

import java.util.Arrays;

public class Password {

      public class PasswordStorageExample {

            public static void main(String[] args) {
                  // Password input as a char array
                  char[] password = "securePassword".toCharArray();

                  // Use the password for authentication or other purposes
                  authenticateUser(password);

                  // Clear the password from memory after use
                  clearPassword(password);
            }

            private static void authenticateUser(char[] password) {
                  // Authentication logic here
                  // ...
            }

            private static void clearPassword(char[] password) {
                  // Overwrite the password with zeros
                  Arrays.fill(password, '\0');
            }
      }

}
/*Here are some reasons why using a char[] array for password storage is preferred:

Immutable Nature of Strings: As mentioned earlier, String objects are immutable, and their values are stored in the string pool, which is a shared area of memory. If a password is
stored as a String, it remains in the pool until garbage collection occurs. During this time, other parts of the application or even external tools might be able to access the
password, potentially compromising security. and even if we try to change that password after use so that i get deleted from string contant pool but it is not possible because string
iss immutable so once created it will be there in memory always and hence hacker can take memory dump and can use list of all string pool to get password.

Mutable and Secure: On the other hand, char[] arrays are mutable, meaning you can overwrite the array with any other value, including zeros, after using the password. This
makes it possible to clear the password from memory explicitly and reduce the window of opportunity for potential attackers to access the password.

Avoiding String Interning: String interning is a process in Java where the JVM (Java Virtual Machine) maintains a pool of unique strings called the "string pool." When you create
 a String object using a string literal (e.g., String str = "hello";), the JVM checks if a string with the same content already exists in the pool. If it does, the JVM reuses the existing
 string from the pool instead of creating a new one. This is done to save memory and improve performance, as it ensures that only one instance of each unique string exists in
 memory.
The problem with string interning in the context of storing sensitive data like passwords is that once a string is interned, it remains in the string pool until the JVM terminates or
until it is explicitly removed from the pool. This means that other parts of the application or even external tools can potentially access the password by obtaining a reference to
the interned string.

Garbage Collection: The char[] array can be explicitly cleared or set to random values after use, making it less likely to be available in memory for an extended period.*/