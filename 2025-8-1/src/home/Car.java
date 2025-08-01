package home;

public class Car {
    private String Brand;
    private int Price;
    private String Color;


    public Car() {
    }

    public Car(String Brand, int Price, String Color) {
        this.Brand = Brand;
        this.Price = Price;
        this.Color = Color;
    }

    /**
     * 获取
     * @return Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * 设置
     * @param Brand
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * 获取
     * @return Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * 设置
     * @param Price
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    /**
     * 获取
     * @return Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * 设置
     * @param Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }


}
