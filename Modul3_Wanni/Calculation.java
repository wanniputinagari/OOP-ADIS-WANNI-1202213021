package praktikum;

public class Calculation implements Runnable {
    private double r;
    private double s;
    private double area;
    private final double phi = 3.14;
  
    public double getRadius() {
      return r;
    }
  
    public void setRadius(double r) {
      this.r = r;
    }
  
    public double getSide() {
      return s;
    }
  
    public void setSide(double s) {
      this.s = s;
    }
  
    public double getArea() {
      return area;
    }
  
    public void setArea(double area) {
      this.area = area;
    }
  
    public double getPhi() {
      return phi;
    }
  
    // Menu square
    public void setSquare(double s) throws IllegalArgumentException {
      if (s < 1) {
        throw new IllegalArgumentException("\njava.lang.IllegalArgumentException");
      }
      this.area = s * s;
    }
  
    public double getSquare() {
      return this.area;
    }
  
    // Menu Circle
    public void setCircle(double r) throws IllegalArgumentException {
      if (r < 1) {
        throw new IllegalArgumentException("\njava.lang.IllegalArgumentException");
      }
      this.area = phi * r * r;
    }
  
    public double getCircle() {
      return this.area;
    }
  
    // Menu Trapezoid
    public void setTrapezoid(double a, double b, double h) throws IllegalArgumentException {
      if (a < 1 || b < 1 || h < 1) {
        throw new IllegalArgumentException("\njava.lang.IllegalArgumentException");
      }
      this.area = ((a + b) * h) / 2;
    }
  
    public double getTrapezoid() {
      return this.area;
    }
  
    @Override
    public void run() {
      System.out.println("\n====Program will start in====");
      for (int i = 3; i > 0; i--) {
        try {
          System.out.println("Starting with thread "+i);
          Thread.sleep(2000);
        } 
        
        catch (InterruptedException e) {
          System.out.println("Error");
        }
      }
    }
  }
  
