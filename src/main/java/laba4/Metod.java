package laba4;

public class Metod {
    class Derevo {
        char letter;
        Derevo right = null;
        Derevo down = null;
    }

    Derevo start;

    Metod() {
        this.start = new Derevo();
    }

    public boolean res = false;

    public void addEnd(char[] word) {
        Derevo p = this.start;
        int i = 0;
        while (i < word.length) {
            if (word[i] == p.letter) {
                p = p.down;
            } else {
                if (null != p.right) {
                    p = p.right;
                    i--;
                } else {
                    p.right = new Derevo();
                    p = p.right;
                    p.letter = word[i];
                    while (i < word.length - 1) {
                        i++;
                        p.down = new Derevo();
                        p = p.down;
                        p.letter = word[i];
                    }
                }
            }
            i++;
        }
    }

    public boolean search(char[] word) {
        res = true;
        Derevo p = this.start;
        int i = 0;
        boolean proverka = true;
        while (i < word.length) {
            if (word[i] == p.letter)
                if (null != p.down) {
                    p = p.down;
                } else {
                    proverka = false;
                    break;
                }
            else {
                if (null != p.right) {
                    p = p.right;
                    i--;
                } else {
                    proverka = false;
                    break;
                }
            }
            i++;
        }
        if (!proverka && (i <= word.length) && ('0' != p.letter || '0' != word[i]))
            res = false;
        return res;
    }

    public void del(Derevo p) {
        if (null != p) {
            del(p.right);
            del(p.down);
            p = null;
        }
    }
}