public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        Termostato termostato = new Termostato();
        PantallaLCD pantallaLCD = new PantallaLCD();

        sensor.addSubscriptor(aireAcondicionado);
        sensor.addSubscriptor(termostato);
        sensor.addSubscriptor(pantallaLCD);

        for (int i=0; i<10; i++) {
            System.out.println("========================================================");
            int t = (int) (Math.random()*100);
            sensor.lectura(t);
        }
    }
}
