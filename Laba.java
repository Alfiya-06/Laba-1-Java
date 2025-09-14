public class Laba {
    public double fraction (double x) {
        return x - (int)x;
    }

    public int charToNum (char x){
    return x - '0';
    }

    public boolean is2Digits (int x){
    return x >= 10 && x <= 99 || x <= -10 && x >= -99;
    }

    public boolean isInRange (int a, int b, int num){
    return num >= a && num <= b || num <= a && num >=b;
    }

    public boolean isEqual(int a, int b, int c){
    return a == b && b == c;
    }

    public int abs (int x){
        if (x < 0){
            return -x;
        }else{
            return x;
        }
    }

    public boolean is35 (int x){
        return (x % 3 == 0) ^ (x % 5 == 0);
    }

    public int max3 (int x, int y, int z){
        int max = x;
        if(y > max) max = y;
        if(z > max) max = z;
        return max;
    }

    public int sum2 (int x, int y){
        int sum = x + y;
        if (sum >= 10 && sum <= 19){
            return 20;
        } else {
            return sum;
        }
    }

    public String day (int x){
        switch (x){
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели";
        }
    }

    public String listNums (int x){
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    public String chet (int x){
        String result2 = "";
        for( int i = 0; i <= x; i += 2){
            result2 += i + " ";
        }
        return result2.trim();
    }

    public int numLen (long x){
        if(x == 0) return 1;

        int quantity = 0;
        while (x != 0){
            x = x /10;
            quantity ++;
        }
        return quantity;
    }

    public void square (int x){
        for (int i = 0; i < x; i ++){
            for (int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle (int x){
        for (int line = 1; line <= x; line++){
            for (int space = x - line; space > 0; space --){
                System.out.print(" ");
            }
            for (int j = 1; j <= line; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst (int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
        }

    public int maxAbs (int[] arr){
        int max = 0;

        for ( int i = 0; i < arr.length; i++){
            int num = arr[i];

            if (num < 0){
                num = -num;
            }

            if (num > max){
                max = num;
            }
        }
            return max;
    }

    public int[] reverseBack (int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[arr.length - 1 -i];
        }
        return result;
    }
}



