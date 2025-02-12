class Solution {
    public int romanToInt(String s) {
        int newint = 0; 
        StringBuilder sb= new StringBuilder(s);
        
        while(sb.length() != 0)
        {
            System.out.println(sb);
            System.out.println(newint);
            if(sb.length() >= 2)
            {
            if(sb.substring(0,2).equals("IX") || sb.substring(0,2).equals("IV") || sb.substring(0,2).equals("XL") || sb.substring(0,2).equals("XC") || sb.substring(0,2).equals("CD") || sb.substring(0,2).equals("CM"))
            {
            if(sb.substring(0,2).equals("IX"))
                newint+=9;
            else if(sb.substring(0,2).equals("IV"))
                newint+=4;
            else if(sb.substring(0,2).equals("XL"))
                newint+=40;
            else if(sb.substring(0,2).equals("XC"))
                newint+=90;
            else if(sb.substring(0,2).equals("CD"))
                newint+=400;
            else if(sb.substring(0,2).equals("CM"))
                newint+=900;
            sb.deleteCharAt(0);
            sb.deleteCharAt(0);
            System.out.println(newint);
            continue;
            }
            }
            if( sb.charAt(0) == 'M')
            {
                newint +=1000;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0) == 'D')
            {
                newint +=500;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0) == 'C')
            {
                newint += 100;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0) == 'L')
            {
                newint += 50;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0) == 'X')
            {
                newint +=10;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0) == 'V')
            {
                newint +=5;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0) == 'I')
            {
                newint += 1;
                sb.deleteCharAt(0);
            }
            System.out.println(newint);
        }
        return newint;
    }
}