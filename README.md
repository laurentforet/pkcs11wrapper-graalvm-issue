To illustrate issue https://github.com/oracle/graal/issues/4064


``` bash
javac Pkcs11WrapperLoader.java
native-image -cp . Pkcs11WrapperLoader
pkcswrapperloader.exe
```
