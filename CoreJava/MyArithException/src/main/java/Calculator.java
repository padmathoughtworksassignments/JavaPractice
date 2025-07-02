
//package MyArithException;


public class Calculator
{
    double calculatePower2(int input)
    {
        try
        {
            if (input == 0) {
                throw new ZeroException("Zero not allowed");
            }
            else if (input < 0) {
                throw new NegativeException("Negative not allowed");
            }
        }
    }
}
