package com.app;

public class HelloWorld {
     public static void main(String[] argv) {

     	//Как собрать простейшую Java программу с помощью Maven
		//https://habrahabr.ru/post/309222/

		System.out.println("Hello, my Happy Super World");


		/*
			1. maven ищет код для сборки в директории <project>src/main/java.
			2. Инструкции по сборке maven будет искать в <project>/pom.xml
			3. Результат работы системы сборки называется артефактом.
			4. От программиста требуется задать groupId, artifactId и version
			5. Сборка осуществляется командой mvn compile
			6. Скомпилированный java код выглядит так же, как исходный код, но вместо файлов с расширением java, там будут файлы с расширением class.
			7. Запустить скомпилированную программу можно командой mvn exec:java -Dexec.mainClass="com.app.HelloWorld"
		*/


		/*
		λ mvn compile
		[INFO] Scanning for projects...
		[INFO]
		[INFO] ------------------------------------------------------------------------
		[INFO] Building hello-world 1.0-SNAPSHOT
		[INFO] ------------------------------------------------------------------------
		[INFO]
		[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ hello-world ---
		[INFO] Using 'UTF-8' encoding to copy filtered resources.
		[INFO] skip non existing resourceDirectory d:\github\maven\maven-tutorial\testproject\src\main\resources
		[INFO]
		[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ hello-world ---
		[INFO] Changes detected - recompiling the module!
		[INFO] Compiling 1 source file to d:\github\maven\maven-tutorial\testproject\target\classes
		[INFO] ------------------------------------------------------------------------
		[INFO] BUILD SUCCESS
		[INFO] ------------------------------------------------------------------------
		[INFO] Total time: 1.379 s
		[INFO] Finished at: 2017-12-18T16:33:59+02:00
		[INFO] Final Memory: 13M/208M
		[INFO] ------------------------------------------------------------------------

		d:\github\maven\maven-tutorial\testproject (master)
		λ mvn exec:java -Dexec.mainClass="com.app.HelloWorld"
		[INFO] Scanning for projects...
		[INFO]
		[INFO] ------------------------------------------------------------------------
		[INFO] Building hello-world 1.0-SNAPSHOT
		[INFO] ------------------------------------------------------------------------
		[INFO]
		[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ hello-world ---
		Hello, my Happy Super World
		[INFO] ------------------------------------------------------------------------
		[INFO] BUILD SUCCESS
		[INFO] ------------------------------------------------------------------------
		[INFO] Total time: 0.772 s
		[INFO] Finished at: 2017-12-18T16:34:06+02:00
		[INFO] Final Memory: 9M/245M
		[INFO] ------------------------------------------------------------------------
		*/

	}
}

