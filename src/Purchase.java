/**
 * Created by Asus on 11.02.2017.
 */
public class Purchase {

    private String name;
    private String nameProduct;
    private int cost;

    public Purchase(String name, String nameProduct, int cost) {
        this.name = name;
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        if (cost != purchase.cost) return false;
        if (!name.equals(purchase.name)) return false;
        return nameProduct.equals(purchase.nameProduct);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + nameProduct.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", cost=" + cost +
                '}';
    }
}
