package za.ac.cput.domain.bus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BusDetails {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String busNo;
    @Column(name="name")
    private String busName;
    @Column(name = "seats")
    private String busSeats;


    public BusDetails(Builder builder) {
        this.busNo = builder.busNo;
        this.busName = builder.busName;
        this.busSeats = builder.busSeats;
    }

    public String getBusNo() {
        return busNo;
    }

    public String getBusName() {
        return busName;
    }

    public String getBusSeats() {
        return busSeats;
    }

    public static class Builder {
        String busNo, busName, busSeats;

        public Builder busNo(String busNo) {
            this.busNo = busNo;
            return this;
        }
        public Builder busName(String busName) {
            this.busName = busName;
            return this;
        }
        public Builder busSeats(String busSeats) {
            this.busSeats = busSeats;
            return this;
        }

        public BusDetails build()
        {
            return new BusDetails(this);
        }

    }

    @Override
    public String toString() {
        return "BusDetails{" +
                "busNo='" + busNo + '\'' +
                ", busName='" + busName + '\'' +
                ", busSeats='" + busSeats + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusDetails that = (BusDetails) o;
        return busNo.equals(that.busNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busNo);
    }
}
