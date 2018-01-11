package code;

public class Fraction
{
    private int num, denom;

    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
    }

    public Fraction(int num)
    {
        this.num = num;
        this.denom = 1;
    }
    public Fraction(Fraction other)
    {
        num = other.num;
        denom = other.denom;
    }


    public String toString()
    {
        return num + " / " + denom;

    }
}
