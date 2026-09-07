public class string {
    public static void main(String[] args) {

        // trim methode / removing all space from string

        // String name = "   Muskan   ";
        // System.out.println(name.length());
        // name = name.trim();
        // System.out.println(name.length());
        //System.out.println(name);


        // printing character of a string...

        // String str = "Yadav";
        // for(int i=0; i<str.length(); i++){
        //     System.out.println(str.charAt(i));
        // }

        
        // count length of string without length()

        // String str = "Yadav";
        // int count=0;
        // for (int i = 0; i < str.length(); i++) {
        //     count+=1;
        // }
        // System.out.println("length of string is " + count);


        // consonants in string'''
    //     String str = "My name is Muskan";
    //     int count = 0;
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)!='a' || str.charAt(i)!='A' || str.charAt(i)!='e' || str.charAt(i)!='E'
    //          ||str.charAt(i)!='o' || str.charAt(i)!='O' || str.charAt(i)!='u' || str.charAt(i)!='U'
    //          || str.charAt(i)!='i' || str.charAt(i)!='I' ){
    //             count+=1;
    //         }
    //     }
    //     System.out.println(count);

        // reverse a string.. + check palindrom or not
        // String str = "madam";
        // String rev = "";
        // for(int i=str.length()-1; i>=0; i--){
        //     rev+=str.charAt(i);
        // }
        // System.out.println(rev);
        // if(str.equalsIgnoreCase(rev)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("not a palindrome");
        // }


        // convert string to upercase without using method..
        // String str = "Yadav";
        // String upper = "";
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch>='a' && ch<='z'){
        //         char ch2 = (char)(ch-32);
        //         upper+=ch2;
        //     }else{
        //         upper+=ch;
        //     }
        // }
        // System.out.println(upper);


        // frequency of character in string : count of that char in that string is it's frequency..
        // String str = "Yadav";
        // char ch = 'a';
        // int count = 0;
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i)==ch){
        //         count++;
        //     }
        // }
        // System.out.println("frequency of a is " + count);


        // cheach if string only conatins digits
        String str = "122344";
        boolean isInteger = true;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch<'0' && ch>'9'){
                isInteger= false;
                break;
            }
        }
        if(isInteger==true){
            System.out.println("String contains integers only");
        }else{
            System.out.println("string conatins other characters also");
        }


        //count words in a string ->- split method

        // String str = "My name is Muskan";
        // String[] words = str.split(" ");
        // int count = 0;
        // for(String word : words){
        //     count++;
        // }
        // System.out.println("total words in given string is " + count);

    }
}
