public class Main {
    public static void main(String[] args) {
        int numeroIf = -3;

        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo");
        }
        else if(numeroIf == 0){
            System.out.println("El número es 0");
        }
        else {
            System.out.println("El número " + numeroIf + " es negativo");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("En la condición While el número es " + numeroWhile);
        }

        numeroWhile = 0;

        do{
            numeroWhile++;
            System.out.println("En la condición do-while el número es " + numeroWhile);
        } while(numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("En la condición For el número es " + numeroFor);
        }

        String estación = "primavera";

        switch (estación){
            case "primavera":
                System.out.println("La estación es " + estación);
                break;
            case "verano":
                System.out.println("La estación es " + estación);
                break;
            case "otoño":
                System.out.println("La estación es " + estación);
                break;
            case "invierno":
                System.out.println("La estación es " + estación);
                break;
            default:
                System.out.println("No existe ninguna estación con nombre " + estación);
                break;
        }
    }
}