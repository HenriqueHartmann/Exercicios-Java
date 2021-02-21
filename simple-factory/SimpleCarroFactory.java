public class SimpleCarroFactory {

    public Carro createCarro(String type) {
        Carro carro = null;
        if (type.equals("cruze")) {
            carro = new Cruze();
        } else if (type.equals("celta")) {
            carro = new Celta();
        } else if (type.equals("captiva")) {
            carro = new Captiva();
        } else if (type.equals("classic")) {
            carro = new Classic();
        }
        return carro;
    }
}
