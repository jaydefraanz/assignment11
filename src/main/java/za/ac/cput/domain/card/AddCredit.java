package za.ac.cput.domain.card;

import za.ac.cput.domain.bus.BusDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AddCredit extends Card
{
    @Id
    @GeneratedValue
    @Column(name = "amt")
    int amount;


    public AddCredit() {
    }

    public AddCredit(Builder builder) {
        super(builder);
        amount = builder.amount;
    }

    public int getAmount() {
        return amount;
    }

    public static class Builder extends Card.Builder{
        int amount;

        public AddCredit.Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public AddCredit build()
        {
            return new AddCredit(this);
        }
    }

    @Override
    public String toString() {
        return "AddCredit{" +
                "amount=" + amount +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }


}
