package Profiles;

import java.util.UUID;

public abstract class Employer implements IEmployer {
    private String firstName;
    private String secondName;
    private UUID id;

    public Employer(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = UUID.randomUUID();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public UUID getID() {
        return id;
    }

}
