package pl.flaaaxxx.springhomeworkweek6.model;

import java.util.Date;

public class Movie {

    private String title;
    private int productionDate;
    private String producent;

    public Movie() {
    }

    public Movie(String title, int productionDate, String producent) {
        this.title = title;
        this.productionDate = productionDate;
        this.producent = producent;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", productionDate=" + productionDate +
                ", producent='" + producent + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }
}
