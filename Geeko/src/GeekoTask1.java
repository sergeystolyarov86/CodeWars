public class GeekoTask1 {

        public static boolean isValid(String s) {
            int count=0;
            char [] chars=s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]=='.') count++;
                if( !Character.isDigit(chars[i]) && chars[i]!='.') return false;
            }
            if(count!=3) return false;
            return true;
        }

    }
