public class Pieza {
    private String forma;
    private String color;

    public Pieza (String forma, String color) {
        this.forma = forma;
        this.color = color;
    }
    public double area() {
        return 0.0; /*aquí la verdad no sé por qué pero he probado a
                    poner eso porque en el main está el "Double(1.0)"
                    así que he probado a poner esto en el método double
                    y ha funcionado */
    }

    @Override
    public boolean equals(Object o) {
        Pieza p = (Pieza) o;

        return this.color.equals(p.color) &&
               this.forma.equals(p.forma) &&
               this.area() == p.area();
    }
    public static void main(String[] args) {
        try {
            Pieza p1 = new Pieza("cuadrado","rojo");
            Pieza p2 = new Pieza("cuadrado","rojo");

            @SuppressWarnings("removal")
            Double d = new Double(1.0);

            String k = "Hola";

            boolean b1 = p1.equals(p2);
            boolean b2 = d.equals(k);
            boolean b3 = k.equals(p2);
            boolean b4 = p1.equals(d);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
