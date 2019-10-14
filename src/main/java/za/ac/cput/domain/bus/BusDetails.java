package za.ac.cput.domain.bus;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BusDetails {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String busNo;
    @Column(name="Name")
    private String busName;
    @Column(name = "Seats")
    private String busSeats;

    public BusDetails(){}

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

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public void setBusSeats(String busSeats) {
        this.busSeats = busSeats;
    }

    public static class Builder {
        private String busNo, busName, busSeats;

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

        public Builder copy(BusDetails busDetails)
        {
            this.busNo = busDetails.busNo;
            this.busName = busDetails.busName;
            this.busSeats = busDetails.busSeats;
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
