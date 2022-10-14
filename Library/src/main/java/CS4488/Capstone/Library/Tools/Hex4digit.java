/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CS4488.Capstone.Library.Tools;

import CS4488.Capstone.Library.BackEndSystemInterfaces.HexDataClass;


import static CS4488.Capstone.Library.Tools.HexadecimalConverter.*;

/**
 * Hex4Digit
 *
 * A class that holds a char[4] that represents a 4 digit hexadecimal number.
 * Contains various utilities for conversions.
 * @version 1.0
 * @author Traae
 */
public class Hex4digit implements HexDataClass {
    // Instance Variables
    private short hex;

    // Constructors
    public Hex4digit(){
        hex = 0;
    }
    public Hex4digit(char[] value){
        hex = hexToDecimal(value);
    }
    public Hex4digit(short value){
        hex = value;
    }

    // Setters
    @Override
    public void setValue(Short number) {
        hex = number;
    }
    @Override
    public void setValue(String number) {
        hex = HexadecimalConverter.hexToDecimal(number.toCharArray());
    }
    public void setValue(char[] number) {
        hex = HexadecimalConverter.hexToDecimal(number);
    }

    public void setFirst(char first) {
        char[] change = HexadecimalConverter.makeBlankChar5();
        change[1] = first;
        hex = HexadecimalConverter.hexToDecimal(change);
    }
    public void setSecond(char second) {
        char[] change = HexadecimalConverter.makeBlankChar5();
        change[2] = second;
        hex = HexadecimalConverter.hexToDecimal(change);
    }
    public void setThird(char third) {
        char[] change = HexadecimalConverter.makeBlankChar5();
        change[3] = third;
        hex = HexadecimalConverter.hexToDecimal(change);
    }
    public void setFourth(char fourth) {
        char[] change = HexadecimalConverter.makeBlankChar5();
        change[4] = fourth;
        hex = HexadecimalConverter.hexToDecimal(change);
    }

    // GETTERS
    public boolean isPositive(){
        return (hex >= 0);
    }
    public char getSign(){
        char result = '-';
        if (this.isPositive()){
            result = '+';
        }
        return result;
    }
    public char getFirst(){
        return HexadecimalConverter.decimalToHex(hex)[1];
    }
    public char getSecond(){
        return HexadecimalConverter.decimalToHex(hex)[2];
    }
    public char getThird(){
        return HexadecimalConverter.decimalToHex(hex)[3];
    }
    public char getFourth(){
        return HexadecimalConverter.decimalToHex(hex)[4];
    }

    @Override
    public Short getShort() {
        return hex;
    }
    @Override
    public char[] getHexChars() {
        String s = new String(HexadecimalConverter.decimalToHex(hex));
        s.replaceAll("[^0-9a-f]", "");
        return s.toCharArray();
    }
    public char[] getSignedHexChars() {
        return HexadecimalConverter.decimalToHex(hex);
    }

    @Override
    public int getMiddle2Value() {
        char[] hexChars = HexadecimalConverter.decimalToHex(hex) ;
        int result = HexadecimalConverter.hexValue(hexChars[2])
                + HexadecimalConverter.hexValue(hexChars[3]);
        return result;
    }
    @Override
    public int getLast2Value() {
        char[] hexChars = HexadecimalConverter.decimalToHex(hex) ;
        int result = HexadecimalConverter.hexValue(hexChars[3])
                + HexadecimalConverter.hexValue(hexChars[4]);
        return result;
    }
}