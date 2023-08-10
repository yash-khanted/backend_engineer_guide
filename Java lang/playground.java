public class playground {
    public static void main(String[] args) {
        ball rubber = new ball();
        rubber.name = "rubber";
        rubber.display();

        ball stumper = new ball();
        
        ball tennis = rubber;
        rubber = stumper;
        stumper = tennis;

        stumper.display();
    }
}


