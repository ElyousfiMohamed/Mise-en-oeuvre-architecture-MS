package ma.enset.customerservice.Dto;

public class CustomerRequestDTO {
    private String id;
    private String name;
    private String email;

    public CustomerRequestDTO() {}

    public CustomerRequestDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public CustomerRequestDTO(String id,String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
