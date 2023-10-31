import racingcar.Car
import racingcar.InputManager
import racingcar.RandomNumCreator

class Cars() {

    fun makeCar()  :List<Car>{
        val inputManager = InputManager()

        // Car 객체 생성 및 이름 설정
        val cars = mutableListOf<Car>()
        for (name in inputManager.readCarName()) {
            val trimmedName = name.trim() // 이름 앞뒤 공백 제거
            val car = Car(trimmedName)
            cars.add(car)
        }
        return cars
    }
}






