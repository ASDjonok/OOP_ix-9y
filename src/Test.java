import java.util.*;
import java.lang.*;
import java.io.*;


class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String p= "и";
        char S = p.charAt(0);
        Scanner Schar = new Scanner(System.in);
        System.out.print("літера , по якій буде сортування  "+S+"\n");
        System.out.print("Введіть тескт для сортування\n");
        StringBuilder RLine = new StringBuilder(Schar.next());
        StringBuilder NLine= new StringBuilder("");
        int tem;
        String st=" ";
        char ch=st.charAt(0);
        int i3 = 0, lich=0;

        for(int j=0; j<RLine.length(); j++){
            if(RLine.charAt(j)==ch){
                lich++;
            }
        }
        StringBuilder[] words = new StringBuilder[lich];
        for(int j0=0; j0<RLine.length(); j0++){
            if(RLine.charAt(j0)==ch){
                words[i3] = RLine.delete(j0,RLine.length());
                i3++;
            }
        }

        int[] charnum = new int[words.length];
        for (int i=0; i<RLine.length(); i++){
            int Sn = words[i].charAt(S);
            charnum[i]=words[i].delete(Sn,words[i].length()).length();
        }

        tem=0;
        int Len=RLine.length();
        for(int i0=0; i0<RLine.length(); i0++){
            for(int i1=0; i1<Len; i1++){
                if(charnum[i0]>tem){
                    tem=charnum[i0];
                }
            }
            NLine.append(words[tem]);
            for (int g = 2; g < words.length-1; g++) {
                words[g-1] = words[g];
            }
            Len--;
        }
        System.out.print ("Відсортованний текст :"+ NLine);
    }
}
