package OOP1;

public class Fraction {
   int numerator ;
   int denominator;
    public Fraction(int numerator,int denominator){
        if (denominator == 0){
            denominator =1;
        }
       this.numerator = numerator;
       this.denominator = denominator;
       simplfiy();
   }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplfiy();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0){
            return;
        }
        this.denominator = denominator;
        simplfiy();
    }

    public int getDenominator() {
        return denominator;
    }

    private void simplfiy() {
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        System.out.println(numerator+" /"+denominator);
    }

    public void increment() {
        numerator = numerator + denominator;
        simplfiy();
    }

    public void add(Fraction f2) {
        // first fraction in which function is  called
        //second fraction is passed as arguments
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplfiy();
    }
    public static Fraction add(Fraction f1,Fraction f2){
        int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDem = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum,newDem);
        return f3;
    }
}
