package be.intecbrussel;

import java.util.Objects;

public class Image {
    private int imageId;
    private String imageUrl;
    private String imageType;

    public Image(int imageId, String imageUrl, String imageType) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.imageType = imageType;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public String toString() {
        return "Images{" +
                "imageId=" + imageId +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageType='" + imageType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(imageUrl, image.imageUrl) && Objects.equals(imageType, image.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrl, imageType);
    }
}