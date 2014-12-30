FB	= fizzbuzz.java

all : fizzbuzz

fizzbuzz : fizzbuzz.class
	echo Main-class: fizzbuzz >Manifest
	jar cvfm fizzbuzz Manifest fizzbuzz.class
	- rm Manifest
	chmod +x fizzbuzz

fizzbuzz.class : ${FB}
	javac ${FB}
