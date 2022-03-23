package ru.tn.courses.vbykov.v1.task3;

public class Integer {
    private final int value;
    public final static int MAX_VALUE = 0x7fffffff;
    public final static int MIN_VALUE = 0x80000000;
    public int getValue() {
        return this.value;
    }
    public Integer() {
        this.value = 0;
    }
    public Integer(int x) {
        this.value = x;
    }
    public Integer(String s) throws RuntimeException {
        if (s == null) {
            throw new RuntimeException();
        }
        this.value = parseInt(s);
    }
    private int parseInt(String s) throws RuntimeException {
        int x = 0;
        int f = 1;
        byte[] bytes = s.getBytes();
        int i = 0;
        if (bytes[i] == '-') {
            i++;
            f = -1;
        }
        while (i < bytes.length) {
            if (bytes[i] >= '0' && bytes[i] <= '9') {
                if (((long) x * 10 + bytes[i] - '0') > MAX_VALUE) {
                    throw new RuntimeException("выход за границы");
                }
                x = x * 10 + bytes[i++] - '0';
            } else {
                throw new RuntimeException();
            }
        }
        return x * f;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
    public boolean equals(Object o) {
        if (o instanceof Integer) {
            return value == ((Integer) o).getValue();
        }
        return false;
    }
    public int hashCode() {
        return this.value;
    }
    public Integer add(Integer i) {
        if (((long) this.value + i.getValue()) > MAX_VALUE) {
            throw new RuntimeException("выход за пределы");
        }
        return new Integer(this.value + i.getValue());
    }
    public Integer diff(Integer i) {
        if (((long) this.value - i.getValue()) < MIN_VALUE) {
            throw new RuntimeException("выход за пределы");
        }
        return new Integer(this.value - i.getValue());
    }
    public Integer mult(Integer i) {
        if (((long) this.value * i.getValue()) > MAX_VALUE) {
            throw new RuntimeException("выход за пределы");
        }
        return new Integer(this.value * i.getValue());
    }
    public Integer div(Integer i) {
        if (i.getValue() == 0) {
            throw new RuntimeException("на ноль делить нельзя...");
        }
        return new Integer(this.value / i.getValue());
    }
    public Integer mod(Integer i) {
        if (i.getValue() == 0) {
            throw new RuntimeException("деление на ноль");
        }
        return new Integer(this.value % i.getValue());
    }
    public Integer pow(int exponent) {
        if (exponent == 1) {
            return this;
        }
        if (exponent == 0) {
            return new Integer(1);
        }
        int x = this.value;
        for (int i = 1; i < exponent; i++) {
            if (((long) x * value) > MAX_VALUE) {
                throw new RuntimeException("выход за пределы");
            }
            x *= value;
        }
        return new Integer(x);
    }
    public String toOctalString() {
        String s = "";
        int x = this.value;
        while (x > 0) {
            s = (char) ((x % 8) + '0') + s;
            x /= 8;
        }
        return s;
    }
    public String toHexString() {
        String s = "";
        int x = this.value;
        while (x > 0) {
            if (x % 16 > 9) {
                s = (char) ((x % 16) + 'A' - 10) + s;
            } else {
                s = (char) ((x % 16) + '0') + s;
            }
            x /= 16;
        }
        return s;
    }
}
