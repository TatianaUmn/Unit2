import org.junit.jupiter.api.Test;

import com.example.Car;
import com.example.Motorcycle;
import com.example.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class VehicleTest {
    // �������� ����, ��� ��������� ������� Car ����� �������� ����������� ������������� ��������; (instanceof)
    @Test
    public void testCarIsInstanceOf() {
        Car car = new Car("Nissan", "Qashqai", 2019);
        assertTrue(car instanceof Vehicle);
    };

    // �������� ����, ������ Car ��������� � 4-�� ��������
    @Test
    public void WheelsCar() {
        Car car = new Car("Nissan", "Qashqai", 2019);
        assertThat (car.getNumWheels()).isEqualTo(4);
    }

   // �������� ����, ������ Motorcycle ��������� � 2-�� ��������
    @Test
    public void WheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CB400", 2022);
        assertThat (motorcycle.getNumWheels()).isEqualTo(2);
    }

    //�������� ����, ������ Car ��������� �������� 60 � ������ ��������� �������� (testDrive())
    @Test
    public void testDriveCar(){
        Car car = new Car("Nissan", "Qashqai", 2019);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // �������� ����, ������ Motorcycle ��������� �������� 75 � ������ ��������� �������� (testDrive())
    @Test
    public void testDriveMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Honda", "CB400", 2022);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // ���������, ��� � ������ �������� (������� testDrive, ����� park,
    // �.� �������� �������� ����������) ������ ��������������� (speed = 0)
    @Test
    public void SpeedPakrCar(){
        Car car = new Car("Nissan", "Qashqai", 2019);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // ���������, ��� � ������ �������� (������� testDrive, ����� park
    // �.� �������� �������� ����������) �������� ��������������� (speed = 0)
    @Test
    public void SpeedPakrMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Honda", "CB400", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
