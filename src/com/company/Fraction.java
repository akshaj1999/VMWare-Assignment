package com.company;

public class Fraction {
    private long x;
    private long y;

    public Fraction(long x,long y)
    {
        reduce(x,y);
    }
    public Fraction(long x, long y, long a)
    {
        reduce( ((a*y)+x), y);
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }
    long gcd(long x, long y)
    {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
    public void reduce(long x, long y)
    {
        long d;
        d = gcd(x, y);

        x = x / d;
        y = y / d;

        setX(x);
        setY(y);
    }
    public void multiply(Fraction f2)
    {
        reduce((this.getX()*f2.getX()) , (this.getY() * f2.getY()));
    }

}
