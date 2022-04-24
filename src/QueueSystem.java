import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QueueSystem {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        int doctorsNum=0;
        Scanner sc = new Scanner(System.in);
        int patientPosition=0;
        double totalConsultationTime=0;

        System.out.println("Enter number of doctors: ");
        doctorsNum = sc.nextInt();

        System.out.println("...Please enter doctors list...");
        for (int i = 0; i < doctorsNum; i++) {
            System.out.println("...Doctor " + (i + 1)
                    + "...");
            Doctor doctorObject = new Doctor();
            doctorObject.doctorName="Doctor " +i;
            System.out.println("Enter doctor's consultation time: ");
            doctorObject.consultingTime= sc.nextDouble();
            totalConsultationTime+=doctorObject.consultingTime;
            doctors.add(doctorObject);
        }
        System.out.println("Please enter patient's position in queue: ");
        patientPosition=sc.nextInt();

        double averageConsultationTime = totalConsultationTime/doctors.size();
        double patientEstimatedWaitingTime = (averageConsultationTime/doctors.size())*(patientPosition-1);
        System.out.println("The estimated waiting time will be: "+ patientEstimatedWaitingTime);

    }
}
