package exercicio06;

public class Reserva {
    private String name;
    private String location;
    private long cpf;
    private String checkIn;
    private String checkOut;

    public Reserva(String name, String location, long cpf, String checkIn, String checkOut) {
        this.name = name;
        this.location = location;
        this.cpf = cpf;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + ", Documento: " + getCpf() + ", Local: " + getLocation() + ", Data de ida: " + getCheckIn() + ", Data de retorno: " + getCheckOut();
    }
}
