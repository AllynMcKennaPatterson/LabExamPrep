package ie.atu;

public class Business {

    private String name;
    private String address;
    private long id;

    public Business(String name, String address, long id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must have at least 3 characters");
        };
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.length() >= 6){
            this.address = address;
        }
        else{
            throw new IllegalArgumentException("Address must have at least 6 characters");
        }

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id >= 0){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Id must be a positive number");
        }
    }
}
