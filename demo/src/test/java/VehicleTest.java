import org.junit.jupiter.api.Test;

import com.example.Car;
import com.example.Motorcycle;
import com.example.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class VehicleTest {
    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOf() {
        Car car = new Car("Nissan", "Qashqai", 2019);
        assertTrue(car instanceof Vehicle);
    };

    // проверка того, объект Car создается с 4-мя колесами
    @Test
    public void WheelsCar() {
        Car car = new Car("Nissan", "Qashqai", 2019);
        assertThat (car.getNumWheels()).isEqualTo(4);
    }

   // проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void WheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CB400", 2022);
        assertThat (motorcycle.getNumWheels()).isEqualTo(2);
    }

    //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testDriveCar(){
        Car car = new Car("Nissan", "Qashqai", 2019);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testDriveMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Honda", "CB400", 2022);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void SpeedPakrCar(){
        Car car = new Car("Nissan", "Qashqai", 2019);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void SpeedPakrMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Honda", "CB400", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
