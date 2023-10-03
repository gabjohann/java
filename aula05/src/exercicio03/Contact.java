package exercicio03;

public class Contact {
    private String name;
    private String phoneNumber;
    private String address;
    private String area;

    public Contact(String name, String phoneNumber, String address, String area) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nNúmero de Telefone: " + phoneNumber + "\nEndereço: " + address + "\nLocalidade: " + area;
    }
}
