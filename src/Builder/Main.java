package Builder;

public class Main {

    public static void main(String[] args) {

        CarRepair bill = new CarRepairBuilder().repair()
                .addWheel(500)
                .addChair(500)
                .addGear(1500)
                .build();

        System.out.println(bill.repairCost());

    }



}
