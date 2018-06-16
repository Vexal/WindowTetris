# Makefile for Window Tetris

all: windowtetris.jar
windowtetris.jar:	Driver.class  MainRunner.class  WindowBlock.class
	jar -0cvfe windowtetris.jar Driver Driver.class  MainRunner.class  WindowBlock.class
Driver.class:
	javac -verbose -g Driver.java
MainRunner.class:
	javac -verbose -g MainRunner.java
WindowBlock.class:
	javac -verbose -g WindowBlock.java
clean:
	rm -fv *.class *.jar
