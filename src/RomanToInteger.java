/*
PROBLEM: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){
        char[] arr = s.toCharArray();
        int integer = 0;
        for(int i=0;i<arr.length-1;i++){
            switch (arr[i]){
                case 'I':
                    if((arr[i+1]=='V')||(arr[i+1]=='X')){
                        integer-=1;
                    } else integer+=1;
                    break;
                case 'V':
                    integer+=5;
                    break;
                case 'X':
                    if((arr[i+1]=='L')||(arr[i+1]=='C')){
                        integer-=10;
                    } else integer+=10;
                    break;
                case 'L':
                    integer+=50;
                    break;
                case 'C':
                    if((arr[i+1]=='D')||(arr[i+1]=='M')){
                        integer-=100;
                    } else integer+=100;
                    break;
                case 'D':
                    integer+=500;
                    break;
                case 'M':
                    integer+=1000;
            }
        }
        switch (arr[arr.length-1]){
            case 'I':
                integer+=1;
                break;
            case 'V':
                integer+=5;
                break;
            case 'X':
                integer+=10;
                break;
            case 'L':
                integer+=50;
                break;
            case 'C':
                integer+=100;
                break;
            case 'D':
                integer+=500;
                break;
            case 'M':
                integer+=1000;
        }
        return integer;
    }
}
