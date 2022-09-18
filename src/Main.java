public class Main {
    public static void main(String[] args) {

        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());

        Dog[] myDogs = new Dog[5];
        for (int i  = 0; i < myDogs.length; i++){
            myDogs[i] = new Dog();
        }
        int x = 0;
        while (true){
            myDogs[x].bark();
            x += 1;
            if (x == myDogs.length){
                break;
            }
        }

        String [] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        int y = 0;
        int ref;

        while (y < 4){
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y += 1;
        }

        int countNumber = 0;
        Triangle [] ta = new Triangle[4];
        while (countNumber < 4){
            ta[countNumber] = new Triangle();
            ta[countNumber].height = (countNumber + 1) * 2;
            ta[countNumber].length = countNumber + 4;
            ta[countNumber].setArea();
            System.out.print("triangle " + countNumber + ", area");
            System.out.println(" = " + ta[countNumber].area);
            countNumber += 1;
        }
        int secondCount = countNumber;
        countNumber = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print(" y = " + secondCount);
        System.out.println(", t5 area = "+ t5.area);

    }
}
