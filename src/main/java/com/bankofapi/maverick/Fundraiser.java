package com.bankofapi.maverick;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Fundraiser {

    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private long amount;
    @Getter
    @Setter
    private long amountCollected;

    @Override
    public String toString() {
        return "Fundraiser [id=" + id + ", name=" + description + ", amount=" + amount
                + ", amountCollected=" + amountCollected + "]";
    }
}
