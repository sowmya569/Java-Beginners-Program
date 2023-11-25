import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the text to be encrypted!");
        String s=ob.next();
        String encrypt=cipher("",s);
        System.out.println("The encrypted text is: "+encrypt);
        System.out.println("Whether you want to decrpyt the text [yes/no]");
        String answer=ob.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("The decrpted text is:"+decrpyt("",encrypt));
        }else{
            System.out.println("Your submission accepted");
        }

                                                //One method(Straight Forward method
//        StringBuilder cipher= new StringBuilder();
//        for(int i=0;i<s.length();i++) {
//          char cip=(char) (s.charAt(i) + 3);
//            cipher.append(cip);
//        }
//        System.out.println(cipher);
//        System.out.println(cipher("",s));
    }
                                            //Recursive Method!
    public static String cipher(String str,String up){
        if(up.isEmpty()){
            return str;
        }
        char ch=up.charAt(0);
       char encrypt=(char)(ch+3);
       str=cipher(str+encrypt,up.substring(1));
        return str;
    }

    public static String decrpyt(String str,String up){
        if(up.isEmpty()){
            return str;
        }
        char ch=up.charAt(0);
        char decrpyted=(char)(ch-3);
        str=decrpyt(str+decrpyted, up.substring(1));
        return str;
    }
}
