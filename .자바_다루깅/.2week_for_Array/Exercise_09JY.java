����   = j  Exercise_09JY  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LExercise_09JY; main ([Ljava/lang/String;)V  java/lang/String  Korean  English  Mathematics  No1  No2  No3  No4 ! [[I # java/util/Scanner	 % ' & java/lang/System ( ) in Ljava/io/InputStream;
 " +  , (Ljava/io/InputStream;)V	 % . / 0 out Ljava/io/PrintStream; 2 java/lang/StringBuilder
  4 5 6 valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 1 8  9 (Ljava/lang/String;)V ; 의 점수를 입력하세요.:
 1 = > ? append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 1 A B C toString ()Ljava/lang/String;
 E G F java/io/PrintStream H 9 println
 E J K 9 print
 " M N O nextInt ()I Q /	 Korean	English	 Mathematics 	 Total 	 Average S 	
 1 U > V (I)Ljava/lang/StringBuilder;
 " X Y  close args [Ljava/lang/String; mock Num grade tot I AVG scanner Ljava/util/Scanner; i j StackMapTable [ 
SourceFile Exercise_09JY.java !               /     *� �    
                    	      *  	  )� YSYSYSL� YSYSYSYSM,�+��  N66� "Y� $� *:6� H� -� 1Y+2� 3� 7:� <� @� D6� � -,2� I-2� LO�,����+����� -P� D6� w-2.-2.`-2.`6l6� -� 1Y,2� 3� 7R� <-2.� TR� <-2.� TR� <-2.� TR� <� TR� <� T� @� D�,����� W�    
   V      	 -  6  9  <  H ! N " j # p $ z % � # � ! � ( � ) � * � + � , )# /( 0    f 
  ) Z [    \ [  - � ] [  6 � ^ !  9 � _ `  < � a `  H � b c  K O d `  m # e `  � ~ e `  f   ' � N  g g g   "  � !� 	� s  h    i