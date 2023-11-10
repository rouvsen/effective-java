package org.rouvsen.BuilderPattern;

public class Customer {

    private final String name;
    private final String surname;
    private final int age;
    private final String country;

    public Customer(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.country = builder.country;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder {
        private String name;
        private String surname;
        private int age;
        private String country;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }
        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public static void main(String[] args) {
        Customer customer = new Builder()
                .setName("Rouvsen")
                .setCountry("USA")
                .build();

        System.out.println(
                customer.getName() + "\n" + customer.getCountry()
        );
    }
}
